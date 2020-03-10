package com.sys.mapper;

import java.util.List;

import com.sys.table.EvaTable;

public interface EvaMapper {
	public int update(EvaTable evaTable);//ĞŞ¸Ä
	public List<EvaTable> select(EvaTable evaTable);//²éÑ¯
	public int delete(EvaTable evaTable);//É¾³ı
	public int inster(EvaTable evaTable);//Ìí¼Ó
}
