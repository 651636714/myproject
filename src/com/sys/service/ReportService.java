package com.sys.service;

import java.util.List;

import com.sys.table.ReportTable;

public interface ReportService {
	public int updateReportIsHandleFromReportId(int report_id,String report_is_handle);//根据id修改审核
	public int updateReportStatusFromReportId(int report_id,String report_status);//根据id修改状态
	public ReportTable selectReportId(int report_id);//查询id
	public List<ReportTable> selectReportStatus(String report_status);//查询状态
	public List<ReportTable> selectReportIsHandle(String report_is_handle);//查询审核
	public List<ReportTable> selectAll();//查询所有
	public int delete(int report_id);//根据id删除
	public int inster(ReportTable reportTable);//添加角色表
}
