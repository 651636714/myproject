package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.ReportMapper;
import com.sys.table.ReportTable;
public class test_report {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ReportMapper reportMapper=(ReportMapper) applicationContext.getBean(ReportMapper.class);
		//ReportTable reportTable =reportMapper.select1(1);
		//List<ReportTable> reportTable=reportMapper.select2("6");
		
		//ReportTable reportTables=new ReportTable( 1,"2", 3, "4", "5", "6", "7","8");
		//reportMapper.inster(reportTables);
		List<ReportTable> reportTable=reportMapper.select3("·ñ");
		//List<ReportTable> reportTable=reportMapper.select4();
		System.out.println(reportTable);
	}
}
