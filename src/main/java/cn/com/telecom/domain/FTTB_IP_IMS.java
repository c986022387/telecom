package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FTTB_IP_IMS")
public class FTTB_IP_IMS extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4190672020453449365L;

	@Column(name="区域")
	private String Area;
	
	@Column(name="CN2地址段")
	private String CN2Adress;
	
	@Column(name="网关")
	private String Gateway;
	
	@Column(name = "掩码")
	private String Mask;
	
	@Column(name = "语音VLAN_ID")
	private String VoiceVLAN_ID;
	
	@Column(name = "OLT")
	private String OLT;
	
	@Column(name = "分配时间")
	private String AssignTime;

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCN2Adress() {
		return CN2Adress;
	}

	public void setCN2Adress(String cN2Adress) {
		CN2Adress = cN2Adress;
	}

	public String getGateway() {
		return Gateway;
	}

	public void setGateway(String gateway) {
		Gateway = gateway;
	}

	public String getMask() {
		return Mask;
	}

	public void setMask(String mask) {
		Mask = mask;
	}

	public String getVoiceVLAN_ID() {
		return VoiceVLAN_ID;
	}

	public void setVoiceVLAN_ID(String voiceVLAN_ID) {
		VoiceVLAN_ID = voiceVLAN_ID;
	}

	public String getOLT() {
		return OLT;
	}

	public void setOLT(String oLT) {
		OLT = oLT;
	}

	public String getAssignTime() {
		return AssignTime;
	}

	public void setAssignTime(String assignTime) {
		AssignTime = assignTime;
	}
	
	
}
