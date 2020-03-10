package com.sys.mapper;

import java.util.List;

import com.sys.table.ServiceTable;

public interface ServiceMapper {
	public int update(ServiceTable serviceTable);//ÐÞ¸Ä
	public List<ServiceTable> select(ServiceTable serviceTable);//²éÑ¯
	public int delete(ServiceTable serviceTable);//É¾³ý
	public int inster(ServiceTable serviceTable);//Ìí¼Ó
}
