package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.GonggaoService;
import com.sys.table.MessageTable;
import com.sys.utils.Page;

@Service("gonggaoService")
@Transactional
public class GonggaoServiceImpl implements GonggaoService{

	@Override
	public Page<MessageTable> findMessagePage(List<MessageTable> messageTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=messageTables.size();
		Page<MessageTable> messageTablePage=new Page<MessageTable>(count,page,rows,messageTables);
		return messageTablePage;
	}

}
