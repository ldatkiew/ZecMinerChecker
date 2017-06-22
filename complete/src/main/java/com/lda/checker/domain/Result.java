package com.lda.checker.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	private Long gpuid; // 0,
	private Long cudaid; // 0,
	private String busid; // "0000:01:00.0",
	private String name; // "GeForce GTX 1060 6GB",
	private Long gpu_status; // 2,
	private Long solver; // 0,
	private Long temperature; // 67,
	private Long gpu_power_usage; // 88,
	private Long speed_sps; // 288,
	private Long accepted_shares; // 1,
	private Long rejected_shares; // 0,
	private Long start_time; // 1497973765
	public Long getGpuid() {
		return gpuid;
	}
	public void setGpuid(Long gpuid) {
		this.gpuid = gpuid;
	}
	public Long getCudaid() {
		return cudaid;
	}
	public void setCudaid(Long cudaid) {
		this.cudaid = cudaid;
	}
	public String getBusid() {
		return busid;
	}
	public void setBusid(String busid) {
		this.busid = busid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getGpu_status() {
		return gpu_status;
	}
	public void setGpu_status(Long gpu_status) {
		this.gpu_status = gpu_status;
	}
	public Long getSolver() {
		return solver;
	}
	public void setSolver(Long solver) {
		this.solver = solver;
	}
	public Long getTemperature() {
		return temperature;
	}
	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}
	public Long getGpu_power_usage() {
		return gpu_power_usage;
	}
	public void setGpu_power_usage(Long gpu_power_usage) {
		this.gpu_power_usage = gpu_power_usage;
	}
	public Long getSpeed_sps() {
		return speed_sps;
	}
	public void setSpeed_sps(Long speed_sps) {
		this.speed_sps = speed_sps;
	}
	public Long getAccepted_shares() {
		return accepted_shares;
	}
	public void setAccepted_shares(Long accepted_shares) {
		this.accepted_shares = accepted_shares;
	}
	public Long getRejected_shares() {
		return rejected_shares;
	}
	public void setRejected_shares(Long rejected_shares) {
		this.rejected_shares = rejected_shares;
	}
	public Long getStart_time() {
		return start_time;
	}
	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}
	@Override
	public String toString() {
		return "Result [gpuid=" + gpuid + ", cudaid=" + cudaid + ", busid=" + busid + ", name=" + name + ", gpu_status="
				+ gpu_status + ", solver=" + solver + ", temperature=" + temperature + ", gpu_power_usage="
				+ gpu_power_usage + ", speed_sps=" + speed_sps + ", accepted_shares=" + accepted_shares
				+ ", rejected_shares=" + rejected_shares + ", start_time=" + start_time + "]";
	}
	public boolean isWorking() {

		if(speed_sps > 100)
		{
			return true;
		}
		return false;
	}
	
}
