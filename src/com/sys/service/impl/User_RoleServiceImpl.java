package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.User_RoleMapper;
import com.sys.service.User_RoleService;
import com.sys.table.User_RoleTable;

@Service("user_RoleService")
@Transactional
public class User_RoleServiceImpl implements User_RoleService{
	@Autowired
	private User_RoleMapper user_RoleMapper;

	@Override
	public List<User_RoleTable> selectRoleId(int role_id) {
		// TODO 自动生成的方法存根
		List<User_RoleTable> user_RoleTables=user_RoleMapper.select(new User_RoleTable(0, 0, role_id));
		return user_RoleTables;
	}

	@Override
	public User_RoleTable selectUserId(int user_id) {
		// TODO 自动生成的方法存根
		List<User_RoleTable> user_RoleTables=user_RoleMapper.select(new User_RoleTable(0, user_id,0));
		if(user_RoleTables.size()==1)
		{
			return user_RoleTables.get(0);
		}
		return null;
	}

	@Override
	public List<User_RoleTable> selectAll() {
		// TODO 自动生成的方法存根
		List<User_RoleTable> user_RoleTables=user_RoleMapper.select(new User_RoleTable(0, 0, 0));
		return user_RoleTables;
	}

	@Override
	public int deleteRoleId(int role_id) {
		// TODO 自动生成的方法存根	
		return user_RoleMapper.delete(new User_RoleTable(0, 0, role_id));
	}

	@Override
	public int deleteUserId(int user_id) {
		// TODO 自动生成的方法存根
		return user_RoleMapper.delete(new User_RoleTable(0, user_id,0));
	}

	@Override
	public int delete(int user_role_id) {
		// TODO 自动生成的方法存根
		return user_RoleMapper.delete(new User_RoleTable(user_role_id, 0,0));
	}

	@Override
	public int inster(User_RoleTable user_RoleTable) {
		// TODO 自动生成的方法存根
		return user_RoleMapper.inster(user_RoleTable);
	}

}
