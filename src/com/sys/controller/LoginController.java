package com.sys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.service.MessageService;
import com.sys.service.UserService;
import com.sys.service.WelcomeService;
import com.sys.table.MessageTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private MessageService messageService;
	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/login.action")
	public String login(String name,String psw,HttpSession session)
	{
		System.out.println(name+" "+psw);
		System.out.println("login.action");
		UserTable userTable=userService.selectlogin(name,psw);
		if(userTable!=null)
		{
			System.out.println(userTable);
			session.setAttribute("USER_SESSION", userTable);
			System.out.println("toindex\n");
			return "index";
		}
		System.out.println("tologin\n");
		return "login";
	}
	@RequestMapping("/welcome.action")
	public String welcome(Model model)
	{
		List<MessageTable> messageTablesList=messageService.selectMessageStatus("“—…Û∫À");
		System.out.println(messageTablesList);
		Page<MessageTable> messageTablePage=welcomeService.findMessagePage(messageTablesList);
		model.addAttribute("page", messageTablePage);
		System.out.println("welcome\n");
		return "welcome";
	}
}
