package com.sys.service;

import java.util.List;

import com.sys.table.User_RoleTable;

public interface User_RoleService {
	public List<User_RoleTable> selectRoleId(int role_id);//角色id 查询
	public User_RoleTable selectUserId(int user_id);//用户id 查询
	public List<User_RoleTable> selectAll();//查询所有
	
	public int deleteRoleId(int role_id);//根据用户id删除 
	public int deleteUserId(int user_id);//根据角色id删除
	public int delete(int user_role_id);//删除
	public int inster(User_RoleTable user_RoleTable);//添加
}
