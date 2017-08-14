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

import cn.com.telecom.domain.FTTB_IP_NGN;
import cn.com.telecom.repository.FTTB_IP_NGNRepository;
import cn.com.telecom.util.Utils;;

@Service
public class FTTB_IP_NGNService {

	@Autowired
	private FTTB_IP_NGNRepository FTTB_IP_NGNRepository;

	public Page<FTTB_IP_NGN> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String olt) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<FTTB_IP_NGN> specification = getWhereClause(olt);
		return this.FTTB_IP_NGNRepository.findAll(specification, pageRequest);
	}

	
	private Specification<FTTB_IP_NGN> getWhereClause(final String olt) {
		
		return new Specification<FTTB_IP_NGN>() {

			public Predicate toPredicate(Root<FTTB_IP_NGN> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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
