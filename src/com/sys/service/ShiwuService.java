package com.sys.service;

import java.util.List;

import com.sys.table.PickTable;
import com.sys.utils.Page;

public interface ShiwuService {
	public Page<PickTable> findPickPage(List<PickTable> pickTables);
}
