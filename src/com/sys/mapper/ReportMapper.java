package com.sys.mapper;

import java.util.List;

import com.sys.table.ReportTable;

public interface ReportMapper {
	public int update(ReportTable reportTable);//�޸�
	public List<ReportTable> select(ReportTable reportTable);//��ѯ
	public int delete(ReportTable reportTable);//ɾ��
	public int inster(ReportTable reportTable);//���
}
