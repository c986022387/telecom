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
	private String DeviceName;
	
	@Column(name="槽道顺序号")
	private String SequenceNumber;
	
	@Column(name="_0")
	private String Zero;
	
	@Column(name = "svlan")
	private String SVlan;
	
	@Column(name = "cvlan")
	private String CVlan;
	
	@Column(name = "bas服务器ip")
	private String BasServerIP;
	
	@Column(name = "nas槽位")
	private String NasSlot;
	
	@Column(name = "nas子槽")
	private String NasSonSlot;
	
	@Column(name = "nas端口")
	private String NasPort;
	
	@Column(name = "更新日期")
	private String UpdateDate;

	public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public String getSequenceNumber() {
		return SequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		SequenceNumber = sequenceNumber;
	}

	public String getZero() {
		return Zero;
	}

	public void setZero(String zero) {
		Zero = zero;
	}

	public String getSVlan() {
		return SVlan;
	}

	public void setSVlan(String sVlan) {
		SVlan = sVlan;
	}

	public String getCVlan() {
		return CVlan;
	}

	public void setCVlan(String cVlan) {
		CVlan = cVlan;
	}

	public String getBasServerIP() {
		return BasServerIP;
	}

	public void setBasServerIP(String basServerIP) {
		BasServerIP = basServerIP;
	}

	public String getNasSlot() {
		return NasSlot;
	}

	public void setNasSlot(String nasSlot) {
		NasSlot = nasSlot;
	}

	public String getNasSonSlot() {
		return NasSonSlot;
	}

	public void setNasSonSlot(String nasSonSlot) {
		NasSonSlot = nasSonSlot;
	}

	public String getNasPort() {
		return NasPort;
	}

	public void setNasPort(String nasPort) {
		NasPort = nasPort;
	}

	public String getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(String updateDate) {
		UpdateDate = updateDate;
	}
	
	
	
}
