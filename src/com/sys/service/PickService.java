package com.sys.service;

import java.util.List;

import com.sys.table.PickTable;

public interface PickService {
	public int updatePickStatusFromPickId(int pick_id,String pick_status);//ͨ��ID�޸�״̬
	public PickTable selectPickId(int pick_id);//pick_id ��ѯ
	public List<PickTable> selectPickStatus(String pick_status);//״̬ ��ѯ
	public List<PickTable> selectAll();//��ѯ����
	public int delete(int pick_id);//ɾ�� 
	public int inster(PickTable pickTable);//���
}
