package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PON")
public class InformationPON extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1896976446263662276L;

	@Column(name="设备名称")
	private String deviceName;
	
	@Column(name="槽道顺序号")
	private String sequenceNumber;
	
	@Column(name="_0")
	private String zero;
	
	@Column(name = "svlan")
	private String sVlan;
	
	@Column(name = "cvlan")
	private String cVlan;
	
	@Column(name = "bas服务器ip")
	private String basServerIP;
	
	@Column(name = "nas槽位")
	private String nasSlot;
	
	@Column(name = "nas子槽")
	private String nasSonSlot;
	
	@Column(name = "nas端口")
	private String nasPort;
	
	@Column(name = "更新日期")
	private String updateDate;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getZero() {
		return zero;
	}

	public void setZero(String zero) {
		this.zero = zero;
	}

	public String getsVlan() {
		return sVlan;
	}

	public void setsVlan(String sVlan) {
		this.sVlan = sVlan;
	}

	public String getcVlan() {
		return cVlan;
	}

	public void setcVlan(String cVlan) {
		this.cVlan = cVlan;
	}

	public String getBasServerIP() {
		return basServerIP;
	}

	public void setBasServerIP(String basServerIP) {
		this.basServerIP = basServerIP;
	}

	public String getNasSlot() {
		return nasSlot;
	}

	public void setNasSlot(String nasSlot) {
		this.nasSlot = nasSlot;
	}

	public String getNasSonSlot() {
		return nasSonSlot;
	}

	public void setNasSonSlot(String nasSonSlot) {
		this.nasSonSlot = nasSonSlot;
	}

	public String getNasPort() {
		return nasPort;
	}

	public void setNasPort(String nasPort) {
		this.nasPort = nasPort;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
	
}
