package com.sys.service;

import java.util.List;
import com.sys.table.RoleTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;

public interface GuanliyuanService {
	public Page<RoleTable> findRolePage(List<RoleTable> roleTables);
	public Page<UserTable> findUserPage(List<UserTable> userTables);
}
