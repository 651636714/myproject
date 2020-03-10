package com.sys.mapper;

import java.util.List;

import com.sys.table.MessageTable;

public interface MessageMapper {
	public int update(MessageTable messageTable);//ĞŞ¸Ä
	public List<MessageTable> select(MessageTable messageTable);//²éÑ¯
	public int delete(MessageTable messageTable);//É¾³ı
	public int inster(MessageTable messageTable);//Ìí¼Ó
}
