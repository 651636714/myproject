package com.sys.mapper;

import java.util.List;

import com.sys.table.RelesaseTable;

public interface RelesaseMapper {
	public int update(RelesaseTable relesaseTable);//�޸�
	public List<RelesaseTable> select(RelesaseTable relesaseTable);//��ѯ
	public int delete(RelesaseTable relesaseTable);//ɾ��
	public int inster(RelesaseTable relesaseTable);//���
}
