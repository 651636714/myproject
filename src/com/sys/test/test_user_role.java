package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.User_RoleMapper;
import com.sys.table.EvaTable;
import com.sys.table.User_RoleTable;
public class test_user_role {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User_RoleMapper user_RoleMapper=(User_RoleMapper) applicationContext.getBean(User_RoleMapper.class);
		//User_RoleTable user_RoleTable =user_RoleMapper.select2(1);
		//User_RoleTable user_RoleTables=new User_RoleTable( 1,2, 3);
		//user_RoleMapper.inster(user_RoleTables);
		//user_RoleMapper.updata(user_RoleTables);
		user_RoleMapper.delete1(3);
		List<User_RoleTable> user_RoleTable=user_RoleMapper.select3();
		System.out.println(user_RoleTable);
	}
}
