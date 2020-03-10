package com.sys.service;

import java.util.List;

import com.sys.table.RoleTable;

public interface RoleService {
	public RoleTable selectRoleId(int role_id);//角色id 查询
	public List<RoleTable> selectAll();//查询所有
	public int delete(int role_id);//删除
	public int inster(RoleTable roleTable);//添加
}
