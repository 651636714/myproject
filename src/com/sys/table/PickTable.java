package com.sys.table;

public class PickTable {
	
	int pick_id;
	int pick_user_id;
	String pick_time;
	String pick_place;
	String pick_item_desc;
	String pick_status;
	String pick_phone;
	
	public int getPick_id() {
		return pick_id;
	}
	public void setPick_id(int pick_id) {
		this.pick_id = pick_id;
	}
	public int getPick_user_id() {
		return pick_user_id;
	}
	public PickTable(int pick_id, int pick_user_id, String pick_time, String pick_place, String pick_item_desc,
			String pick_status, String pick_phone) {
		super();
		this.pick_id = pick_id;
		this.pick_user_id = pick_user_id;
		this.pick_time = pick_time;
		this.pick_place = pick_place;
		this.pick_item_desc = pick_item_desc;
		this.pick_status = pick_status;
		this.pick_phone = pick_phone;
	}
	public void setPick_user_id(int pick_user_id) {
		this.pick_user_id = pick_user_id;
	}
	public String getPick_time() {
		return pick_time;
	}
	public void setPick_time(String pick_time) {
		this.pick_time = pick_time;
	}
	public String getPick_place() {
		return pick_place;
	}
	public void setPick_place(String pick_place) {
		this.pick_place = pick_place;
	}
	public String getPick_item_desc() {
		return pick_item_desc;
	}
	public void setPick_item_desc(String pick_item_desc) {
		this.pick_item_desc = pick_item_desc;
	}
	public String getPick_status() {
		return pick_status;
	}
	public void setPick_status(String pick_status) {
		this.pick_status = pick_status;
	}
	public String getPick_phone() {
		return pick_phone;
	}
	public void setPick_phone(String pick_phone) {
		this.pick_phone = pick_phone;
	}
	@Override
	public String toString() {
		return "PickTable [pick_id=" + pick_id + ", pick_user_id=" + pick_user_id + ", pick_time=" + pick_time
				+ ", pick_place=" + pick_place + ", pick_item_desc=" + pick_item_desc + ", pick_status=" + pick_status
				+ ", pick_phone=" + pick_phone + "]";
	}
	
	
}
