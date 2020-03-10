package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.RelesaseMapper;
import com.sys.table.RelesaseTable;
public class test_relesase {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		RelesaseMapper relesaseMapper=(RelesaseMapper) applicationContext.getBean(RelesaseMapper.class);
		//RelesaseTable relesaseTable =relesaseMapper.select1(1);
		//RelesaseTable relesaseTables=new RelesaseTable( 1,2, 3);
		//relesaseMapper.inster(relesaseTables);
		relesaseMapper.delete(2);
		List<RelesaseTable> relesaseTable=relesaseMapper.select2();
		System.out.println(relesaseTable);
	}
}
