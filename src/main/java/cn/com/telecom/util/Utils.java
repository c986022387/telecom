package cn.com.telecom.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class Utils {

	/**
	 * 
	 * @param ascOrDesc 升序还是降序
	 * @param orderBy 要排序的字段
	 * @param pageIndex 页码
	 * @param pageSize 每页数量
	 * @return
	 */
	public static PageRequest getPageRequest(String ascOrDesc, String orderBy, Integer pageIndex, Integer pageSize ) {
		Sort sort = ascOrDesc.equals("asc") ? new Sort(Sort.Direction.ASC,orderBy) : new Sort(Sort.Direction.DESC,orderBy);
		//页码从0开始，在这里统一减一页就好
		return new PageRequest(pageIndex - 1, pageSize, sort);
	}
	
	
}
