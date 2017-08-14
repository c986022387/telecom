package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.InformationFTTH_IP;

public interface InformationFTTH_IPRepository
		extends CrudRepository<InformationFTTH_IP, Integer>, JpaSpecificationExecutor<InformationFTTH_IP> {

}
