package com.sys.service;

import java.util.List;

import com.sys.table.LostTable;

public interface LostService {
	public int updateLostStatusfromLostId(int lost_id,String lost_status);//ͨ��ID�޸�״̬
	public LostTable selectLostId(int lost_id);
	public List<LostTable> selectLostStatus(String lost_status);//��ѯ״̬
	public List<LostTable> selectAll();//��ѯ���� 
	public int delete(int lost_id);//ɾ��
	public int inster(LostTable lostTable);//���
}
