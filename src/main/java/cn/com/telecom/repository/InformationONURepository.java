package cn.com.telecom.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.InformationONU;

public interface InformationONURepository extends CrudRepository<InformationONU, Integer>, JpaSpecificationExecutor<InformationONU>{
	
	Page<InformationONU> findAll(Pageable pageable);
	
}
