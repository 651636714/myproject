package com.sys.mapper;

import java.util.List;

import com.sys.table.Lost_PickTable;

public interface Lost_PickMapper {
	public int update(Lost_PickTable evaTable);//�޸�
	public List<Lost_PickTable> select(Lost_PickTable lost_PickTable);//��ѯ
	public int delete(Lost_PickTable lost_PickTable);//ɾ��
	public int inster(Lost_PickTable lost_PickTable);//���
}
