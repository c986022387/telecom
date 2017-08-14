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

import cn.com.telecom.domain.UP_LINK;
import cn.com.telecom.repository.UP_LINKRepository;
import cn.com.telecom.util.Utils;;

@Service
public class UP_LINKService {

	@Autowired
	private UP_LINKRepository UP_LINKRepository;

	public Page<UP_LINK> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, String oltDeviceName, String serviceType) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<UP_LINK> specification = getWhereClause(oltDeviceName, serviceType);
		//System.out.println(specification);
		return this.UP_LINKRepository.findAll(specification, pageRequest);
	}

	
	private Specification<UP_LINK> getWhereClause(final String oltDeviceName, final String serviceType) {
		
		return new Specification<UP_LINK>() {

			public Predicate toPredicate(Root<UP_LINK> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(oltDeviceName != null && !"".equals(oltDeviceName.trim())) {
					list.add(cb.like(root.get("oltDeviceName").as(String.class), "%" + oltDeviceName + "%"));
				}
				if(serviceType != null && !"".equals(serviceType.trim())) {
					list.add(cb.like(root.get("serviceType").as(String.class), "%" + serviceType + "%"));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
			
		};
	}
}
