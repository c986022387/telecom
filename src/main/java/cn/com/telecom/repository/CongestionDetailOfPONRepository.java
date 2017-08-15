package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.CongestionDetailOfPON;

@Repository
public interface CongestionDetailOfPONRepository extends CrudRepository<CongestionDetailOfPON, Integer>, JpaSpecificationExecutor<CongestionDetailOfPON>{
	
	
}
