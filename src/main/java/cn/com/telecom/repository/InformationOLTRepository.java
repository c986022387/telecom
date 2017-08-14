package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.InformationOLT;

public interface InformationOLTRepository
		extends CrudRepository<InformationOLT, Integer>, JpaSpecificationExecutor<InformationOLT> {

}
