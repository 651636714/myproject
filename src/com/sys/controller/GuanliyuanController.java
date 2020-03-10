package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.service.RoleService;
import com.sys.service.UserService;
import com.sys.table.RoleTable;
import com.sys.table.UserTable;

@Controller
@RequestMapping("/guanliyuan")
public class GuanliyuanController {
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/tojueseadd.action")
	public String tojueseaddAction() 
	{
		System.out.println("guanliyuan_tojueseadd_action");
	    return "guanliyuan-jueseguanli-tianjia";
	}
	@RequestMapping(value="/jueseadd.action")
	public String jueseaddAction(String name,Integer leixing,String miaoshu,String beizhu) 
	{
		System.out.println("guanliyuan_jueseadd_action");
		System.out.println(name+"--"+leixing+"--"+miaoshu+"--"+beizhu);
		RoleTable roleTable=new RoleTable(1, name, leixing, miaoshu, beizhu);
		int row=roleService.inster(roleTable);
		System.out.println("guanliyuan_jueseadd_end");
		if(row>0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/juesedelete.action")
	@ResponseBody
	public String juesedeleteAction(Integer id)
	{
		System.out.println("guanliyuan_juesedelete_action");
		System.out.println(id);
		int row=roleService.delete(id);
		System.out.println("guanliyuan_juesedelete_end");
		if(row>0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
	@RequestMapping(value="/toyonghuadd.action")
	public String toyonghuaddAction() 
	{
		System.out.println("guanliyuan_toyonghuadd_action");
	    return "guanliyuan-yonghuguanli-tianjia";
	}
	@RequestMapping(value="/yonghuadd.action")
	public String yonghuaddAction(String name,String mima,Integer juesebianhao,Integer bianhao,String xingming,String xingbie,String lianxifangshi,String beizhu) 
	{
		System.out.println("guanliyuan_yonghuadd_action");
		System.out.println(name+"--"+mima+"--"+juesebianhao+"--"+bianhao+"--"+xingming+"--"+xingbie+"--"+lianxifangshi+"--"+beizhu);
		UserTable userTable=new UserTable(1, name, mima, juesebianhao,beizhu, bianhao,xingming,xingbie,lianxifangshi);
		int row=userService.inster(userTable);
		System.out.println("guanliyuan_yonghuadd_end");
		if(row>0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/yonghudelete.action")
	@ResponseBody
	public String yonghudeleteAction(Integer id)
	{
		System.out.println("guanliyuan_yonghudelete_action");
		System.out.println(id);
		int row=userService.delete(id);
		System.out.println("guanliyuan_yonghudelete_end");
		if(row>0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
}
