<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	 "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
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
		<title>添加用户</title>
		<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
		<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#quxiao").click(function(){
				$("#name").val("");
				$("#mima").val("");
				$("#juesebianhao").val("");
				$("#bianhao").val("");
				$("#xingming").val("");
				$("#xingbie").val("");
				$("#lianxifangshi").val("");
				$("#beizhu").val("");
			});
			$("#baochun").click(function(){
				var name=$("#name").val();
				var mima=$("#mima").val();
				var juesebianhao=$("#juesebianhao").val();
				var bianhao=$("#bianhao").val();
				var xingming=$("#xingming").val();
				var xingbie=$("#xingbie").val();
				var lianxifangshi=$("#lianxifangshi").val();
				var beizhu=$("#beizhu").val();
				$.post("${pageContext.request.contextPath }/guanliyuan/yonghuadd.action",{name:name,mima:mima,juesebianhao:juesebianhao,bianhao:bianhao,xingming:xingming,xingbie:xingbie,lianxifangshi:lianxifangshi,beizhu:beizhu},
						function(data){
							if(data =="OK"){
			               	 	alert("提交成功！");
			                	window.location.reload();
			            	}
							else
							{
			                	alert("提交失败！");
			                	window.location.reload();
			            	}
						});
			});
		});
		</script>
	</head>
	<body>
		<article class="page-container">
			<form class="form form-horizontal" id="form-article-add">
				<div class="text-c"> 
                	添加用户
					<!--角色名：  -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							用户名：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="name" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 密码： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							密码：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="mima" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 角色编号： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							角色编号：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="juesebianhao" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 用户编号： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							 用户编号：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="bianhao" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 姓名： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							姓名：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="xingming" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 性别： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							性别：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="xingbie" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 联系方式： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							联系方式：
						</label>
						<div class="formControls col-xs-6 col-sm-6">
							<input id="lianxifangshi" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 备注： -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
					           	 备注：
					 	</label>
						<div class="formControls col-xs-6 col-sm-6">
							<textarea id="beizhu" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)"></textarea>
							<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
						</div>
					</div>
					<div class="row cl">
  						<div class="row cl">
							<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
								<button id="baochun"  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
								<button id="quxiao" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
							</div>
						</div>
					</div>
			</form>
		</article>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script> 
		<!--请在下方写此页面业务相关的脚本-->
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/validate-methods.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/messages_zh.js"></script>
	</body>
</html>