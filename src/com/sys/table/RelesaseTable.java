package com.sys.table;

public class RelesaseTable {
	
	int relesase_id;
	int relesase_user_id;
	int relesase_message_id;
	public int getRelesase_id() {
		return relesase_id;
	}
	public void setRelesase_id(int relesase_id) {
		this.relesase_id = relesase_id;
	}
	public int getRelesase_user_id() {
		return relesase_user_id;
	}
	public void setRelesase_user_id(int relesase_user_id) {
		this.relesase_user_id = relesase_user_id;
	}
	public int getRelesase_message_id() {
		return relesase_message_id;
	}
	public void setRelesase_message_id(int relesase_message_id) {
		this.relesase_message_id = relesase_message_id;
	}
	@Override
	public String toString() {
		return "RelesaseTable [relesase_id=" + relesase_id + ", relesase_user_id=" + relesase_user_id
				+ ", relesase_message_id=" + relesase_message_id + "]";
	}
	public RelesaseTable(int relesase_id, int relesase_user_id, int relesase_message_id) {
		super();
		this.relesase_id = relesase_id;
		this.relesase_user_id = relesase_user_id;
		this.relesase_message_id = relesase_message_id;
	}
	
	
}
