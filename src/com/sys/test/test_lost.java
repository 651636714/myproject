package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.LostMapper;
import com.sys.table.LostTable;
public class test_lost {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		LostMapper lostMapper=(LostMapper) applicationContext.getBean(LostMapper.class);
		//LostTable lostTable =lostMapper.select1(1);
		//List<LostTable> lostTable=lostMapper.select2("5");
		//LostTable lostTables=new LostTable( 1,2, "3", "4", "5", "6", "7");
		//lostMapper.inster(lostTables);
		lostMapper.delete(2);
		List<LostTable> lostTable=lostMapper.select3();
		System.out.println(lostTable);
	}
}
