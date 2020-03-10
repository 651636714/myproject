package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.Lost_PickMapper;
import com.sys.service.Lost_PickService;
import com.sys.table.Lost_PickTable;

@Service("lost_PickService")
@Transactional
public class Lost_pickServiceImpl implements Lost_PickService{
	@Autowired
	private Lost_PickMapper lost_pickMapper;
	
	@Override
	public List<Lost_PickTable> selectLostId(int lost_id) {
		// TODO 自动生成的方法存根
		List<Lost_PickTable> lost_PickTables=lost_pickMapper.select(new Lost_PickTable(0,lost_id, 0));
		return lost_PickTables;
	}

	@Override
	public List<Lost_PickTable> selectPickId(int pick_id) {
		// TODO 自动生成的方法存根
		List<Lost_PickTable> lost_PickTables=lost_pickMapper.select(new Lost_PickTable(0, 0,pick_id));
		return lost_PickTables;
	}

	@Override
	public List<Lost_PickTable> selectAll() {
		// TODO 自动生成的方法存根
		List<Lost_PickTable> lost_PickTables=lost_pickMapper.select(new Lost_PickTable(0, 0,0));
		return lost_PickTables;
	}

	@Override
	public int deleteLostPickId(int lost_pick_id) {
		// TODO 自动生成的方法存根
		return lost_pickMapper.delete(new Lost_PickTable(lost_pick_id, 0,0));
	}

	@Override
	public int inster(Lost_PickTable lost_PickTable) {
		// TODO 自动生成的方法存根
		return lost_pickMapper.inster(lost_PickTable);
	}

}
