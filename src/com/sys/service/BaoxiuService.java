package com.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.table.ReportTable;
import com.sys.table.ServiceTable;
import com.sys.utils.Page;

@Service("baoxiuService")
@Transactional
public interface BaoxiuService {
	public Page<ReportTable> findReportPage(List<ReportTable> reportTables);
	public Page<ServiceTable> findServiceTablePage(List<ServiceTable> serviceTables);
}
