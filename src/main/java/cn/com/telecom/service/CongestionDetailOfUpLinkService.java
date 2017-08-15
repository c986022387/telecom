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

import cn.com.telecom.domain.CongestionDetailOfUpLink;
import cn.com.telecom.repository.CongestionDetailOfUpLinkRepository;
import cn.com.telecom.util.Utils;

@Service
public class CongestionDetailOfUpLinkService {
	
	@Autowired
	private CongestionDetailOfUpLinkRepository congestionDetailOfUpLinkRepository;
	
	public Page<CongestionDetailOfUpLink> pageAllByMutiple(String ascOrDesc, Integer pageIndex, Integer pageSize, Float maximumBandwidthRatio_Out, Float maximumBandwidthRatio_In){
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		Specification<CongestionDetailOfUpLink> specification = getWhereClause(maximumBandwidthRatio_Out,maximumBandwidthRatio_In);
		return this.congestionDetailOfUpLinkRepository.findAll(specification, pageRequest);
	}

	
	private Specification<CongestionDetailOfUpLink> getWhereClause(final Float maximumBandwidthRatio_Out, final Float maximumBandwidthRatio_In) {
		
		return new Specification<CongestionDetailOfUpLink>() {
			public Predicate toPredicate(Root<CongestionDetailOfUpLink> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(maximumBandwidthRatio_Out != null) {
					list.add(cb.greaterThanOrEqualTo(root.get("maximumBandwidthRatio_Out").as(Float.class), maximumBandwidthRatio_Out));
				}
				if(maximumBandwidthRatio_In != null) {
					list.add(cb.greaterThanOrEqualTo(root.get("maximumBandwidthRatio_In").as(Float.class), maximumBandwidthRatio_In));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
		};
	}
	
}
