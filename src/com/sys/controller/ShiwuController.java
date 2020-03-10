package com.sys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.service.PickService;
import com.sys.table.PickTable;
import com.sys.table.UserTable;

@Controller
@RequestMapping("/shiwu")
public class ShiwuController {
	@Autowired
	private PickService pickService;
	
	@RequestMapping(value="/add.action")
	public String addAction(String shijian,String didian,String miaoshu,String dianhua,HttpSession session)
	{
		System.out.println("shiwu_add_action");
		System.out.println(shijian+"¡ª¡ª"+didian+"¡ª¡ª"+miaoshu+"¡ª¡ª"+dianhua);
		UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
		PickTable pickTable=new PickTable(1, userTable.getUser_id(), shijian, didian, miaoshu, "Î´ÕÒµ½", dianhua);
		System.out.println(pickTable);
		pickService.inster(pickTable);
		System.out.println("shiwu_add_end\n");
		return "shiwu-shenqing";
	}	
	@RequestMapping(value="/delete.action")
	public String deleteAction(Integer id)
	{
		System.out.println("shiwu_delete_action");
		System.out.println(id);
		int rows=pickService.delete(id);
		System.out.println("shiwu_delete_end\n");
		if(rows>0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}	
	@RequestMapping(value="/update.action")
	public String updateAction(Integer id)
	{
		System.out.println("shiwu_shenhe_action");
		System.out.println(id);
	    int rows=pickService.updatePickStatusFromPickId(id, "ÒÑÕÒµ½");
	    System.out.println("shiwu_shenhe_end\n");
	    if(rows > 0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}	
}
