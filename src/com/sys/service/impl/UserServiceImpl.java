package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.UserMapper;
import com.sys.service.UserService;
import com.sys.table.UserTable;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserTable selectUserId(int user_id) {
		// TODO 自动生成的方法存根
		List<UserTable> userTables=userMapper.select(new UserTable(user_id, null, null, 0, null, 0, null, null,null));
		if(userTables.size()==1)
		{
			return userTables.get(0);
		}
		return null;
	}

	@Override
	public UserTable selectlogin(String user_login_name, String user_psw) {
		// TODO 自动生成的方法存根
		List<UserTable> userTables=userMapper.select(new UserTable(0, user_login_name, user_psw, 0, null, 0, null, null,null));
		if(userTables.size()==1)
		{
			return userTables.get(0);
		}
		return null;
	}

	@Override
	public int selectCount() {
		// TODO 自动生成的方法存根
		List<UserTable> userTables=userMapper.select(new UserTable(0, null, null, 0, null, 0, null, null,null));
		return userTables.size();
	}

	@Override
	public List<UserTable> selectAll() {
		// TODO 自动生成的方法存根
		List<UserTable> userTables=userMapper.select(new UserTable(0, null, null, 0, null, 0, null, null,null));
		return userTables;
	}

	@Override
	public int delete(int user_id) {
		// TODO 自动生成的方法存根
		return userMapper.delete(new UserTable(user_id, null, null, 0, null, 0, null, null,null));
	}

	@Override
	public int inster(UserTable userTable) {
		// TODO 自动生成的方法存根
		return userMapper.inster(userTable);
	}
	
}
