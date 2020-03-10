<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	 "http://www.w3.org/TR/html4/loose.dtd">
	 
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">   <!-- 需要什么样的内核渲染 -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">   <!--兼容其他版本浏览器-->
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />    <!--可视区域的缩放级别-->
		<meta http-equiv="Cache-Control" content="no-siteapp" />   <!--打开会自动转码-->

		<!--链入外部css文件-->
		<link href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />   


		<title>后勤管理登录</title>
		<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
		<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">

		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#quxiao").click(function(){
				$("#user_login_name").val("");
				$("#user_psw").val("");
			});
		});
		function check(){
			var name=$("#name").val();
			var psw=$("#psw").val();
			if(name==""||psw=="")
			{
				if(name=="")
				{
					alert("登录名不能为空！");
					return false;
				}
				else
				{
					if(psw=="")
					{
						alert("密码不能为空！");
						return false;
					}
				}
			}
			return true;
		}
		</script>
	</head>
	<body>
   	 	<div class="header"></div>
		<div class="loginWraper">
  			<div id="loginform" class="loginBox">
  				<div class="form form-horizontal">
      			<form action="${pageContext.request.contextPath }/login.action" 
			                       method="post" onsubmit="return check()">
      			<div class="row cl">
       				 <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        				<div class="formControls col-xs-8">
          					<input id="name" name="name" type="text" placeholder="账户" class="input-text size-L">
           				</div>
     			</div>
      			<br/>
     	 		<div class="row cl">
        			<label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        			<div class="formControls col-xs-8">
          				<input id="psw" name="psw"  type="password" placeholder="密码" class="input-text size-L">
          			</div>
      			</div>
      			
      			<div class="row cl">
        			<div class="formControls col-xs-8 col-xs-offset-3">
          				<!--<input name="" type="submit"  value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;" onclick="testJson()">
    	 				-->
    	 				<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	 				<input id="denglu" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          				<input id="quxiao" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
        			</div>
      			</div>
      			</form>
      			</div>
  			</div>
		</div>
    	<div class="footer">江大后勤服务管理系统</div>
	</body>
</html>