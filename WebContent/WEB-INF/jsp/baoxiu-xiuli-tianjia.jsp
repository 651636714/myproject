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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
		<title>添加工单</title>
		<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
		<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#quxiao").click(function(){
				$("#shijian").val("");
				$("#jieguo").val("");
			});
			$("#baochun").click(function(){
				var shijian=$("#shijian").val();
				var jieguo=$("#jieguo").val();
				$.post("${pageContext.request.contextPath }/baoxiu/weixiuadd.action",{shijian:shijian,jieguo:jieguo},
						function(data){
							if(data =="OK"){
			               	 	alert("已修理！");
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
                	维修添加
    				<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
						             维修时间：
						</label>	
						<div class="formControls col-xs-8 col-sm-9">
							<input id="shijian" type="text" placeholder="" value="" class="input-text"></div>
  					</div>
  					
    				<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
						             维修结果：
						</label>	
						<div class="formControls col-xs-8 col-sm-9">
							<input id="jieguo" type="text" placeholder="" value="" class="input-text">
						</div>
  					</div>
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> 
		<!--/_footer /作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/webuploader/0.1.5/webuploader.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.config.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.all.min.js"> </script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>

	</body>
</html>