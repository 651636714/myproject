package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.PickMapper;
import com.sys.service.PickService;
import com.sys.table.PickTable;

@Service("pickService")
@Transactional
public class PickServiceImpl implements PickService{
	@Autowired
	private PickMapper pickMapper;

	@Override
	public PickTable selectPickId(int pick_id) {
		// TODO 自动生成的方法存根
		List<PickTable> pickTables=pickMapper.select(new PickTable(pick_id, 0, null, null, null, null, null));
		if(pickTables.size()==1)
		{
			return pickTables.get(0);
		}
		return null;
	}
	public List<PickTable> selectPickStatus(String pick_status) {
		// TODO 自动生成的方法存根
		List<PickTable> pickTables=pickMapper.select(new PickTable(0, 0, null, null, null, pick_status, null));
		return pickTables;
	}

	@Override
	public List<PickTable> selectAll() {
		// TODO 自动生成的方法存根
		List<PickTable> pickTables=pickMapper.select(new PickTable(0, 0, null, null, null, null, null));
		return pickTables;
	}

	@Override
	public int delete(int pick_id) {
		// TODO 自动生成的方法存根
		return pickMapper.delete(new PickTable(pick_id, 0, null, null, null, null, null));
	}

	@Override
	public int inster(PickTable pickTable) {
		// TODO 自动生成的方法存根
		return pickMapper.inster(pickTable);
	}
	@Override
	public int updatePickStatusFromPickId(int pick_id, String pick_status) {
		// TODO 自动生成的方法存根
		return pickMapper.update(new PickTable(pick_id, 0, null, null, null, pick_status, null));
	}
	
}
