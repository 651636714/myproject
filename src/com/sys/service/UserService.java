package com.sys.service;

import java.util.List;

import com.sys.table.UserTable;

public interface UserService {
	public UserTable selectUserId(int user_id);//用户id 查询
	public UserTable selectlogin(String user_login_name,String user_psw);//用户名 查询
	public int selectCount();//统计用户表
	public List<UserTable> selectAll();//查询所有
	public int delete(int user_id);//删除
	public int inster(UserTable userTable);//添加
}
