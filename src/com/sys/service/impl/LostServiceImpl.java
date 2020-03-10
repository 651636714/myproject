package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.LostMapper;
import com.sys.service.LostService;
import com.sys.table.LostTable;

@Service("lostService")
@Transactional
public class LostServiceImpl implements LostService{
	@Autowired
	private LostMapper lostMapper;

	@Override
	public LostTable selectLostId(int lost_id) {
		// TODO 自动生成的方法存根
		List<LostTable> lostTables=this.lostMapper.select(new LostTable(lost_id,0,null,null,null,null,null));
		if(lostTables.size()==1)
		{
			return lostTables.get(0);
		}
		return null;
	}

	@Override
	public List<LostTable> selectLostStatus(String lost_status) {
		// TODO 自动生成的方法存根
		List<LostTable> lostTables=this.lostMapper.select(new LostTable(0,0,null,null,null,lost_status,null));
		return lostTables;
	}

	@Override
	public List<LostTable> selectAll() {
		// TODO 自动生成的方法存根
		List<LostTable> lostTables=this.lostMapper.select(new LostTable(0,0,null,null,null,null,null));
		return lostTables;
	}

	@Override
	public int delete(int lost_id) {
		// TODO 自动生成的方法存根
		return lostMapper.delete(new LostTable(lost_id, 0,null,null,null,null,null));
	}

	@Override
	public int inster(LostTable lostTable) {
		// TODO 自动生成的方法存根
		return lostMapper.inster(lostTable);
	}

	@Override
	public int updateLostStatusfromLostId(int lost_id, String lost_status) {
		// TODO 自动生成的方法存根
		return lostMapper.update(new LostTable(lost_id, 0, null, null, null, lost_status, null));
	}
	
}
