package com.sys.service;

import java.util.List;

import com.sys.table.MessageTable;

public interface MessageService {
	public int updateMessageStatusFromMessageId(int message_id,String message_status);//ͨ��ID�޸�״̬
	public MessageTable selectMessageId(int message_id);//id ��ѯ
	public List<MessageTable> selectMessageUserId(int message_user_id);//������id ��ѯ
	public List<MessageTable> selectMessageStatus(String message_status);//״̬ ��ѯ 
	public List<MessageTable> selectAll();//��ѯ����
	public int delete(int message_id);//ɾ��
	public int inster(MessageTable messageTable);//��� 
}
