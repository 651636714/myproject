<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	 "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		
		<link rel="Bookmark" href="/favicon.ico" >
		<link rel="Shortcut Icon" href="/favicon.ico" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
		
		<title>主界面</title>
		<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
		<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
	</head>
	<body>
		<header class="navbar-wrapper">
			<div class="navbar navbar-fixed-top">
				<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">后勤管理服务系统</a> 
					<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
						
						<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
							<ul class="cl">
								<li>超级管理员</li>
								<li class="dropDown dropDown_hover">
									<a href="#" class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
									<ul class="dropDown-menu menu radius box-shadow">
										<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
										<li><a href="#">切换账户</a></li>
										<li><a href="#">退出</a></li>
									</ul>
								</li>
								<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
								<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
									<ul class="dropDown-menu menu radius box-shadow">
										<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
										<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
										<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
										<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
										<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
										<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
									</ul>
								</li>
							</ul>
						</nav>
				</div>
			</div>
		</header>
		<aside class="Hui-aside">
			<div class="menu_dropdown bk_2">
				<dl id="menu-article">
					<dt><i class="Hui-iconfont">&#xe616;</i>发布信息<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/togonggao-shenqing.action" data-title="添加公告" href="javascript:void(0)">添加公告</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/togonggao-shenhe.action" data-title="审核公告" href="javascript:void(0)" class="active">审核公告</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/togonggao-guanli.action" data-title="管理公告" href="javascript:void(0)">管理公告</a></li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-picture">
					<dt><i class="Hui-iconfont">&#xe613;</i>寻物启事<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/toxunwu-shenqing.action" data-title="寻物启事" href="javascript:void(0)">寻物启事</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/toxunwu-shenhe.action" data-title="审核寻物申请" href="javascript:void(0)">审核寻物申请</a></li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-product">
					<dt><i class="Hui-iconfont">&#xe620;</i>失物招领<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/toshiwu-shenqing.action" data-title="失物申请" href="javascript:void(0)">失物申请</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/toshiwu-shenhe.action" data-title="审核失物申请" href="javascript:void(0)">审核失物申请</a></li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-admin">
					<dt><i class="Hui-iconfont">&#xe62d;</i>故障报修<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/tobaoxiu-shenqing.action" data-title="报修" href="javascript:void(0)">报修</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/tobaoxiu-shenhe.action" data-title="审核" href="javascript:void(0)">审核</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/tobaoxiu-xiuli.action" data-title="接收工单" href="javascript:void(0)">接收工单</a></li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-comments">
					<dt><i class="Hui-iconfont">&#xe622;</i>服务人员评价<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/topingjia-shenqing.action" data-title="给予评价" href="javascript:;">给予评价</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/topingjia-shenhe.action" data-title="查看评价" href="javascript:void(0)">查看评价</a></li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-admin">
					<dt><i class="Hui-iconfont">&#xe62d;</i>管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li><a data-href="${pageContext.request.contextPath }/index/toguanliyuan-jueseguanli.action" data-title="角色管理" href="javascript:void(0)">角色列表</a></li>
							<li><a data-href="${pageContext.request.contextPath }/index/toguanliyuan-yonghuguanli.action" data-title="用户管理" href="javascript:void(0)">用户列表</a></li>
						</ul>
					</dd>
				</dl>
			</div>
		</aside>
		<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
		<section class="Hui-article-box">
			<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
				<div class="Hui-tabNav-wp">
					<ul id="min_title_list" class="acrossTab cl">
						<li class="active">
							<span title="我的桌面" data-href="${pageContext.request.contextPath }/welcome.action">我的桌面</span>
							<em></em>
						</li>
					</ul>
				</div>
				<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div></div>
				<div id="iframe_box" class="Hui-article">
					<div class="show_iframe">
						<div style="display:none" class="loading"></div>
						<iframe scrolling="yes" frameborder="0" src="${pageContext.request.contextPath }/welcome.action"></iframe>
					</div>
				</div>
		</section>

		<div class="contextMenu" id="Huiadminmenu">
			<ul>
				<li id="closethis">关闭当前 </li>
				<li id="closeall">关闭全部 </li>
			</ul>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script> 
		<!--/_footer 作为公共模版分离出去-->
		
	</body>
</html>