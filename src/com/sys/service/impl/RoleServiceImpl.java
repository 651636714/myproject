package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.RoleMapper;
import com.sys.service.RoleService;
import com.sys.table.RoleTable;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public RoleTable selectRoleId(int role_id) {
		// TODO 自动生成的方法存根role_type
		List<RoleTable> roleTables=roleMapper.select(new RoleTable(role_id, null, 0, null, null));
		if(roleTables.size()==1)
		{
			return roleTables.get(0);
		}
		return null;
	}

	@Override
	public List<RoleTable> selectAll() {
		// TODO 自动生成的方法存根
		List<RoleTable> roleTables=roleMapper.select(new RoleTable(0, null, 0, null, null));
		return roleTables;
	}

	@Override
	public int delete(int role_id) {
		// TODO 自动生成的方法存根
		return roleMapper.delete(new RoleTable(role_id, null, 0, null, null));
	}

	@Override
	public int inster(RoleTable roleTable) {
		// TODO 自动生成的方法存根
		return roleMapper.inster(roleTable);
	}
	
}
