package com.sys.mapper;

import java.util.List;

import com.sys.table.UserTable;

public interface UserMapper {
	public int update(UserTable userTable);//�޸�
	public List<UserTable> select(UserTable userTable);//��ѯ
	public int delete(UserTable userTable);//ɾ��
	public int inster(UserTable userTable);//���
}
