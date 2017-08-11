package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.FTTB_IP_IMS;

public interface FTTB_IP_IMSRepository
		extends CrudRepository<FTTB_IP_IMS, Integer>, JpaSpecificationExecutor<FTTB_IP_IMS> {

}
