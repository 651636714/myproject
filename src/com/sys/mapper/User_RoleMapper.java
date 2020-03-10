package com.sys.mapper;

import java.util.List;

import com.sys.table.User_RoleTable;

public interface User_RoleMapper {
	public int update(User_RoleTable user_RoleTable);//ĞŞ¸Ä
	public List<User_RoleTable> select(User_RoleTable user_RoleTable);//²éÑ¯
	public int delete(User_RoleTable user_RoleTable);//É¾³ı
	public int inster(User_RoleTable user_RoleTable);//Ìí¼Ó
}
