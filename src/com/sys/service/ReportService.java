package com.sys.service;

import java.util.List;

import com.sys.table.ReportTable;

public interface ReportService {
	public int updateReportIsHandleFromReportId(int report_id,String report_is_handle);//����id�޸����
	public int updateReportStatusFromReportId(int report_id,String report_status);//����id�޸�״̬
	public ReportTable selectReportId(int report_id);//��ѯid
	public List<ReportTable> selectReportStatus(String report_status);//��ѯ״̬
	public List<ReportTable> selectReportIsHandle(String report_is_handle);//��ѯ���
	public List<ReportTable> selectAll();//��ѯ����
	public int delete(int report_id);//����idɾ��
	public int inster(ReportTable reportTable);//��ӽ�ɫ��
}
