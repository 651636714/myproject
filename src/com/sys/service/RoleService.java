package com.sys.service;

import java.util.List;

import com.sys.table.RoleTable;

public interface RoleService {
	public RoleTable selectRoleId(int role_id);//��ɫid ��ѯ
	public List<RoleTable> selectAll();//��ѯ����
	public int delete(int role_id);//ɾ��
	public int inster(RoleTable roleTable);//���
}
