package com.sys.service;

import java.util.List;

import com.sys.table.User_RoleTable;

public interface User_RoleService {
	public List<User_RoleTable> selectRoleId(int role_id);//��ɫid ��ѯ
	public User_RoleTable selectUserId(int user_id);//�û�id ��ѯ
	public List<User_RoleTable> selectAll();//��ѯ����
	
	public int deleteRoleId(int role_id);//�����û�idɾ�� 
	public int deleteUserId(int user_id);//���ݽ�ɫidɾ��
	public int delete(int user_role_id);//ɾ��
	public int inster(User_RoleTable user_RoleTable);//���
}
