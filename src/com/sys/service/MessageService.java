package com.sys.service;

import java.util.List;

import com.sys.table.MessageTable;

public interface MessageService {
	public int updateMessageStatusFromMessageId(int message_id,String message_status);//通过ID修改状态
	public MessageTable selectMessageId(int message_id);//id 查询
	public List<MessageTable> selectMessageUserId(int message_user_id);//申请人id 查询
	public List<MessageTable> selectMessageStatus(String message_status);//状态 查询 
	public List<MessageTable> selectAll();//查询所有
	public int delete(int message_id);//删除
	public int inster(MessageTable messageTable);//添加 
}
