package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.ServiceMapper;
import com.sys.table.ServiceTable;
public class test_service {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceMapper serviceMapper=(ServiceMapper) applicationContext.getBean(ServiceMapper.class);
		///ServiceTable serviceTable =serviceMapper.select1(1);
		
		//ServiceTable serviceTables=new ServiceTable(1, 2, 3, "4","5", 6);
		//serviceMapper.inster(serviceTables);
		serviceMapper.delete(2);
		
		List<ServiceTable> serviceTable=serviceMapper.select2();
		System.out.println(serviceTable);
	}
}
