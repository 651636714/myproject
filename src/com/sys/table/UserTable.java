package com.sys.table;

public class UserTable {
	
	int user_id;
	String user_login_name;
	String user_psw;
	int user_org_id;
	String user_info;
	int user_num;
	String user_name;
	String user_sex;
	String user_number;
	public UserTable(int user_id, String user_login_name, String user_psw, int user_org_id, String user_info,
			int user_num, String user_name, String user_sex, String user_number) {
		super();
		this.user_id = user_id;
		this.user_login_name = user_login_name;
		this.user_psw = user_psw;
		this.user_org_id = user_org_id;
		this.user_info = user_info;
		this.user_num = user_num;
		this.user_name = user_name;
		this.user_sex = user_sex;
		this.user_number = user_number;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_login_name() {
		return user_login_name;
	}
	public void setUser_login_name(String user_login_name) {
		this.user_login_name = user_login_name;
	}
	public String getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}
	public int getUser_org_id() {
		return user_org_id;
	}
	public void setUser_org_id(int user_org_id) {
		this.user_org_id = user_org_id;
	}
	public String getUser_info() {
		return user_info;
	}
	public void setUser_info(String user_info) {
		this.user_info = user_info;
	}
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	@Override
	public String toString() {
		return "UserTable [user_id=" + user_id + ", user_login_name=" + user_login_name + ", user_psw=" + user_psw
				+ ", user_org_id=" + user_org_id + ", user_info=" + user_info + ", user_num=" + user_num
				+ ", user_name=" + user_name + ", user_sex=" + user_sex + ", user_number=" + user_number + "]";
	}

}
