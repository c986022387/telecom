package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.com.telecom.domain.FTTB_IP_NGN;

@Repository
public interface FTTB_IP_NGNRepository extends CrudRepository<FTTB_IP_NGN, Integer>, JpaSpecificationExecutor<FTTB_IP_NGN>{
	
	
}
