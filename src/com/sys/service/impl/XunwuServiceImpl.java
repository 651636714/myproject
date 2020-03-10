package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.XunwuService;
import com.sys.table.LostTable;
import com.sys.utils.Page;

@Service("xunwuService")
@Transactional
public class XunwuServiceImpl implements XunwuService{

	@Override
	public Page<LostTable> findXunwuPage(List<LostTable> lostTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=lostTables.size();
		Page<LostTable> lostTablePage=new Page<LostTable>(count,page,rows,lostTables);
		return lostTablePage;
	}
	

}
