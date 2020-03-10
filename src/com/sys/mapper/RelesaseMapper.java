package com.sys.mapper;

import java.util.List;

import com.sys.table.RelesaseTable;

public interface RelesaseMapper {
	public int update(RelesaseTable relesaseTable);//ĞŞ¸Ä
	public List<RelesaseTable> select(RelesaseTable relesaseTable);//²éÑ¯
	public int delete(RelesaseTable relesaseTable);//É¾³ı
	public int inster(RelesaseTable relesaseTable);//Ìí¼Ó
}
