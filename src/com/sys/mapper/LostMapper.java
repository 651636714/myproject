package com.sys.mapper;

import java.util.List;

import com.sys.table.LostTable;

public interface LostMapper {
	public int update(LostTable lostTable);//�޸�
	public List<LostTable> select(LostTable lostTable);//��ѯ
	public int delete(LostTable lostTable);//ɾ��
	public int inster(LostTable lostTable);//���
}
