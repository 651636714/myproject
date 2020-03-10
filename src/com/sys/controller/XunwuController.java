package com.sys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.service.LostService;
import com.sys.table.LostTable;
import com.sys.table.UserTable;

@Controller
@RequestMapping("/xunwu")
public class XunwuController {
	@Autowired
	private LostService lostService;
	
	@RequestMapping(value="/add.action")
	public String addAction(String shijian,String didian,String miaoshu,String dianhua,HttpSession session)
	{
		System.out.println("xunwu_add_action");
		System.out.println(shijian+"¡ª"+didian+"¡ª"+miaoshu+"¡ª"+dianhua);
		UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
		LostTable lostTable=new LostTable(1, userTable.getUser_id(), shijian, didian, miaoshu, "Î´ÕÒµ½", dianhua);
		System.out.println(lostTable);
		lostService.inster(lostTable);
		System.out.println("xunwu_add_end\n");
		return "xunwu-shenqin";
	}	
	@RequestMapping(value="/delete.action")
	public String deleteAction(Integer id)
	{
		System.out.println("xunwu_delete_action");
		System.out.println(id);
		int rows=lostService.delete(id);
		System.out.println("xunwu_delete_end\n");
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
		System.out.println("xunwu_shenhe_action");
		System.out.println(id);
	    int rows=lostService.updateLostStatusfromLostId(id, "ÒÑÕÒµ½");
	    System.out.println("xunwu_shenhe_end\n");
	    if(rows > 0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}	
}
