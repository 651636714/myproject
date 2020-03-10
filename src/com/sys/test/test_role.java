package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sys.mapper.RoleMapper;
import com.sys.table.RoleTable;

public class test_role {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleMapper roleMapper=(RoleMapper) applicationContext.getBean(RoleMapper.class);
		//RoleTable roleTable =roleMapper.select1(1);
		//RoleTable roleTables=new RoleTable(1, "4", 3, "4", "5");
		//roleMapper.inster(roleTables);
		//roleMapper.updata(roleTables);
		roleMapper.delete(2);
		List<RoleTable> roleTable=roleMapper.select2();
		System.out.println(roleTable);
	}
}
