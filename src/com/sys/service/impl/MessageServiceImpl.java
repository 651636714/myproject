package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.MessageMapper;
import com.sys.service.MessageService;
import com.sys.table.MessageTable;

@Service("messageService")
@Transactional
public class MessageServiceImpl implements MessageService{
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public MessageTable selectMessageId(int message_id) {
		// TODO 自动生成的方法存根
		List<MessageTable> messageTables=messageMapper.select(new MessageTable(message_id, 0, null, null));
		if(messageTables.size()==1)
		{
			return messageTables.get(0);
		}
		return null;
	}

	@Override
	public List<MessageTable> selectMessageUserId(int message_user_id) {
		// TODO 自动生成的方法存根
		List<MessageTable> messageTables=messageMapper.select(new MessageTable( 0,message_user_id, null, null));
		return messageTables;
	}

	@Override
	public List<MessageTable> selectMessageStatus(String message_status) {
		// TODO 自动生成的方法存根
		List<MessageTable> messageTables=messageMapper.select(new MessageTable( 0,0, null, message_status));
		return messageTables;
	}

	@Override
	public List<MessageTable> selectAll() {
		// TODO 自动生成的方法存根
		List<MessageTable> messageTables=messageMapper.select(new MessageTable( 0,0, null, null));
		return messageTables;
	}

	@Override
	public int delete(int message_id) {
		// TODO 自动生成的方法存根
		return messageMapper.delete(new MessageTable(message_id,0, null, null));
	}

	@Override
	public int inster(MessageTable messageTable) {
		// TODO 自动生成的方法存根
		return messageMapper.inster(messageTable);
	}

	@Override
	public int updateMessageStatusFromMessageId(int message_id, String message_status) {
		// TODO 自动生成的方法存根
		return messageMapper.update(new MessageTable(message_id, 0, null, message_status));
	}
	
}
