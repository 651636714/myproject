package com.sys.service;

import java.util.List;

import com.sys.table.LostTable;

public interface LostService {
	public int updateLostStatusfromLostId(int lost_id,String lost_status);//通过ID修改状态
	public LostTable selectLostId(int lost_id);
	public List<LostTable> selectLostStatus(String lost_status);//查询状态
	public List<LostTable> selectAll();//查询所有 
	public int delete(int lost_id);//删除
	public int inster(LostTable lostTable);//添加
}
