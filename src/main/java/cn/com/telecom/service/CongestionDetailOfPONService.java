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

import cn.com.telecom.domain.CongestionDetailOfPON;
import cn.com.telecom.repository.CongestionDetailOfPONRepository;
import cn.com.telecom.util.Utils;

@Service
public class CongestionDetailOfPONService {
	
	@Autowired
	private CongestionDetailOfPONRepository congestionDetailOfPONRepository;
	
	public Page<CongestionDetailOfPON> pageAllByMutiple(String ascOrDesc, Integer pageIndex, Integer pageSize, Float maximumBandwidthRatio_Out, Float maximumBandwidthRatio_In){
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		Specification<CongestionDetailOfPON> specification = getWhereClause(maximumBandwidthRatio_Out,maximumBandwidthRatio_In);
		return this.congestionDetailOfPONRepository.findAll(specification, pageRequest);
	}

	
	private Specification<CongestionDetailOfPON> getWhereClause(final Float maximumBandwidthRatio_Out, final Float maximumBandwidthRatio_In) {
		
		return new Specification<CongestionDetailOfPON>() {
			public Predicate toPredicate(Root<CongestionDetailOfPON> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(maximumBandwidthRatio_Out != null) {
					list.add(cb.greaterThan(root.get("maximumBandwidthRatio_Out").as(Float.class), maximumBandwidthRatio_Out));
				}
				if(maximumBandwidthRatio_In != null) {
					list.add(cb.greaterThan(root.get("maximumBandwidthRatio_In").as(Float.class), maximumBandwidthRatio_In));
				}
				Predicate[] predicate = new Predicate[list.size()];
				return query.where(list.toArray(predicate)).getRestriction();
			}
		};
	}
	
}
