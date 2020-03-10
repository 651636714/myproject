package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.ReportMapper;
import com.sys.service.ReportService;
import com.sys.table.ReportTable;

@Service("reportService")
@Transactional
public class ReportServiceImpl implements ReportService{
	@Autowired
	private ReportMapper reportMapper;

	@Override
	public ReportTable selectReportId(int report_id) {
		// TODO 自动生成的方法存根
		List<ReportTable> reportTables=reportMapper.select(new ReportTable(report_id, null, 0, null, null, null, null, null));
		if(reportTables.size()==1)
		{
			return reportTables.get(0);
		}
		return null;
	}

	@Override
	public List<ReportTable> selectReportStatus(String report_status) {
		// TODO 自动生成的方法存根
		List<ReportTable> reportTables=reportMapper.select(new ReportTable(0, null, 0, null, null, null, report_status, null));
		return reportTables;
	}

	@Override
	public List<ReportTable> selectReportIsHandle(String report_is_handle) {
		// TODO 自动生成的方法存根
		List<ReportTable> reportTables=reportMapper.select(new ReportTable(0, null, 0, null, null, null, null, report_is_handle));
		return reportTables;
	}

	@Override
	public List<ReportTable> selectAll() {
		// TODO 自动生成的方法存根
		List<ReportTable> reportTables=reportMapper.select(new ReportTable(0, null, 0, null, null, null, null, null));
		return reportTables;
	}

	@Override
	public int delete(int report_id) {
		// TODO 自动生成的方法存根
		return reportMapper.delete(new ReportTable(report_id, null, 0, null, null, null, null, null));
	}

	@Override
	public int inster(ReportTable reportTable) {
		// TODO 自动生成的方法存根
		return reportMapper.inster(reportTable);
	}

	@Override
	public int updateReportIsHandleFromReportId(int report_id, String report_is_handle) {
		// TODO 自动生成的方法存根
		return reportMapper.update(new ReportTable(report_id, null, 0, null, null, null, null, report_is_handle));
	}

	@Override
	public int updateReportStatusFromReportId(int report_id, String report_status) {
		// TODO 自动生成的方法存根
		return reportMapper.update(new ReportTable(report_id, null, 0, null, null, null, report_status, null));
	}
	
}
