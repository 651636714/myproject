package com.sys.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.management.relation.Role;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.service.BaoxiuService;
import com.sys.service.EvaService;
import com.sys.service.GonggaoService;
import com.sys.service.GuanliyuanService;
import com.sys.service.LostService;
import com.sys.service.MessageService;
import com.sys.service.PickService;
import com.sys.service.PingjiaService;
import com.sys.service.ReportService;
import com.sys.service.RoleService;
import com.sys.service.ServiceService;
import com.sys.service.ShiwuService;
import com.sys.service.UserService;
import com.sys.service.XunwuService;
import com.sys.table.EvaTable;
import com.sys.table.LostTable;
import com.sys.table.MessageTable;
import com.sys.table.PickTable;
import com.sys.table.ReportTable;
import com.sys.table.RoleTable;
import com.sys.table.ServiceTable;
import com.sys.table.UserTable;
import com.sys.utils.Page;

@Controller
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private GonggaoService gonggaoService;
	@Autowired
	private LostService lostService;
	@Autowired
	private XunwuService xunwuService;
	@Autowired
	private PickService pickService;
	@Autowired
	private ShiwuService shiwuService;
	@Autowired
	private ReportService reportService;
	@Autowired
	private BaoxiuService baoxiuService;
	@Autowired
	private ServiceService serviceService;
	@Autowired
	private EvaService evaService;
	@Autowired
	private PingjiaService pingjiaService;
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private GuanliyuanService guanliyuanService;
	
	//公告
	@RequestMapping("/togonggao-shenqing.action")
	public String togonggaoshenqing()
	{
		System.out.println("togonggao_shenqing\n");
		return "gonggao-shenqing";
	}
	@RequestMapping("/togonggao-shenhe.action")
	public String togonggaoshenhe(Model model)
	{
		List<MessageTable> messageTablesList=messageService.selectAll();
		Page<MessageTable> messageTablePage=gonggaoService.findMessagePage(messageTablesList);
		model.addAttribute("page", messageTablePage);
		System.out.println("togonggao_shenhe\n");
		return "gonggao-shenhe";
	}
	@RequestMapping("/togonggao-guanli.action")
	public String togonggaoguanli(Model model)
	{
		List<MessageTable> messageTablesList=messageService.selectAll();
		Page<MessageTable> messageTablePage=gonggaoService.findMessagePage(messageTablesList);
		model.addAttribute("page", messageTablePage);
		System.out.println("togonggao_guanli\n");
		return "gonggao-guanli";
	}
	
	//寻物
	@RequestMapping("/toxunwu-shenqing.action")
	public String toxunwushenqing()
	{
		System.out.println("toxunwu_shenqing\n");
		return "xunwu-shenqing";
	}
	@RequestMapping("/toxunwu-shenhe.action")
	public String toxunwushenhe(Model model)
	{
		List<LostTable> lostTables=lostService.selectAll();
		Page<LostTable> lostTablePage=xunwuService .findXunwuPage(lostTables);
		model.addAttribute("page", lostTablePage);
		System.out.println("toxunwu_shenhe\n");
		return "xunwu-shenhe";
	}
	
	//失物
	@RequestMapping("/toshiwu-shenqing.action")
	public String toshiwushenqing()
	{
		System.out.println("toshiwu_shenqing\n");
		return "shiwu-shenqing";
	}
	@RequestMapping("/toshiwu-shenhe.action")
	public String toshiwushenhe(Model model)
	{
		List<PickTable> pickTables=pickService.selectAll();
		Page<PickTable> pickTablePage=shiwuService.findPickPage(pickTables);
		model.addAttribute("page", pickTablePage);
		System.out.println("toshiwu_shenhe\n");
		return "shiwu-shenhe";
	}
	
	//报修
	@RequestMapping("/tobaoxiu-shenqing.action")
	public String tobaoxiushenqing()
	{
		System.out.println("tobaoxiu_shenqing\n");
		return "baoxiu-shenqing";
	}
	@RequestMapping("/tobaoxiu-shenhe.action")
	public String tobaoxiushenhe(Model model)
	{
		List<ReportTable> reportTablesList=reportService.selectReportIsHandle("否");
		Page<ReportTable> reportTablePage=baoxiuService.findReportPage(reportTablesList);
		model.addAttribute("page", reportTablePage);
		System.out.println("tobaoxiu_shenhe\n");
		return "baoxiu-shenhe";
	}
	@RequestMapping("/tobaoxiu-xiuli.action")
	public String tobaoxiuxiuli(Model model,HttpSession session)
	{
		List<ReportTable> reportTablesList=reportService.selectReportIsHandle("是");
		Page<ReportTable> reportTablePage=baoxiuService.findReportPage(reportTablesList);
		model.addAttribute("page1", reportTablePage);
		
		UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
		List<ServiceTable> serviceTables=serviceService.selectServicePersonId(userTable.getUser_id());
		Page<ServiceTable> serviceTablePage=baoxiuService.findServiceTablePage(serviceTables);
		model.addAttribute("page2", serviceTablePage);
		System.out.println("tobaoxiu_xiuli\n");
		return "baoxiu-xiuli";
	}
	
	//评价
	@RequestMapping("/topingjia-shenqing.action")
	public String topingjiashenqing(Model model)
	{
		List<ServiceTable> serviceTablesList=serviceService.selectAll();
		Page<ServiceTable> serviceTablePage=pingjiaService.findServiceTablePage(serviceTablesList);
		model.addAttribute("page", serviceTablePage);
		System.out.println("topingjia_shenqing\n");
		return "pingjia-shenqing";
	}
	@RequestMapping("/topingjia-shenhe.action")
	public String topingjiashenhe(Model model)
	{
		List<EvaTable> evaTablesList=evaService.selectAll();
		Page<EvaTable> evaTablePage=pingjiaService.findEvaTablePage(evaTablesList);
		model.addAttribute("page", evaTablePage);
		System.out.println("topingjia_shenhe\n");
		return "pingjia-shenhe";
	}
	//管理员
	@RequestMapping("/toguanliyuan-yonghuguanli.action")
	public String toguanliyuanyonghuguanli(Model model)
	{
		List<UserTable> userTables=userService.selectAll();
		Page<UserTable> userTablePage=guanliyuanService.findUserPage(userTables);
		model.addAttribute("page", userTablePage);
		System.out.println("toguanliyuan_yonghuguanli\n");
		return "guanliyuan-yonghuguanli";
	}
	@RequestMapping("/toguanliyuan-jueseguanli.action")
	public String toguanliyuanjueseguanli(Model model)
	{
		List<RoleTable> roleTables=roleService.selectAll();
		Page<RoleTable> roleTablePage=guanliyuanService.findRolePage(roleTables);
		model.addAttribute("page", roleTablePage);
		System.out.println("toguanliyuan_jueseguanli\n");
		return "guanliyuan-jueseguanli";
	}
}
