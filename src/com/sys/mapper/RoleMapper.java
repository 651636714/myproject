package com.sys.mapper;

import java.util.List;

import com.sys.table.RoleTable;


public interface RoleMapper {
	public int update(RoleTable roleTable);//ĞŞ¸Ä
	public List<RoleTable> select(RoleTable roleTable);//²éÑ¯
	public int delete(RoleTable roleTable);//É¾³ı
	public int inster(RoleTable roleTable);//Ìí¼Ó
}
