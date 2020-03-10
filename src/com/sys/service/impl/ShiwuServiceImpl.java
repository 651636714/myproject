package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.ShiwuService;
import com.sys.table.PickTable;
import com.sys.utils.Page;

@Service("shiwuService")
@Transactional
public class ShiwuServiceImpl implements ShiwuService{

	@Override
	public Page<PickTable> findPickPage(List<PickTable> pickTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=pickTables.size();
		Page<PickTable> pickTablePage=new Page<PickTable>(count,page,rows,pickTables);
		return pickTablePage;
	}

}
