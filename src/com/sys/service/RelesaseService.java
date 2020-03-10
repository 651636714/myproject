package com.sys.service;

import java.util.List;

import com.sys.table.RelesaseTable;

public interface RelesaseService {
	public RelesaseTable selectRelesaseId(int relesase_id);//启事id 查询
	public List<RelesaseTable> selectAll();//查询所有
	public int delete(int relesase_id);//删除
	public int inster(RelesaseTable relesaseTable);//添加
}
