package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "江门ONU集成表")
public class InformationONU extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6226659865592484263L;

	/**
	 * 
	 */

	@Column(name="安装地点")
	private String InstallationPlace;
	
	@Column(name="设备型号")
	private String DeviceID;
	
	@Column(name="网管VN")
	private String ManagerVN;
	
	@Column(name = "网管IP")
	private String ManagerIP;
	
	@Column(name = "OLT设备")
	private String OLTDevice;
	
	@Column(name = "OLT端口")
	private String OLTPort;
	
	@Column(name = "ONU编号")
	private String ONUID;
	
	@Column(name = "MAC地址")
	private String MAC;
	
	@Column(name = "数据端口")
	private String DataPort;
	
	@Column(name = "语音端口")
	private String VoicePort;
	
	@Column(name = "SVLAN")
	private String SVLAN;
	
	@Column(name = "CVLAN")
	private String CVLAN;
	
	@Column(name = "语音VLAN_ID")
	private String VoiceVLANID;
	
	@Column(name = "ONU语音IP",unique = true)
	private String ONUVoiceIP;
	
	@Column(name = "ONU_IP的掩码")
	private String ONUIPMask;
	
	@Column(name = "ONU_IP的网关")
	private String ONUIPGateway;
	
	@Column(name = "网关簇")
	private String GatewayCluster;
	
	@Column(name = "SS节点号")
	private String SSnodeID;
	
	@Column(name = "灾备节点号")
	private String drnodeID;
	
	@Column(name = "分光器")
	private String Lightsplitter;
	
	@Column(name = "规划日期")
	private String planDate;
	
	@Column(name = "开通日期")
	private String starDate;
	
	@Column(name = "更新日期")
	private String updateDate;

	public String getInstallationPlace() {
		return InstallationPlace;
	}

	public void setInstallationPlace(String installationPlace) {
		InstallationPlace = installationPlace;
	}

	public String getDeviceID() {
		return DeviceID;
	}

	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}

	public String getManagerVPN() {
		return ManagerVN;
	}

	public void setManagerVN(String managerVPN) {
		ManagerVN = managerVPN;
	}

	public String getManagerIP() {
		return ManagerIP;
	}

	public void setManagerIP(String managerIP) {
		ManagerIP = managerIP;
	}

	public String getOLTDevice() {
		return OLTDevice;
	}

	public void setOLTDevice(String oLTDevice) {
		OLTDevice = oLTDevice;
	}

	public String getOLTPort() {
		return OLTPort;
	}

	public void setOLTPort(String oLTPort) {
		OLTPort = oLTPort;
	}

	public String getONUID() {
		return ONUID;
	}

	public void setONUID(String oNUID) {
		ONUID = oNUID;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public String getDataPort() {
		return DataPort;
	}

	public void setDataPort(String dataPort) {
		DataPort = dataPort;
	}

	public String getVoicePort() {
		return VoicePort;
	}

	public void setVoicePort(String voicePort) {
		VoicePort = voicePort;
	}

	public String getSVLAN() {
		return SVLAN;
	}

	public void setSVLAN(String sVLAN) {
		SVLAN = sVLAN;
	}

	public String getCVLAN() {
		return CVLAN;
	}

	public void setCVLAN(String cVLAN) {
		CVLAN = cVLAN;
	}

	public String getVoiceVLANID() {
		return VoiceVLANID;
	}

	public void setVoiceVLANID(String voiceVLANID) {
		VoiceVLANID = voiceVLANID;
	}

	public String getONUVoiceIP() {
		return ONUVoiceIP;
	}

	public void setONUVoiceIP(String oNUVoiceIP) {
		ONUVoiceIP = oNUVoiceIP;
	}

	public String getONUIPMask() {
		return ONUIPMask;
	}

	public void setONUIPMask(String oNUIPMask) {
		ONUIPMask = oNUIPMask;
	}

	public String getONUIPGateway() {
		return ONUIPGateway;
	}

	public void setONUIPGateway(String oNUIPGateway) {
		ONUIPGateway = oNUIPGateway;
	}

	public String getGatewayCluster() {
		return GatewayCluster;
	}

	public void setGatewayCluster(String gatewayCluster) {
		GatewayCluster = gatewayCluster;
	}

	public String getSSnodeID() {
		return SSnodeID;
	}

	public void setSSnodeID(String sSnodeID) {
		SSnodeID = sSnodeID;
	}

	public String getDrnodeID() {
		return drnodeID;
	}

	public void setDrnodeID(String drnodeID) {
		this.drnodeID = drnodeID;
	}

	public String getLightsplitter() {
		return Lightsplitter;
	}

	public void setLightsplitter(String lightsplitter) {
		Lightsplitter = lightsplitter;
	}

	public String getPlanDate() {
		return planDate;
	}

	public void setPlanDate(String planDate) {
		this.planDate = planDate;
	}

	public String getStarDate() {
		return starDate;
	}

	public void setStarDate(String starDate) {
		this.starDate = starDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}
