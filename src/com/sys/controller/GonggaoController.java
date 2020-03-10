package com.sys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.service.GonggaoService;
import com.sys.service.MessageService;
import com.sys.table.MessageTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;

@Controller
@RequestMapping("/gonggao")
public class GonggaoController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private GonggaoService gonggaoService;
	
	@RequestMapping(value="/add.action",method=RequestMethod.POST)
	@ResponseBody
	public boolean addAction(String message,HttpServletRequest request)
	{	
		System.out.println("gonggao_add_action");
		System.out.println(message);
		HttpSession session = request.getSession();
		UserTable userTable = (UserTable) session.getAttribute("USER_SESSION"); 
		MessageTable messageTable=new MessageTable(1, userTable.getUser_id(), message, "Œ¥…Û∫À");
		System.out.println(messageTable);
		messageService.inster(messageTable);
		System.out.println(messageService.selectAll());
		System.out.println("gonggao_add_end\n");
		return true;
	}
	@RequestMapping(value="/select.action",method=RequestMethod.POST)
	public String  selectAction(String id,Integer data,Model model)
	{	
		System.out.println("gonggao_select_action");
		System.out.println(id+"-"+data);
		List<MessageTable> messageTablesList=new ArrayList<MessageTable>();
		if(id!=null&&data!=null)
		{
			if(id.equals("message_id"))
			{
			System.out.println("select for message_id");
			messageTablesList.add(messageService.selectMessageId(data));
			}
			else
			{
				if(id.equals("message_user_id"))
				{
				System.out.println("select for message_user_id");
				messageTablesList=messageService.selectMessageUserId(data);
				}
				else
				{
				messageTablesList=messageService.selectAll();
				}
			}
		}
		else
		{
			messageTablesList=messageService.selectAll();
		}
		System.out.println(messageTablesList);
		Page<MessageTable> messageTablePage=gonggaoService.findMessagePage(messageTablesList);
		model.addAttribute("page", messageTablePage);
		System.out.println("gonggao_select_end\n");
		return "gonggao-guanli";
	}
	@RequestMapping(value="/delete.action")
	@ResponseBody
	public String deleteAction(Integer id)
	{
		System.out.println("gonggao_delete_action");
		System.out.println(id);
		int rows=messageService.delete(id);
		System.out.println("gonggao_delete_end\n");
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
	@ResponseBody
	public String updateAction(Integer id) 
	{
		System.out.println("gonggao_update_action");
		System.out.println(id);
		int rows=messageService.updateMessageStatusFromMessageId(id, "“—…Û∫À");
		System.out.println("gonggao_update_end\n");
		if(rows > 0)
		{
			return "OK";
		}
		else
		{
			return "FAIL";
		}
	}
}
