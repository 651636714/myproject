package com.sys.mapper;

import java.util.List;

import com.sys.table.MessageTable;

public interface MessageMapper {
	public int update(MessageTable messageTable);//�޸�
	public List<MessageTable> select(MessageTable messageTable);//��ѯ
	public int delete(MessageTable messageTable);//ɾ��
	public int inster(MessageTable messageTable);//���
}
