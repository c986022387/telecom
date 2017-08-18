package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "终端信息报表")
public class InformationOfTerminal extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5577655468248329860L;
	
	
	@Column(name="逻辑ID")//
	private String logicID;
	
	@Column(name="终端唯一标识")//
	private String terminalUniqueIdentifier;
	
	@Column(name = "厂家")
	private String manufacturer;
	
	@Column(name = "设备类型")
	private String typeOfDevice;
	
	@Column(name = "软件版本")//
	private String versionOfSoftware;
	
	@Column(name = "入网时间")
	private String latestRegistrationTime;
	
	@Column(name = "型号")//
	private String typeNumber;

	public String getLogicID() {
		return logicID;
	}

	public void setLogicID(String logicID) {
		this.logicID = logicID;
	}

	public String getTerminalUniqueIdentifier() {
		return terminalUniqueIdentifier;
	}

	public void setTerminalUniqueIdentifier(String terminalUniqueIdentifier) {
		this.terminalUniqueIdentifier = terminalUniqueIdentifier;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getTypeOfDevice() {
		return typeOfDevice;
	}

	public void setTypeOfDevice(String typeOfDevice) {
		this.typeOfDevice = typeOfDevice;
	}

	public String getVersionOfSoftware() {
		return versionOfSoftware;
	}

	public void setVersionOfSoftware(String versionOfSoftware) {
		this.versionOfSoftware = versionOfSoftware;
	}

	public String getLatestRegistrationTime() {
		return latestRegistrationTime;
	}

	public void setLatestRegistrationTime(String latestRegistrationTime) {
		this.latestRegistrationTime = latestRegistrationTime;
	}

	public String getTypeNumber() {
		return typeNumber;
	}

	public void setTypeNumber(String typeNumber) {
		this.typeNumber = typeNumber;
	}
	
}

