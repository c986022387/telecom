package cn.com.telecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.FTTB_IP_NGN;

@Repository
public interface FTTB_IP_NGNRepository extends CrudRepository<FTTB_IP_NGN, Integer>{
	
	List<FTTB_IP_NGN> findAll();
	
}
