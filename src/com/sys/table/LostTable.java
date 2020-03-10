package com.sys.table;

public class LostTable {
	
	int lost_id;
	int lost_user_id;
	String lost_time;
	String lost_place;
	String lost_item_desc;
	String lost_status;
	String lost_phone;
	
	public int getLost_id() {
		return lost_id;
	}
	public void setLost_id(int lost_id) {
		this.lost_id = lost_id;
	}
	public int getLost_user_id() {
		return lost_user_id;
	}
	public LostTable(int lost_id, int lost_user_id, String lost_time, String lost_place, String lost_item_desc,
			String lost_status, String lost_phone) {
		super();
		this.lost_id = lost_id;
		this.lost_user_id = lost_user_id;
		this.lost_time = lost_time;
		this.lost_place = lost_place;
		this.lost_item_desc = lost_item_desc;
		this.lost_status = lost_status;
		this.lost_phone = lost_phone;
	}
	public void setLost_user_id(int lost_user_id) {
		this.lost_user_id = lost_user_id;
	}
	public String getLost_time() {
		return lost_time;
	}
	public void setLost_time(String lost_time) {
		this.lost_time = lost_time;
	}
	public String getLost_place() {
		return lost_place;
	}
	public void setLost_place(String lost_place) {
		this.lost_place = lost_place;
	}
	public String getLost_item_desc() {
		return lost_item_desc;
	}
	public void setLost_item_desc(String lost_item_desc) {
		this.lost_item_desc = lost_item_desc;
	}
	public String getLost_status() {
		return lost_status;
	}
	public void setLost_status(String lost_status) {
		this.lost_status = lost_status;
	}
	public String getLost_phone() {
		return lost_phone;
	}
	public void setLost_phone(String lost_phone) {
		this.lost_phone = lost_phone;
	}
	@Override
	public String toString() {
		return "LostTable [lost_id=" + lost_id + ", lost_user_id=" + lost_user_id + ", lost_time=" + lost_time
				+ ", lost_place=" + lost_place + ", lost_item_desc=" + lost_item_desc + ", lost_status=" + lost_status
				+ ", lost_phone=" + lost_phone + "]";
	}
	
}
