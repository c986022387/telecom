package cn.com.telecom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.CongestionDetailOfPON;

@Repository
public interface CongestionDetailOfPONRepository extends CrudRepository<CongestionDetailOfPON, Integer>{
	
	List<CongestionDetailOfPON> findAll();
	
}
