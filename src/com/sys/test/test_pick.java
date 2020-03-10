package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.PickMapper;
import com.sys.table.PickTable;
public class test_pick {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		PickMapper pickMapper=(PickMapper) applicationContext.getBean(PickMapper.class);
		//PickTable pickTable =pickMapper.select1(1);
		//List<PickTable> pickTable=pickMapper.select2("5");
		//PickTable pickTables=new PickTable( 1,2, "3", "4", "5", "6", "7");
		//pickMapper.inster(pickTables);
		pickMapper.delete(3);
		List<PickTable> pickTable=pickMapper.select3();
		System.out.println(pickTable);
	}
}
