package com.sys.table;

public class Lost_PickTable {
	
	int lost_pick_id;
	int lost_id;
	int pick_id;
	public int getLost_pick_id() {
		return lost_pick_id;
	}
	public void setLost_pick_id(int lost_pick_id) {
		this.lost_pick_id = lost_pick_id;
	}
	public int getLost_id() {
		return lost_id;
	}
	public void setLost_id(int lost_id) {
		this.lost_id = lost_id;
	}
	public int getPick_id() {
		return pick_id;
	}
	public void setPick_id(int pick_id) {
		this.pick_id = pick_id;
	}
	@Override
	public String toString() {
		return "Lost_PickTable [lost_pick_id=" + lost_pick_id + ", lost_id=" + lost_id + ", pick_id=" + pick_id + "]";
	}
	public Lost_PickTable(int lost_pick_id, int lost_id, int pick_id) {
		super();
		this.lost_pick_id = lost_pick_id;
		this.lost_id = lost_id;
		this.pick_id = pick_id;
	}
	
	
	
	
}
