package com.sys.service;

import java.util.List;

import com.sys.table.RelesaseTable;

public interface RelesaseService {
	public RelesaseTable selectRelesaseId(int relesase_id);//����id ��ѯ
	public List<RelesaseTable> selectAll();//��ѯ����
	public int delete(int relesase_id);//ɾ��
	public int inster(RelesaseTable relesaseTable);//���
}
