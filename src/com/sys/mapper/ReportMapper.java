package com.sys.mapper;

import java.util.List;

import com.sys.table.ReportTable;

public interface ReportMapper {
	public int update(ReportTable reportTable);//ÐÞ¸Ä
	public List<ReportTable> select(ReportTable reportTable);//²éÑ¯
	public int delete(ReportTable reportTable);//É¾³ý
	public int inster(ReportTable reportTable);//Ìí¼Ó
}
