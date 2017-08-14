package cn.com.telecom.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.com.telecom.domain.InformationPON;
import cn.com.telecom.repository.InformationPONRepository;
import cn.com.telecom.util.Utils;;

@Service
public class InformationPONService {

	@Autowired
	private InformationPONRepository InformationPONRepository;

	public Page<InformationPON> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String devicceName, String sVlan) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<InformationPON> specification = getWhereClause(devicceName, sVlan);
		//System.out.println(specification);
		return this.InformationPONRepository.findAll(specification, pageRequest);
	}

	
	private Specification<InformationPON> getWhereClause(final String devicceName, final String sVlan) {
		
		return new Specification<InformationPON>() {

			public Predicate toPredicate(Root<InformationPON> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(devicceName != null && !"".equals(devicceName.trim())) {
					list.add(cb.like(root.get("deviceName").as(String.class), "%" + devicceName + "%"));
				}
				if(sVlan != null && !"".equals(sVlan.trim())) {
					list.add(cb.equal(root.get("sVlan").as(String.class), sVlan ));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
			
		};
	}
}
