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

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.repository.InformationOfTerminalRepository;
import cn.com.telecom.util.Utils;

@Service
public class InformationOfTerminalService {
	
	
	@Autowired
	private InformationOfTerminalRepository informationOfTerminalRepository;
	
	
	public Page<InformationOfTerminal> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize,String logicID, String terminalUniqueIdentifier, String manufacturer, String versionOfSoftware ) {
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<InformationOfTerminal> specification = getWhereClause(logicID,terminalUniqueIdentifier,manufacturer,versionOfSoftware);
		//System.out.println(specification);
		return this.informationOfTerminalRepository.findAll(specification, pageRequest);
	}

	

	
	
	
	private Specification<InformationOfTerminal> getWhereClause(final String logicID,final String terminalUniqueIdentifier,final String typeNumber,final String versionOfSoftware){
		return new Specification<InformationOfTerminal>() {

			public Predicate toPredicate(Root<InformationOfTerminal> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				List<Predicate> predicate = new ArrayList<Predicate>();
				
				if(logicID != null && !"".equals(logicID.trim())){
					predicate.add(cb.like(root.get("logicID").as(String.class), "%" + logicID + "%"));
				}
				
				if(terminalUniqueIdentifier != null && !"".equals(terminalUniqueIdentifier.trim())) {
					predicate.add(cb.like(root.get("terminalUniqueIdentifier").as(String.class), "%"+terminalUniqueIdentifier+"%"));
				}
				
				if(typeNumber != null && !"".equals(typeNumber.trim())) {
					predicate.add(cb.like(root.get("typeNumber").as(String.class), "%"+typeNumber+"%"));
				}
				
				if(versionOfSoftware != null && !"".equals(versionOfSoftware.trim())) {
					predicate.add(cb.like(root.get("versionOfSoftware").as(String.class), "%"+versionOfSoftware+"%"));
				}
				
				Predicate[] pre = new Predicate[predicate.size()];
				return query.where(predicate.toArray(pre)).getRestriction();
			}
			
		};
	}
	
}
