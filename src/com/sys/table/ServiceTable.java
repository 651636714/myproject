package com.sys.table;

public class ServiceTable {
	
	int service_id;
	int service_person_id;
	int service_report_id;
	String service_time;
	String service_result;
	int service_eva_id;
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public int getService_person_id() {
		return service_person_id;
	}
	public void setService_person_id(int service_person_id) {
		this.service_person_id = service_person_id;
	}
	public int getService_report_id() {
		return service_report_id;
	}
	public void setService_report_id(int service_report_id) {
		this.service_report_id = service_report_id;
	}
	public String getService_time() {
		return service_time;
	}
	public void setService_time(String service_time) {
		this.service_time = service_time;
	}
	public String getService_result() {
		return service_result;
	}
	public void setService_result(String service_result) {
		this.service_result = service_result;
	}
	public int getService_eva_id() {
		return service_eva_id;
	}
	public void setService_eva_id(int service_eva_id) {
		this.service_eva_id = service_eva_id;
	}
	@Override
	public String toString() {
		return "ServiceTable [service_id=" + service_id + ", service_person_id=" + service_person_id
				+ ", service_report_id=" + service_report_id + ", service_time=" + service_time + ", service_result="
				+ service_result + ", service_eva_id=" + service_eva_id + "]";
	}
	public ServiceTable(int service_id, int service_person_id, int service_report_id, String service_time,
			String service_result, int service_eva_id) {
		super();
		this.service_id = service_id;
		this.service_person_id = service_person_id;
		this.service_report_id = service_report_id;
		this.service_time = service_time;
		this.service_result = service_result;
		this.service_eva_id = service_eva_id;
	}
	

	


}
