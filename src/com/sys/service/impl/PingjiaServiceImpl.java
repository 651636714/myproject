package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.PingjiaService;
import com.sys.table.EvaTable;
import com.sys.table.ServiceTable;
import com.sys.utils.Page;

@Service("pingjiService")
@Transactional
public class PingjiaServiceImpl implements PingjiaService{

	@Override
	public Page<ServiceTable> findServiceTablePage(List<ServiceTable> serviceTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=serviceTables.size();
		Page<ServiceTable> serviceTablePage=new Page<ServiceTable>(count,page,rows,serviceTables);
		return serviceTablePage;
	}

	@Override
	public Page<EvaTable> findEvaTablePage(List<EvaTable> evaTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=evaTables.size();
		Page<EvaTable> evaTablePage=new Page<EvaTable>(count,page,rows,evaTables);
		return evaTablePage;
	}

}
