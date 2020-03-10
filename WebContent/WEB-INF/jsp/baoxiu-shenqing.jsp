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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
		
		<title>报修申请</title>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#quxiao").click(function(){
				$("#leixing").val("");
				$("#shijian").val("");
				$("#didian").val("");
				$("#miaoshu").val("");
			});
			$("#baochun").click(function(){
				var leixing=$("#leixing").val();
				var shijian=$("#shijian").val();
				var didian=$("#didian").val();
				var miaoshu=$("#miaoshu").val();
				
				$.post("${pageContext.request.contextPath}/baoxiu/add.action",{leixing:leixing,shijian:shijian,didian:didian,miaoshu:miaoshu},
					function(data){
						alert("保存成功!");
				});
			});
		});
		</script>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 故障报修 <span class="c-gray en">&gt;</span> 报修 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<article class="page-container">
			<form class="form form-horizontal" id="form-baoxiu">
				<div class="text-c"> 
				
					<!-- 报修类型 -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							报修设施类型：
						</label>	
						<div class="formControls col-xs-6 col-sm-6">
							<input id="leixing" name="leixing" type="text" placeholder="" value="" class="input-text">
						</div>
					</div>
					<!-- 报修时间 -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							报修时间：
						</label>	
						<div class="formControls col-xs-6 col-sm-6">
							<input id="shijian" name="shijian" type="text"  placeholder="" value="" class="input-text">
						</div>  
  					</div>
  					<!-- 报修地点 -->
  					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							故障地点：
						</label>	
						<div class="formControls col-xs-6 col-sm-6">
							<input id="didian" name="didian" type="text" placeholder="" value="" class="input-text">
						</div>  
  					</div>
  					<!-- 报修描述 -->
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-2">
							<span class="c-red">*</span>
							故障描述：
						</label>	
						<div class="formControls col-xs-6 col-sm-6">
							<textarea id="miaoshu" name="miaoshu" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)"></textarea>
							<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
						</div>
 				 	</div>
 				 	
  					<div class="row cl">
						<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
							<button id="baochun" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
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
		<!--/_footer 作为公共模版分离出去-->
	</body>
</html>