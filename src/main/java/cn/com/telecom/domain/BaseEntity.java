/** 
 * File Name：BaseEntity.java
 * 
 * Copyright LD Corporation 2017 
 * All Rights Reserved
 * 
 */ 
package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@SuppressWarnings("serial")
public class BaseEntity implements Serializable {
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 重写hashCode
	 * @return HashCode值
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/**
	 * 相等判断
	 * @param obj 对比对象
	 * @return true表示相等，false表示不相等
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} 
		else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}
	
	/**
	 * 重写toString
	 * @return 返回Json字符串
	 */
	@Override
	public String toString() {
		return id.toString();
	}
}
