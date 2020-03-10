package com.sys.mapper;

import java.util.List;

import com.sys.table.PickTable;

public interface PickMapper {
	public int update(PickTable pickTable);//ĞŞ¸Ä
	public List<PickTable> select(PickTable pickTable);//²éÑ¯
	public int delete(PickTable pickTable);//É¾³ı
	public int inster(PickTable pickTable);//Ìí¼Ó
}
