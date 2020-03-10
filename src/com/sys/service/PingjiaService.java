package com.sys.service;

import java.util.List;

import com.sys.table.EvaTable;
import com.sys.table.ServiceTable;
import com.sys.utils.Page;

public interface PingjiaService {
	public Page<ServiceTable> findServiceTablePage(List<ServiceTable> serviceTables);
	public Page<EvaTable> findEvaTablePage(List<EvaTable> evaTables);
}
