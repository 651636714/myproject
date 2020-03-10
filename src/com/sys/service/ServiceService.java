package com.sys.service;

import java.util.List;

import com.sys.table.ServiceTable;

public interface ServiceService{
	public int updateEvaIdFromServiceId(int service_id,int service_eva_id);//根据id修改评价id
	public List<ServiceTable> selectServicePersonId(int service_person_id);//申请人id 查询
	public ServiceTable selectServiceId(int service_id);//id 查询
	public List<ServiceTable> selectAll();//查询所有
	public int delete(int service_id);//删除
	public int inster(ServiceTable serviceTable);//添加
}
