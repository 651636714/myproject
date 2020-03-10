package com.sys.table;

public class RoleTable {
	
	int role_id;
	String role_name;
	int role_type;
	String role_description;
	String role_info;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public RoleTable(int role_id, String role_name, int role_type, String role_description, String role_info) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.role_type = role_type;
		this.role_description = role_description;
		this.role_info = role_info;
	}
	@Override
	public String toString() {
		return "RoleTable [role_id=" + role_id + ", role_name=" + role_name + ", role_type=" + role_type
				+ ", role_description=" + role_description + ", role_info=" + role_info + "]";
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public int getRole_type() {
		return role_type;
	}
	public void setRole_type(int role_type) {
		this.role_type = role_type;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	public String getRole_info() {
		return role_info;
	}
	public void setRole_info(String role_info) {
		this.role_info = role_info;
	}

	
	
	
}
