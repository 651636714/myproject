package com.sys.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sys.service.EvaService;
import com.sys.table.EvaTable;

public class test_EVA {
	
	
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		EvaService evaService=(EvaService) applicationContext.getBean(EvaService.class);
		//EvaTable evaTable =evaMapper.select1(1);
		//List<EvaTable> evaTable=evaMapper.select2();
		//EvaTable evaTables=new EvaTable( 1,2, 3, "4", "5", "6", "7");
		//evaMapper.inster(evaTables);
		//evaMapper.delete(2);
		//List<EvaTable> evaTable=evaMapper.select2();
		//System.out.println(evaTable);
		//evaService.inster(new EvaTable(0,10,20,"时间","等级","评价","建议"));
		//evaService.deleteEvaId(11);
		List<EvaTable> evaTables=evaService.selectAll();
		//List<EvaTable> evaTables=evaService.findReportId(2);
		//EvaTable evaTable=evaService.selectEvaId(new EvaTable(0, 1, 2, "3", "4", "5", "6"));
		System.out.println(evaTables);
	}
	
}
