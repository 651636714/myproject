package com.sys.mapper;

import java.util.List;

import com.sys.table.RoleTable;


public interface RoleMapper {
	public int update(RoleTable roleTable);//�޸�
	public List<RoleTable> select(RoleTable roleTable);//��ѯ
	public int delete(RoleTable roleTable);//ɾ��
	public int inster(RoleTable roleTable);//���
}
