package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.EvaMapper;
import com.sys.service.EvaService;
import com.sys.table.EvaTable;

@Service("evaService")
@Transactional
public class EvaServiceImpl implements EvaService{
	@Autowired
	private EvaMapper evaMapper;
	
	@Override
	public List<EvaTable> selectReportId(int eva_report_id) {
		// TODO 自动生成的方法存根
		List<EvaTable> evaTables=this.evaMapper.select(new EvaTable(0,0,eva_report_id,null,null,null,null));
		return evaTables;
	}

	@Override
	public List<EvaTable> selectAll() {
		// TODO 自动生成的方法存根
		List<EvaTable> evaTables=this.evaMapper.select(new EvaTable(0,0,0,null,null,null,null));
		return evaTables;
	}

	@Override
	public EvaTable findEvaId(EvaTable evaTable) {
		// TODO 自动生成的方法存根
		List<EvaTable> evaTables=this.evaMapper.select(new EvaTable(0,evaTable.getEva_person_id(),evaTable.getEva_report_id(),evaTable.getEva_time(),evaTable.getEva_grade(),evaTable.getEva_contents(),evaTable.getEva_sugg()));
		if(evaTables.size()==1)
		{
			return evaTables.get(0);
		}
		return null;
	}

	@Override
	public int deleteEvaId(int eva_id) {
		// TODO 自动生成的方法存根
		return evaMapper.delete(new EvaTable(eva_id,0, 0, null, null, null, null));
	}

	@Override
	public int inster(EvaTable evaTable) {
		// TODO 自动生成的方法存根
		return evaMapper.inster(evaTable);
	}

}
