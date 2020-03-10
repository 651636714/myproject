package com.sys.service;

import java.util.List;

import com.sys.table.EvaTable;

public interface EvaService {
	public List<EvaTable> selectReportId(int eva_report_id);
	public List<EvaTable> selectAll();
	public EvaTable findEvaId(EvaTable evaTable);
	public int deleteEvaId(int eva_id);
	public int inster(EvaTable evaTable);
}
