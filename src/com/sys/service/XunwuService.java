package com.sys.service;

import java.util.List;

import com.sys.table.LostTable;
import com.sys.utils.Page;

public interface XunwuService {
	public Page<LostTable> findXunwuPage(List<LostTable> lostTables);
}
