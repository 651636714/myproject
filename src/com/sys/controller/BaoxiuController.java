package com.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.service.ReportService;
import com.sys.service.ServiceService;
import com.sys.table.MessageTable;
import com.sys.table.ReportTable;
import com.sys.table.ServiceTable;
import com.sys.table.UserTable;

@Controller
@RequestMapping("/baoxiu")
public class BaoxiuController {
	@Autowired
	private ReportService reportService;
	@Autowired
	private ServiceService serviceService;
	
	@RequestMapping(value="/toadd.action")
	public String toaddweixiu()
	{
		System.out.println("tobaoxiu-xiuli-tianjia");
		return "baoxiu-xiuli-tianjia";
	}
	@RequestMapping(value="/add.action",method=RequestMethod.POST)
	@ResponseBody
	public boolean addAction(String leixing,String shijian,String didian,String miaoshu,HttpSession session)
	{	
		System.out.println("baoxiu_add_action");
		System.out.println(leixing+"——"+shijian+"——"+didian+"——"+miaoshu);
		UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
		ReportTable reportTable=new ReportTable(1,leixing, userTable.getUser_id(), shijian, didian, miaoshu, "未修理","否");
		System.out.println(reportTable);
		reportService.inster(reportTable);
		System.out.println("baoxiu_add_end\n");
		return true;
	}
	@RequestMapping(value="/weixiuadd.action",method=RequestMethod.POST)
	@ResponseBody
	public String weixiuaddAction(String shijian,String jieguo,HttpSession session)
	{	
		System.out.println("baoxiu_weixiuadd_action");
		System.out.println(shijian+"---"+jieguo);
		UserTable userTable=(UserTable)session.getAttribute("USER_SESSION");
		ReportTable reportTablesave=(ReportTable) session.getAttribute("SAVE_reportTable");
		Integer id=reportTablesave.getReport_id();
		ServiceTable serviceTable=new ServiceTable(1,userTable.getUser_id(),id,shijian,jieguo,0);
	    System.out.println(serviceTable);
		int rows1=reportService.updateReportStatusFromReportId(id, "已修理");
		int rows2=serviceService.inster(serviceTable);
		System.out.println("baoxiu_weixiuadd_end\n");
	    if(rows1 > 0&&rows2>0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/delete.action")
	@ResponseBody
	public String deleteAction(Integer id)
	{
		System.out.println("baoxiu_delete_action");
		System.out.println(id);
		int rows=reportService.delete(id);
		System.out.println("baoxiu_delete_end\n");
		if(rows>0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
	
	@RequestMapping(value="/shenheupdate.action")
	@ResponseBody
	public String shenheupdateAction(Integer id) 
	{
		System.out.println("gonggao_shenheupdate_action");
		System.out.println(id);
		int rows=reportService.updateReportIsHandleFromReportId(id, "是");
		System.out.println("gonggao_shenheupdate_end\n");
		if(rows > 0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
	@RequestMapping(value="/xiuliupdate.action")
	@ResponseBody
	public String xiuliupdateAction(Integer id) 
	{
		System.out.println("gonggao_xiuliuupdate_action");
		System.out.println(id);
		int rows=reportService.updateReportStatusFromReportId(id, "已修理");
		System.out.println("gonggao_xiuliuupdate_end\n");
		if(rows > 0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
	@RequestMapping(value="/baocun.action")
	@ResponseBody
	public String baocunAction(Integer id,HttpSession session) 
	{
		System.out.println("baoxiu_weixiutianjiabaochun_action");
		ReportTable reportTable=reportService.selectReportId(id);
		System.out.println(reportTable);
		session.setAttribute("SAVE_reportTable", reportTable);
		System.out.println("baoxiu_weixiutianjiabaochun_end\n");
		return "baoxiu-xiuli-tianjia";
	}
}
