package com.sys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.service.EvaService;
import com.sys.service.PingjiaService;
import com.sys.service.ServiceService;
import com.sys.table.EvaTable;
import com.sys.table.ServiceTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;


@Controller
@RequestMapping(value="/pingjia")
public class PingjiaController {
	@Autowired
	private ServiceService serviceService;
	@Autowired
	private EvaService evaService;
	@Autowired
	private PingjiaService pingjiaService;
	
	@RequestMapping(value="/toadd.action")
	public String toaddAction()
	{
		System.out.println("pingjia_toadd_action");
		return "pingjia-tianjia-pingjia";
	}
	@RequestMapping(value="/baocun.action")
	@ResponseBody
	public String baocunAction(Integer id,HttpSession session) 
	{
		
		System.out.println("pingjia_tianjiabaochun_action");
		ServiceTable serviceTable=serviceService.selectServiceId(id);
		System.out.println(serviceTable);
		session.setAttribute("SAVE_serviceTable", serviceTable);
		System.out.println("pingjia_tianjiabaochun_action");
		return "pingjia-tianjia-pingjia";
	}
	@RequestMapping(value="/add.action",method=RequestMethod.POST)
	@ResponseBody
	public String addAction(String shijian,String jibie,String nierong,String jianyi,HttpSession session)
	{	
		System.out.println("pingjia_tianjia_action");
		System.out.println(shijian+"---"+jibie+"---"+nierong+"---"+jianyi);
		UserTable userTable=(UserTable)session.getAttribute("USER_SESSION");
		ServiceTable serviceTablesave=(ServiceTable) session.getAttribute("SAVE_serviceTable");
		Integer id=serviceTablesave.getService_id();
		System.out.println(userTable);
		System.out.println(serviceTablesave);
		EvaTable evaTable=new EvaTable(1,userTable.getUser_id(),id,shijian,jibie,nierong ,jianyi);
		int rows1=evaService.inster(evaTable);
		
	    EvaTable evaTables=evaService.findEvaId(evaTable);
		System.out.println(evaTables);
		int rows2=serviceService.updateEvaIdFromServiceId(id, evaTables.getEva_id());
		System.out.println("pingjia_tianjia_end");
		if(rows1>0&&rows2 > 0)
		{
	        return "OK";
	    }
		else
		{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/chakan.action")
	public String chakanAction(Integer data,Model model)
	{
		System.out.println("pingjia_chakan_action");
		System.out.println(data);
		List<EvaTable> evaTablesList=new ArrayList<EvaTable>();
		if(data==null)
		{
			evaTablesList=evaService.selectAll();
		}
		else
		{
			evaTablesList=evaService.selectReportId(data);
		}
		Page<EvaTable> evaTablePage=pingjiaService.findEvaTablePage(evaTablesList);
		model.addAttribute("page", evaTablePage);		
		System.out.println("pingjia_chakan_end");
		return "pingjia-shenhe";
	}
}
