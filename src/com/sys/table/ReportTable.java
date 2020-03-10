package com.sys.table;

public class ReportTable {
	
	int report_id;
	String report_type;
	int report_user_id;
	String report_time;
	String report_place;
	String report_desc;
	String report_status;
	String report_is_handle;
	public ReportTable(int report_id, String report_type, int report_user_id, String report_time, String report_place,
			String report_desc, String report_status, String report_is_handle) {
		super();
		this.report_id = report_id;
		this.report_type = report_type;
		this.report_user_id = report_user_id;
		this.report_time = report_time;
		this.report_place = report_place;
		this.report_desc = report_desc;
		this.report_status = report_status;
		this.report_is_handle = report_is_handle;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getReport_type() {
		return report_type;
	}
	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}
	public int getReport_user_id() {
		return report_user_id;
	}
	public void setReport_user_id(int report_user_id) {
		this.report_user_id = report_user_id;
	}
	public String getReport_time() {
		return report_time;
	}
	public void setReport_time(String report_time) {
		this.report_time = report_time;
	}
	public String getReport_place() {
		return report_place;
	}
	public void setReport_place(String report_place) {
		this.report_place = report_place;
	}
	public String getReport_desc() {
		return report_desc;
	}
	public void setReport_desc(String report_desc) {
		this.report_desc = report_desc;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}
	public String getReport_is_handle() {
		return report_is_handle;
	}
	public void setReport_is_handle(String report_is_handle) {
		this.report_is_handle = report_is_handle;
	}
	@Override
	public String toString() {
		return "ReportTable [report_id=" + report_id + ", report_type=" + report_type + ", report_user_id="
				+ report_user_id + ", report_time=" + report_time + ", report_place=" + report_place + ", report_desc="
				+ report_desc + ", report_status=" + report_status + ", report_is_handle=" + report_is_handle + "]";
	}
	
}
