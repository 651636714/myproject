package com.sys.service;

import java.util.List;

import com.sys.table.ServiceTable;

public interface ServiceService{
	public int updateEvaIdFromServiceId(int service_id,int service_eva_id);//����id�޸�����id
	public List<ServiceTable> selectServicePersonId(int service_person_id);//������id ��ѯ
	public ServiceTable selectServiceId(int service_id);//id ��ѯ
	public List<ServiceTable> selectAll();//��ѯ����
	public int delete(int service_id);//ɾ��
	public int inster(ServiceTable serviceTable);//���
}
