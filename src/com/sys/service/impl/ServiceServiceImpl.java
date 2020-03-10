package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.mapper.ServiceMapper;
import com.sys.service.ServiceService;
import com.sys.table.ServiceTable;

@Service("serviceService")
@Transactional
public class ServiceServiceImpl implements ServiceService{
	@Autowired
	private ServiceMapper serviceMapper;

	@Override
	public List<ServiceTable> selectServicePersonId(int service_person_id) {
		// TODO �Զ����ɵķ������
		List<ServiceTable> serviceTables=serviceMapper.select(new ServiceTable(0, service_person_id, 0, null, null, 0));
		return serviceTables;
	}

	@Override
	public ServiceTable selectServiceId(int service_id) {
		// TODO �Զ����ɵķ������
		List<ServiceTable> serviceTables=serviceMapper.select(new ServiceTable(service_id, 0, 0, null, null, 0));
		if(serviceTables.size()==1)
		{
			return serviceTables.get(0);
		}
		return null;
	}

	@Override
	public List<ServiceTable> selectAll() {
		// TODO �Զ����ɵķ������
		List<ServiceTable> serviceTables=serviceMapper.select(new ServiceTable(0, 0, 0, null, null, 0));
		return serviceTables;
	}

	@Override
	public int delete(int service_id) {
		// TODO �Զ����ɵķ������
		return serviceMapper.delete(new ServiceTable(service_id, 0, 0, null, null, 0));
	}

	@Override
	public int inster(ServiceTable serviceTable) {
		// TODO �Զ����ɵķ������
		return serviceMapper.inster(serviceTable);
	}

	@Override
	public int updateEvaIdFromServiceId(int service_id, int service_eva_id) {
		// TODO �Զ����ɵķ������
		return serviceMapper.update(new ServiceTable(service_id, 0, 0, null, null, service_eva_id));
	}
	
}
