package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sys.mapper.UserMapper;
import com.sys.table.UserTable;


public class test {
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=(UserMapper) applicationContext.getBean(UserMapper.class);
		//UserTable userTable =userMapper.select1(1);
		UserTable userTable=userMapper.select2("1","2");
		//List<UserTable> userTable=userMapper.select3();
		
		//int i=userMapper.select4();
		//System.out.println(i);
		//userMapper.delete(2);
		//UserTable userTables=new UserTable( 1,"2", "3", 4, "5", 6, "7", "8", "9");
		//userMapper.inster(userTables);
		//List<UserTable> userTable=userMapper.select3();
		System.out.println(userTable);
	}
	
}

