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

import cn.com.telecom.domain.InformationOLT;
import cn.com.telecom.repository.InformationOLTRepository;
import cn.com.telecom.util.Utils;;

@Service
public class InformationOLTService {

	@Autowired
	private InformationOLTRepository InformationOLTRepository;

	public Page<InformationOLT> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String olt) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<InformationOLT> specification = getWhereClause(olt);
		//System.out.println(specification);
		return this.InformationOLTRepository.findAll(specification, pageRequest);
	}

	
	private Specification<InformationOLT> getWhereClause(final String olt) {
		
		return new Specification<InformationOLT>() {

			public Predicate toPredicate(Root<InformationOLT> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(olt != null && !"".equals(olt.trim())) {
					list.add(cb.like(root.get("OLTDeviceName").as(String.class), "%" + olt + "%"));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
			
		};
	}
}
