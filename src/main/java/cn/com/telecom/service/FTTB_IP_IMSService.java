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

import cn.com.telecom.domain.FTTB_IP_IMS;
import cn.com.telecom.repository.FTTB_IP_IMSRepository;
import cn.com.telecom.util.Utils;;

@Service
public class FTTB_IP_IMSService {

	@Autowired
	private FTTB_IP_IMSRepository fttb_IP_IMSRepository;

	public Page<FTTB_IP_IMS> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String olt) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<FTTB_IP_IMS> specification = getWhereClause(olt);
		//System.out.println(specification);
		return this.fttb_IP_IMSRepository.findAll(specification, pageRequest);
	}

	
	private Specification<FTTB_IP_IMS> getWhereClause(final String olt) {
		
		return new Specification<FTTB_IP_IMS>() {

			public Predicate toPredicate(Root<FTTB_IP_IMS> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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
