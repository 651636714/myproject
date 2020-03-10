package com.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.service.BaoxiuService;
import com.sys.table.ReportTable;
import com.sys.table.ServiceTable;
import com.sys.utils.Page;

@Service("baoxiuService")
@Transactional
public class BaoxiuServiceImpl implements BaoxiuService{

	@Override
	public Page<ReportTable> findReportPage(List<ReportTable> reportTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=reportTables.size();
		Page<ReportTable> reportTablePage=new Page<ReportTable>(count,page,rows,reportTables);
		return reportTablePage;
	}

	@Override
	public Page<ServiceTable> findServiceTablePage(List<ServiceTable> serviceTables) {
		// TODO 自动生成的方法存根
		Integer page=1;
		Integer rows=10;
		Integer count=serviceTables.size();
		Page<ServiceTable> serviceTablePage=new Page<ServiceTable>(count,page,rows,serviceTables);
		return serviceTablePage;
	}

}
