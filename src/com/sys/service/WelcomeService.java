package com.sys.service;

import java.util.List;

import com.sys.table.MessageTable;
import com.sys.utils.Page;

public interface WelcomeService {
	public Page<MessageTable> findMessagePage(List<MessageTable> messageTablesList);
}
