package cn.com.telecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.FTTB_IP_IMS;

@Repository
public interface FTTB_IP_IMSRespository extends CrudRepository<FTTB_IP_IMS, Integer>{
	
	List<FTTB_IP_IMS> findAll();
	
	FTTB_IP_IMS findById(int id);
	
}
