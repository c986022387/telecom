package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.InformationPON;

public interface InformationPONRepository
		extends CrudRepository<InformationPON, Integer>, JpaSpecificationExecutor<InformationPON> {

}
