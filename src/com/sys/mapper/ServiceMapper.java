package com.sys.mapper;

import java.util.List;

import com.sys.table.ServiceTable;

public interface ServiceMapper {
	public int update(ServiceTable serviceTable);//�޸�
	public List<ServiceTable> select(ServiceTable serviceTable);//��ѯ
	public int delete(ServiceTable serviceTable);//ɾ��
	public int inster(ServiceTable serviceTable);//���
}
