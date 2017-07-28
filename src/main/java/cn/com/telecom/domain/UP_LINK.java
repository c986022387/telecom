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
	private String OLTDeviceName;
	
	@Column(name="本端端口")
	private String LocalPort;
	
	@Column(name="对端设备")
	private String FieldDevice;
	
	@Column(name = "对端设备端口")
	private String FieldDevicePort;
	
	@Column(name = "业务类型")
	private String ServiceType;

	public String getOLTDeviceName() {
		return OLTDeviceName;
	}

	public void setOLTDeviceName(String oLTDeviceName) {
		OLTDeviceName = oLTDeviceName;
	}

	public String getLocalPort() {
		return LocalPort;
	}

	public void setLocalPort(String localPort) {
		LocalPort = localPort;
	}

	public String getFieldDevice() {
		return FieldDevice;
	}

	public void setFieldDevice(String fieldDevice) {
		FieldDevice = fieldDevice;
	}

	public String getFieldDevicePort() {
		return FieldDevicePort;
	}

	public void setFieldDevicePort(String fieldDevicePort) {
		FieldDevicePort = fieldDevicePort;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	
	
}
