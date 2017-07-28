package cn.com.telecom.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "OLT_PON口拥塞明细表")
public class CongestionDetailOfPON extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8235816919496970631L;
	
	@Column(name = "本地网")
	private String localNet;
	
	@Column(name = "分公司")
	private String branchOffice;
	
	@Column(name = "局向")
	private String bureauDirection;
	
	@Column(name = "IP")
	private String ip;
	
	@Column(name = "设备名称")
	private String nameOfDevice;
	
	@Column(name = "PON_ID")
	private String ponID;
	
	@Column(name = "端口带宽")
	private int portWidth;
	
	@Column(name = "出_平均速率")
	private float averageSpeed_Out;
	
	@Column(name = "出_平均带宽占比")
	private float averageBandwidthRatio_Out;
	
	@Column(name = "出_最大速率")
	private float maximumSpeed_Out;
	
	@Column(name = "出_最大带宽占比")
	private float maximumBandwidthRatio_Out;
	
	@Column(name = "入_平均速率")
	private float averageSpeed_In;
	
	@Column(name = "入_平均带宽占比")
	private float averageBandwidthRatio_In;
	
	@Column(name = "入_最大速率")
	private float maximumSpeed_In;
	
	@Column(name = "入_最大带宽占比")
	private float maximumBandwidthRatio_In;

	public String getLocalNet() {
		return localNet;
	}

	public void setLocalNet(String localNet) {
		this.localNet = localNet;
	}

	public String getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(String branchOffice) {
		this.branchOffice = branchOffice;
	}

	public String getBureauDirection() {
		return bureauDirection;
	}

	public void setBureauDirection(String bureauDirection) {
		this.bureauDirection = bureauDirection;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNameOfDevice() {
		return nameOfDevice;
	}

	public void setNameOfDevice(String nameOfDevice) {
		this.nameOfDevice = nameOfDevice;
	}

	public String getPonID() {
		return ponID;
	}

	public void setPonID(String ponID) {
		this.ponID = ponID;
	}

	public int getPortWidth() {
		return portWidth;
	}

	public void setPortWidth(int portWidth) {
		this.portWidth = portWidth;
	}

	public float getAverageSpeed_Out() {
		return averageSpeed_Out;
	}

	public void setAverageSpeed_Out(float averageSpeed_Out) {
		this.averageSpeed_Out = averageSpeed_Out;
	}

	public float getAverageBandwidthRatio_Out() {
		return averageBandwidthRatio_Out;
	}

	public void setAverageBandwidthRatio_Out(float averageBandwidthRatio_Out) {
		this.averageBandwidthRatio_Out = averageBandwidthRatio_Out;
	}

	public float getMaximumSpeed_Out() {
		return maximumSpeed_Out;
	}

	public void setMaximumSpeed_Out(float maximumSpeed_Out) {
		this.maximumSpeed_Out = maximumSpeed_Out;
	}

	public float getMaximumBandwidthRatio_Out() {
		return maximumBandwidthRatio_Out;
	}

	public void setMaximumBandwidthRatio_Out(float maximumBandwidthRatio_Out) {
		this.maximumBandwidthRatio_Out = maximumBandwidthRatio_Out;
	}

	public float getAverageSpeed_In() {
		return averageSpeed_In;
	}

	public void setAverageSpeed_In(float averageSpeed_In) {
		this.averageSpeed_In = averageSpeed_In;
	}

	public float getAverageBandwidthRatio_In() {
		return averageBandwidthRatio_In;
	}

	public void setAverageBandwidthRatio_In(float averageBandwidthRatio_In) {
		this.averageBandwidthRatio_In = averageBandwidthRatio_In;
	}

	public float getMaximumSpeed_In() {
		return maximumSpeed_In;
	}

	public void setMaximumSpeed_In(float maximumSpeed_In) {
		this.maximumSpeed_In = maximumSpeed_In;
	}

	public float getMaximumBandwidthRatio_In() {
		return maximumBandwidthRatio_In;
	}

	public void setMaximumBandwidthRatio_In(float maximumBandwidthRatio_In) {
		this.maximumBandwidthRatio_In = maximumBandwidthRatio_In;
	}
	
	
	
}
