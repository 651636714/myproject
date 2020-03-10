package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.GuanliyuanService;
import com.sys.table.MessageTable;
import com.sys.table.RoleTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;

@Service("guanliyuanService")
@Transactional
public class GuanliyuanServiceImpl implements GuanliyuanService{

	@Override
	public Page<RoleTable> findRolePage(List<RoleTable> roleTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=roleTables.size();
		Page<RoleTable> roleTablePage=new Page<RoleTable>(count,page,rows,roleTables);
		return roleTablePage;
	}

	@Override
	public Page<UserTable> findUserPage(List<UserTable> userTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=userTables.size();
		Page<UserTable> userTablePage=new Page<UserTable>(count,page,rows,userTables);
		return userTablePage;
	}
	

}
