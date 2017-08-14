package cn.com.telecom.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cn.com.telecom.domain.UP_LINK;

public interface UP_LINKRepository
		extends CrudRepository<UP_LINK, Integer>, JpaSpecificationExecutor<UP_LINK> {

}
