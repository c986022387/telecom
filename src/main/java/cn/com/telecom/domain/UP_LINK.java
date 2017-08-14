package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UP_LINK")
public class UP_LINK extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2817192289594758673L;
	
	@Column(name="OLT设备名称")
	private String oltDeviceName;
	
	@Column(name="本端端口")
	private String localPort;
	
	@Column(name="对端设备")
	private String fieldDevice;
	
	@Column(name = "对端设备端口")
	private String fieldDevicePort;
	
	@Column(name = "业务类型")
	private String serviceType;

	public String getOltDeviceName() {
		return oltDeviceName;
	}

	public void setOltDeviceName(String oltDeviceName) {
		this.oltDeviceName = oltDeviceName;
	}

	public String getLocalPort() {
		return localPort;
	}

	public void setLocalPort(String localPort) {
		this.localPort = localPort;
	}

	public String getFieldDevice() {
		return fieldDevice;
	}

	public void setFieldDevice(String fieldDevice) {
		this.fieldDevice = fieldDevice;
	}

	public String getFieldDevicePort() {
		return fieldDevicePort;
	}

	public void setFieldDevicePort(String fieldDevicePort) {
		this.fieldDevicePort = fieldDevicePort;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
}
