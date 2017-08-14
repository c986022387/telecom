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

import cn.com.telecom.domain.InformationFTTH_IP;
import cn.com.telecom.repository.InformationFTTH_IPRepository;
import cn.com.telecom.util.Utils;;

@Service
public class InformationFTTH_IPService {

	@Autowired
	private InformationFTTH_IPRepository InformationFTTH_IPRepository;

	public Page<InformationFTTH_IP> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String olt) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<InformationFTTH_IP> specification = getWhereClause(olt);
		//System.out.println(specification);
		return this.InformationFTTH_IPRepository.findAll(specification, pageRequest);
	}

	
	private Specification<InformationFTTH_IP> getWhereClause(final String olt) {
		
		return new Specification<InformationFTTH_IP>() {

			public Predicate toPredicate(Root<InformationFTTH_IP> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(olt != null && !"".equals(olt.trim())) {
					list.add(cb.like(root.get("OLT").as(String.class), "%" + olt + "%"));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
			
		};
	}
}
