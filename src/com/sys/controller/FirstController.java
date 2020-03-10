package com.sys.controller;



public class FirstController{
	/*@Autowired
	private UserMapper usermapper;
	@Autowired
	private MessageMapper messagemapper;
	@Autowired
	private LostMapper lostmapper;
	@Autowired
	private PickMapper pickmapper;
	@Autowired
	private ReportMapper reportmapper;
	@Autowired
	private ServiceMapper servicemapper;
	@Autowired
	private EvaMapper evamapper;
	@Autowired
	private RoleMapper rolemapper;
	
	//报修
	@RequestMapping(value="/shenqinbaoxiu.action")
	public String baoxiu_shenqin_action(String leixing,String shijian,String didian,String miaoshu,HttpSession session)
	{
		System.out.println(leixing+"——"+shijian+"——"+didian+"——"+miaoshu);
		UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
		ReportTable reportTable=new ReportTable(1,leixing, userTable.getUser_id(), shijian, didian, miaoshu, "未修","否");
		System.out.println(reportTable);
		System.out.println("baoxiu_shenqin_action");
		reportmapper.inster(reportTable);
		return "baoxiu-shenqin";
	}
	@RequestMapping(value="/shenhebaoxiu.action")
	public String baoxiu_shenhe_action(Model model)
		{	
			List<ReportTable> reportTablesList=new ArrayList<ReportTable>();
			reportTablesList=reportmapper.select3("否");
			Integer page=1;
			Integer rows=10;
			Integer count=reportTablesList.size();
			System.out.println(count+" "+reportTablesList);
			Page<ReportTable> reportTablePage=new Page<ReportTable>(count,page,rows,reportTablesList);
			model.addAttribute("page", reportTablePage);
			System.out.println("baoxiu_shenhe_action");
			return "baoxiu-shenhe";
		}
	@RequestMapping(value="/baoxiushanchu.action")
	@ResponseBody
	public String baoxiu_shanchu(Integer id)
		{
			System.out.println(id);
			int rows=reportmapper.delete(id);
			System.out.println("baoxiu_shanchu_action");
			if(rows>0)
			{
				return "OK";
			}
			else
			{
				return "FAIL";
			}
		}
	@RequestMapping(value="/baoxiushenhe.action")
	@ResponseBody
	public String baoxiu_shenhe(Integer id) {
			System.out.println(id);
			ReportTable reportTable=reportmapper.select1(id);
			reportTable.setReport_is_handle("是");
			System.out.println(reportTable);
			System.out.println("baoxiu_shenhe_action");
		    int rows=reportmapper.updata(reportTable);
		    if(rows > 0){
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}
	@RequestMapping(value="/xiulibaoxiu.action")
	public String baoxiu_xiuli_action(Model model,HttpSession session)
		{	
			List<ReportTable> reportTablesList=new ArrayList<ReportTable>();
			reportTablesList=reportmapper.select3("是");
			Integer page=1;
			Integer rows=10;
			Integer count=reportTablesList.size();
			System.out.println(count+" "+reportTablesList);
			Page<ReportTable> reportTablePage=new Page<ReportTable>(count,page,rows,reportTablesList);
			model.addAttribute("page1", reportTablePage);
			
			List<ServiceTable> serviceTablesList=new ArrayList<ServiceTable>();
			UserTable userTable=(UserTable) session.getAttribute("USER_SESSION");
			serviceTablesList.add(servicemapper.select1(userTable.getUser_id()));
			count=serviceTablesList.size();
			System.out.println(count+" "+serviceTablesList);
			Page<ServiceTable> serviceTablePage=new Page<ServiceTable>(count,page,rows,serviceTablesList);
			model.addAttribute("page2", serviceTablePage);
			System.out.println("baoxiu_xiuli_action");
			return "baoxiu-xiuli";
		}
	@RequestMapping(value="/baoxiuxiuli.action")
	@ResponseBody
	public String baoxiu_xiuli(String shijian,String jieguo,HttpSession session) {
			System.out.println(shijian+"---"+jieguo);
			UserTable userTable=(UserTable)session.getAttribute("USER_SESSION");
			ReportTable reportTablesave=(ReportTable) session.getAttribute("SAVE_reportTable");
			Integer id=reportTablesave.getReport_id();
			System.out.println(id);
			ReportTable reportTable=reportmapper.select1(id);
			reportTable.setReport_status("已修理");
			System.out.println(reportTable);
			System.out.println("baoxiu_shenhe_action");
			ServiceTable serviceTable=new ServiceTable(1,userTable.getUser_id(),id,shijian,jieguo,0);
		    System.out.println(serviceTable);
			int rows1=reportmapper.updata(reportTable);
			int rows2=servicemapper.inster(serviceTable);
		    if(rows1 > 0&&rows2>0){
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}
	//评价
	@RequestMapping(value="/tianjiapingjia.action")
	public String pingjia_tianjia_action(Model model)
		{	
		List<ServiceTable> serviceTablesList=new ArrayList<ServiceTable>();
		serviceTablesList=servicemapper.select2();
			Integer page=1;
			Integer rows=10;
			Integer count=serviceTablesList.size();
			System.out.println(count+" "+serviceTablesList);
			Page<ServiceTable> serviceTablePage=new Page<ServiceTable>(count,page,rows,serviceTablesList);
			model.addAttribute("page2", serviceTablePage);			
			System.out.println("pingjia_tianjia_action");
			return "pingjia-tianjia";
		}
	@RequestMapping(value="/tianjiapingjiapingjia.action")
	public String pingjia_tianjia_pingjia_action()
	{
		System.out.println("pingjia_tianjia_pingjia_action");
		return "pingjia-tianjia-pingjia";
	}
	@RequestMapping(value="/tianjiapingjiabaochun.action")
	public String pingjia_tianjiabaochun_action(Integer id,HttpSession session)
	{
		ServiceTable serviceTable=servicemapper.select3(id);
		System.out.println(serviceTable);
		session.setAttribute("SAVE_serviceTable", serviceTable);
		System.out.println("pingjia_weixiutianjiabaochun_action");
		return "pingjia-tianjia-pingjia";
	}
	@RequestMapping(value="/pingjiapingjia.action")
	@ResponseBody
	public String pingjia_pingjia_action(String shijian,String jibie,String nierong,String jianyi,HttpSession session) {
			System.out.println(shijian+"---"+jibie+"---"+nierong+"---"+jianyi);
			UserTable userTable=(UserTable)session.getAttribute("USER_SESSION");
			ServiceTable serviceTablesave=(ServiceTable) session.getAttribute("SAVE_serviceTable");
			Integer id=serviceTablesave.getService_id();
			System.out.println(id);
			EvaTable evaTable=new EvaTable(1,userTable.getUser_id(),id,shijian,jibie,nierong ,jianyi);
		    System.out.println(evaTable);
			int rows1=evamapper.inster(evaTable);
		    EvaTable evaTables=evamapper.select3(evaTable);
			System.out.println(evaTables.getEva_id());
			serviceTablesave.setService_eva_id(evaTables.getEva_id());
			int rows2=servicemapper.updata(serviceTablesave);
			System.out.println("pingjia_pingjia_action");
			if(rows1>0&&rows2 > 0){
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}
	@RequestMapping(value="/chakanpinjia.action")
	public String pingjia_chakan_action(Integer data,Model model)
	{
		System.out.println(data);
		List<EvaTable> evaTablesList=new ArrayList<EvaTable>();
		if(data==null)
		{
			evaTablesList=evamapper.select2();
		}
		else
		{
			evaTablesList=evamapper.select1(data);
		}
		Integer page=1;
		Integer rows=10;
		Integer count=evaTablesList.size();
		System.out.println(count+" "+evaTablesList);
		Page<EvaTable> evaTablePage=new Page<EvaTable>(count,page,rows,evaTablesList);
		model.addAttribute("page", evaTablePage);		
		System.out.println("pingjia_tianjia_action");
		return "pingjia-chakan";
	}
	
	//管理员
	@RequestMapping(value="/juesheguanliyuan")
	public String guanliyuan_juese(Model model)
	{
		List<RoleTable> roleTablesList=new ArrayList<RoleTable>();
		roleTablesList=rolemapper.select2();
		Integer page=1;
		Integer rows=10;
		Integer count=roleTablesList.size();
		System.out.println(count+" "+roleTablesList);
		Page<RoleTable> roleTablePage=new Page<RoleTable>(count,page,rows,roleTablesList);
		model.addAttribute("page", roleTablePage);
		System.out.println("guanliyuan_juese");
		return "guanliyuan-jueseguanli";
	}
	@RequestMapping(value="/tianjiajuese.action")
	public String guanliyuan_juese_tianjia()
	{
		return "guanliyuan-jueseguanli-tianjia";
	}
	@RequestMapping(value="/guanliyuanjuesetianjianbaochun.action")
	@ResponseBody
	public String guanliyuan_juese_tianjia_action(String name,Integer leixing,String miaoshu,String beizhu)
	{
		System.out.println(name+"--"+leixing+"--"+miaoshu+"--"+beizhu);
		RoleTable roleTable=new RoleTable(1, name, leixing, miaoshu, beizhu);
		int row=rolemapper.inster(roleTable);
		System.out.println("guanliyuan_juese_tianjia_action");
		if(row>0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/yonghuguanliyuan")
	public String guanliyuan_yonghu(Model model)
	{
		List<UserTable> userTablesList=new ArrayList<UserTable>();
		userTablesList=usermapper.select3();
		Integer page=1;
		Integer rows=10;
		Integer count=userTablesList.size();
		System.out.println(count+" "+userTablesList);
		Page<UserTable> userTablePage=new Page<UserTable>(count,page,rows,userTablesList);
		model.addAttribute("page", userTablePage);
		System.out.println("guanliyuan_yonghu");
		return "guanliyuan-yonghuguanli";
	}
	@RequestMapping(value="/tianjiayonghu.action")
	public String guanliyuan_yonghu_tianjia()
	{
		return "guanliyuan-yonghuguanli-tianjia";
	}
	@RequestMapping(value="/guanliyuanyonghutianjianbaochun.action")
	@ResponseBody
	public String guanliyuan_yonghu_tianjia_action(String name,String mima,Integer juesebianhao,Integer bianhao,String xingming,String xingbie,String lianxifangshi,String beizhu)
	{
		System.out.println(name+"--"+mima+"--"+juesebianhao+"--"+bianhao+"--"+xingming+"--"+xingbie+"--"+lianxifangshi+"--"+beizhu);
		UserTable userTable=new UserTable(1, name, mima, juesebianhao,beizhu, bianhao,xingming,xingbie,lianxifangshi);
		int row=usermapper.inster(userTable);
		if(row>0){
	        return "OK";
	    }else{
	        return "FAIL";
	    }
	}
	@RequestMapping(value="/yonghushanchu.action")
	@ResponseBody
	public String guanliyuan_yonghu_shanchu_action(Integer id)
		{
			System.out.println(id);
			int row=usermapper.delete(id);
			System.out.println("guanliyuan_yonghu_shanchu_action");
			if(row>0)
			{
				return "OK";
			}
			else
			{
				return "FAIL";
			}
		}*/
}
