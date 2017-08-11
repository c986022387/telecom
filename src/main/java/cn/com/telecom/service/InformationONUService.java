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

import cn.com.telecom.domain.InformationONU;
import cn.com.telecom.repository.InformationONURepository;
import cn.com.telecom.util.Utils;

@Service
public class InformationONUService {
	
	@Autowired
	private InformationONURepository informationONURepository;
	
	public Page<InformationONU> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize){
		return this.informationONURepository.findAll(Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize));
	}
	
	/**
	 * 多条件动态查询
	 * @param name	设备名称（模糊）
	 * @param ONUVoiceIP	语音IP
	 * @param SSnodeID	ss节点
	 * @param ascOrDesc	升降序
	 * @param pageIndex	页码
	 * @param pageSize	每页条数
	 * @return
	 */
	public Page<InformationONU> pageAllByMultiple(String name, String ONUVoiceIP, String SSnodeID, String ascOrDesc, Integer pageIndex, Integer pageSize){
		PageRequest pageRequest = Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize);
		//动态生成where语句
		Specification<InformationONU> specifition = getWhereClause(name, ONUVoiceIP, SSnodeID);
		return this.informationONURepository.findAll(specifition, pageRequest);
	}

	/**
	 * 动态生成where语句
	 * @param name
	 * @param ONUVoiceIP
	 * @param SSnodeID
	 * @return
	 */
	private Specification<InformationONU> getWhereClause(final String name, final String ONUVoiceIP, final String SSnodeID) {
		
		return new Specification<InformationONU>() {

			public Predicate toPredicate(Root<InformationONU> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicate = new ArrayList<Predicate>();
				
				//名称模糊查询
				if(name != null && !"".equals(name.trim())){
					predicate.add(cb.like(root.get("name").as(String.class), "%" + name + "%"));
				}
				
				if(ONUVoiceIP != null && !"".equals(ONUVoiceIP.trim())) {
					predicate.add(cb.equal(root.get("ONUVoiceIP").as(String.class), ONUVoiceIP));
				}
				
				if(SSnodeID != null && !"".equals(SSnodeID.trim())) {
					predicate.add(cb.equal(root.get("SSnodeID").as(String.class), SSnodeID));
				}
				
				Predicate[] pre = new Predicate[predicate.size()];
				return query.where(predicate.toArray(pre)).getRestriction();
			}
		};
	}
	
	
}
