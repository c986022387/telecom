package cn.com.telecom.domain;

import java.io.Serializable;
import java.sql.Date;

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
	
	
	@Column(name="逻辑ID", unique = true)
	private String logicID;
	
	@Column(name="终端唯一标识", unique = true, nullable= false)
	private String terminalUniqueIdentifier;
	
	@Column(name="终端状态")
	private String terminalState;
	
	@Column(name = "域名称")
	private String domainName;
	
	@Column(name = "厂商")
	private String manufacturer;
	
	@Column(name = "设备类型")
	private String typeOfDevice;
	
	@Column(name = "OUI")
	private String OUI;
	
	@Column(name = "硬件版本")
	private String versionOfHardware;
	
	@Column(name = "软件版本")
	private String versionOfSoftware;
	
	@Column(name = "最近注册时间")
	private Date latestRegistrationTime;
	
	@Column(name = "终端IP地址")
	private String addressOfTerminal;
	
	@Column(name = "是否支持WIFI")
	private String isupportWifi;
	
}

