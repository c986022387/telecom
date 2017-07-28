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
	
	@Column(name="网管VPN")
	private String ManagerVPN;
	
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
}
