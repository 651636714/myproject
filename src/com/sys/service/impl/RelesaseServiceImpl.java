package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.RelesaseMapper;
import com.sys.service.RelesaseService;
import com.sys.table.RelesaseTable;

@Service("relesaseService")
@Transactional
public class RelesaseServiceImpl implements RelesaseService{
	@Autowired
	private RelesaseMapper relesaseMapper;

	@Override
	public RelesaseTable selectRelesaseId(int relesase_id) {
		// TODO 自动生成的方法存根
		List<RelesaseTable> relesaseTables=relesaseMapper.select(new RelesaseTable(relesase_id,0, 0));
		if(relesaseTables.size()==1)
		{
			return relesaseTables.get(0);
		}
		return null;
	}

	@Override
	public List<RelesaseTable> selectAll() {
		// TODO 自动生成的方法存根
		List<RelesaseTable> relesaseTables=relesaseMapper.select(new RelesaseTable(0,0, 0));
		return relesaseTables;
	}

	@Override
	public int delete(int relesase_id) {
		// TODO 自动生成的方法存根
		return relesaseMapper.delete(new RelesaseTable(relesase_id,0, 0));
	}

	@Override
	public int inster(RelesaseTable relesaseTable) {
		// TODO 自动生成的方法存根
		return relesaseMapper.inster(relesaseTable);
	}
	
}
