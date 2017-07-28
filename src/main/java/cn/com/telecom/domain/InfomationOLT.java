package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OLT")
public class InfomationOLT extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2894134960206656055L;
	
	@Column(name="FTTX属性")
	private String FTTX;
	
	@Column(name="OLT设备名称")
	private String OLTDeviceName;
	
	@Column(name="设备类型")
	private String DeviceType;
	
	@Column(name = "网管VLAN")
	private String ManagementVlan;
	
	@Column(name = "网管IP")
	private String ManagementIP;
	
	@Column(name = "语音VLAN_ID")
	private String VoiceVLANID;
	
	@Column(name = "语音IP网关")
	private String VoiceIPGateway;
	
	@Column(name = "MGC_IP地址")
	private String MGCIP;
	
	@Column(name = "BAC上联IP地址")
	private String BACUplinkIP;
	
	@Column(name = "云总机_语音CVLAN")
	private String CloudOrVoiceCVLAN;
	
	@Column(name = "IPTV_CVLAN")
	private String IPTV_CVLAN;

	public String getFTTX() {
		return FTTX;
	}

	public void setFTTX(String fTTX) {
		FTTX = fTTX;
	}

	public String getOLTDeviceName() {
		return OLTDeviceName;
	}

	public void setOLTDeviceName(String oLTDeviceName) {
		OLTDeviceName = oLTDeviceName;
	}

	public String getDeviceType() {
		return DeviceType;
	}

	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}

	public String getManagementVlan() {
		return ManagementVlan;
	}

	public void setManagementVlan(String managementVlan) {
		ManagementVlan = managementVlan;
	}

	public String getManagementIP() {
		return ManagementIP;
	}

	public void setManagementIP(String managementIP) {
		ManagementIP = managementIP;
	}

	public String getVoiceVLANID() {
		return VoiceVLANID;
	}

	public void setVoiceVLANID(String voiceVLANID) {
		VoiceVLANID = voiceVLANID;
	}

	public String getVoiceIPGateway() {
		return VoiceIPGateway;
	}

	public void setVoiceIPGateway(String voiceIPGateway) {
		VoiceIPGateway = voiceIPGateway;
	}

	public String getMGCIP() {
		return MGCIP;
	}

	public void setMGCIP(String mGCIP) {
		MGCIP = mGCIP;
	}

	public String getBACUplinkIP() {
		return BACUplinkIP;
	}

	public void setBACUplinkIP(String bACUplinkIP) {
		BACUplinkIP = bACUplinkIP;
	}

	public String getCloudOrVoiceCVLAN() {
		return CloudOrVoiceCVLAN;
	}

	public void setCloudOrVoiceCVLAN(String cloudOrVoiceCVLAN) {
		CloudOrVoiceCVLAN = cloudOrVoiceCVLAN;
	}

	public String getIPTV_CVLAN() {
		return IPTV_CVLAN;
	}

	public void setIPTV_CVLAN(String iPTV_CVLAN) {
		IPTV_CVLAN = iPTV_CVLAN;
	}
	
	
	

}
