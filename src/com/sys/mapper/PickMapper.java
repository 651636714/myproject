package com.sys.mapper;

import java.util.List;

import com.sys.table.PickTable;

public interface PickMapper {
	public int update(PickTable pickTable);//�޸�
	public List<PickTable> select(PickTable pickTable);//��ѯ
	public int delete(PickTable pickTable);//ɾ��
	public int inster(PickTable pickTable);//���
}
