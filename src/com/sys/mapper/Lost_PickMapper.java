package com.sys.mapper;

import java.util.List;

import com.sys.table.Lost_PickTable;

public interface Lost_PickMapper {
	public int update(Lost_PickTable evaTable);//ÐÞ¸Ä
	public List<Lost_PickTable> select(Lost_PickTable lost_PickTable);//²éÑ¯
	public int delete(Lost_PickTable lost_PickTable);//É¾³ý
	public int inster(Lost_PickTable lost_PickTable);//Ìí¼Ó
}
