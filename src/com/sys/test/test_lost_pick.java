package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sys.mapper.Lost_PickMapper;
import com.sys.service.Lost_PickService;
import com.sys.table.Lost_PickTable;

public class test_lost_pick {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	Lost_PickService lost_PickService=(Lost_PickService) applicationContext.getBean(Lost_PickService.class);
	//Lost_PickTable lost_PickTable =lost_PickMapper.select1(1);
	//Lost_PickTable lost_PickTable =lost_PickMapper.select2(2);
	//List<Lost_PickTable> lost_PickTable=lost_PickMapper.select3();
	//Lost_PickTable lost_PickTables=new Lost_PickTable( 1,2, 3);
	//lost_PickMapper.inster(lost_PickTables);
	//lost_PickMapper.delete(3);
	//List<Lost_PickTable> lost_PickTable=lost_PickMapper.select3();
	//System.out.println(lost_PickTable);
	}
}
