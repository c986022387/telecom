package cn.com.telecom.domain;

import org.springframework.data.domain.Page;

/**
 * 
 * @author 98602
 *
 * @param <T>  表
 */
public class Items<T> {
	
	/**
	 * 页码
	 */
	private Integer pageIndex;
	
	/**
	 * 每页大小
	 */
	private Integer pageSize;
	
	private Page<T> t;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Page<T> getT() {
		return t;
	}

	public void setT(Page<T> t) {
		this.t = t;
	}

	
}
