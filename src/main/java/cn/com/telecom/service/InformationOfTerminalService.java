package cn.com.telecom.service;

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
	
	public List<InformationOfTerminal> getAll(){
		return  this.informationOfTerminalRepository.findAll();
	}
	
	/**
	 * 
	 * @param ascOrDesc 升序还是降序
	 * @param orderBy 要排序的字段
	 * @param pageIndex 页码
	 * @param pageSize 每页数量
	 * @return
	 */
	public Page<InformationOfTerminal> findAll(String ascOrDesc, Integer pageIndex, Integer pageSize){
		return this.informationOfTerminalRepository.findAll(Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize));
	}
	
	/**
	 * 多动态查询
	 * @param ascOrDesc
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public Page<InformationOfTerminal> findByMultiple(String ascOrDesc, Integer pageIndex, Integer pageSize){
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成Where语句
		Specification<InformationOfTerminal> specification = getWhereClause();
		Page<InformationOfTerminal> page = this.informationOfTerminalRepository.findAll(specification,pageRequest);
		return page;
	}

	

	
	
	/**
	 * 动态生成where语句
	 * @return
	 */
	private Specification<InformationOfTerminal> getWhereClause(){
		return new Specification<InformationOfTerminal>() {

			public Predicate toPredicate(Root<InformationOfTerminal> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}
	
}
