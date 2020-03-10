package com.sys.service;

import java.util.List;

import com.sys.table.Lost_PickTable;

public interface Lost_PickService {
	public List<Lost_PickTable> selectLostId(int lost_id);
	public List<Lost_PickTable> selectPickId(int pick_id);
	public List<Lost_PickTable> selectAll();
	public int deleteLostPickId(int lost_pick_id);
	public int inster(Lost_PickTable lost_PickTable);
}
