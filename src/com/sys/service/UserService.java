package com.sys.service;

import java.util.List;

import com.sys.table.UserTable;

public interface UserService {
	public UserTable selectUserId(int user_id);//�û�id ��ѯ
	public UserTable selectlogin(String user_login_name,String user_psw);//�û��� ��ѯ
	public int selectCount();//ͳ���û���
	public List<UserTable> selectAll();//��ѯ����
	public int delete(int user_id);//ɾ��
	public int inster(UserTable userTable);//���
}
