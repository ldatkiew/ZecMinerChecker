package com.lda.checker.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MinerStat {

	private String method; // "getstat",
	private String error; // null,
	private Long start_time; // 1497973764,
	private String current_server; // "eu1-zcash.flypool.org:3333",
	private Long available_servers; // 1,
	private Long server_status; // 2,
	
	@JsonProperty("result")
	private List<Result> results = new ArrayList<>();
	
	
	public static MinerStat createEmptyStat()
	{
		MinerStat minerStat = new MinerStat();
		minerStat.setError("Created empty stat");
		return minerStat;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Long getStart_time() {
		return start_time;
	}

	public void setStart_time(Long start_time) {
		this.start_time = start_time;
	}

	public String getCurrent_server() {
		return current_server;
	}

	public void setCurrent_server(String current_server) {
		this.current_server = current_server;
	}

	public Long getAvailable_servers() {
		return available_servers;
	}

	public void setAvailable_servers(Long available_servers) {
		this.available_servers = available_servers;
	}

	public Long getServer_status() {
		return server_status;
	}

	public void setServer_status(Long server_status) {
		this.server_status = server_status;
	}




	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Quote [method=" + method + ", error=" + error + ", start_time=" + start_time + ", current_server="
				+ current_server + ", available_servers=" + available_servers + ", server_status=" + server_status
				+ ", result=" + results + "]";
	}

	public boolean isAllWorking() {

		boolean allWorks = true;
		for (Result result : results) {
			allWorks &= result.isWorking();
		}
		return allWorks;
	}
	
	
}
