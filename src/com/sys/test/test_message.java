package com.sys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sys.mapper.MessageMapper;
import com.sys.service.MessageService;
import com.sys.table.MessageTable;
public class test_message {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageService messageService=(MessageService) applicationContext.getBean(MessageService.class);
		//MessageTable messageTable =messageMapper.select1(1);
		MessageTable messageTable=messageService.selectMessageId(3);
		System.out.println(messageTable);
		//MessageTable messageTables=new MessageTable( 1,2, "3", "4");
		//messageMapper.inster(messageTables);
		//messageMapper.delete(2);
		//List<MessageTable> messageTables=messageService.selectAll();
		//System.out.println(messageTables);
	}
}
