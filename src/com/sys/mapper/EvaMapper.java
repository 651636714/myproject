package com.sys.mapper;

import java.util.List;

import com.sys.table.EvaTable;

public interface EvaMapper {
	public int update(EvaTable evaTable);//�޸�
	public List<EvaTable> select(EvaTable evaTable);//��ѯ
	public int delete(EvaTable evaTable);//ɾ��
	public int inster(EvaTable evaTable);//���
}
