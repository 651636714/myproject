package com.sys.service;

import java.util.List;

import com.sys.table.PickTable;

public interface PickService {
	public int updatePickStatusFromPickId(int pick_id,String pick_status);//通过ID修改状态
	public PickTable selectPickId(int pick_id);//pick_id 查询
	public List<PickTable> selectPickStatus(String pick_status);//状态 查询
	public List<PickTable> selectAll();//查询所有
	public int delete(int pick_id);//删除 
	public int inster(PickTable pickTable);//添加
}
