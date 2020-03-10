package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.WelcomeService;
import com.sys.table.MessageTable;
import com.sys.utils.Page;

@Service("welcomeService")
@Transactional
public class WelcomeServiceImpl implements WelcomeService{

	@Override
	public Page<MessageTable> findMessagePage(List<MessageTable> messageTablesList) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=messageTablesList.size();
		Page<MessageTable> messageTablePage=new Page<MessageTable>(count,page,rows,messageTablesList);
		return messageTablePage;
	}
	

}
