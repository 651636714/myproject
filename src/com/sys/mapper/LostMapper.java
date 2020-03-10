package com.sys.mapper;

import java.util.List;

import com.sys.table.LostTable;

public interface LostMapper {
	public int update(LostTable lostTable);//ÐÞ¸Ä
	public List<LostTable> select(LostTable lostTable);//²éÑ¯
	public int delete(LostTable lostTable);//É¾³ý
	public int inster(LostTable lostTable);//Ìí¼Ó
}
