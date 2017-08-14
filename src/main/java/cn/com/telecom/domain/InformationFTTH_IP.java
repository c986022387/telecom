package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "FTTH_IP")
public class InformationFTTH_IP extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2894134960206656055L;
	
	@Column(name="IP")
	private String IP;
	
	@Column(name="IP网关")
	private String IPGateway;
	
	@Column(name="掩码")
	private String Mask;
	
	@Column(name = "语音VLAN_ID")
	private String VoiceVLAN_ID;
	
	@Column(name = "OLT")
	private String OLT;
	
	@Column(name = "网关簇")
	private String GatewayCluster;
	
	@Column(name = "节点号")
	private String NodeID;

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getIPGateway() {
		return IPGateway;
	}

	public void setIPGateway(String iPGateway) {
		IPGateway = iPGateway;
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

	public String getGatewayCluster() {
		return GatewayCluster;
	}

	public void setGatewayCluster(String gatewayCluster) {
		GatewayCluster = gatewayCluster;
	}

	public String getNodeID() {
		return NodeID;
	}

	public void setNodeID(String nodeID) {
		NodeID = nodeID;
	}
	
	

}
