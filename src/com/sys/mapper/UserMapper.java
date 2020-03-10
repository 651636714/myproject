package com.sys.mapper;

import java.util.List;

import com.sys.table.UserTable;

public interface UserMapper {
	public int update(UserTable userTable);//ĞŞ¸Ä
	public List<UserTable> select(UserTable userTable);//²éÑ¯
	public int delete(UserTable userTable);//É¾³ı
	public int inster(UserTable userTable);//Ìí¼Ó
}
