<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/" %>
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
		
		<title>管理公告</title>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 发布信息 <span class="c-gray en">&gt;</span> 管理公告 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
			<form method="post" action="${pageContext.request.contextPath}/gonggao/select.action">
			<div class="text-c">
				<span class="select-box inline">
					<select name="id" class="select">
						<option value="message_id">公告编号</option>
						<option value="message_user_id">发布人编号</option>
					</select>
				</span>
				<input name="data" type="text" style="width:250px" class="input-text">
				<button id="chaxun" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			</div>
			</form>
			
			<div class="mt-20">
				<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
					<thead>
						<tr class="text-c">
							<th width="80">ID</th>
							<th width="80">发布人编号</th>
							<th>内容</th>
							<th width="60">状态</th>
							<th width="120">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.getRows()}" var="row">
							<tr class="text-c">
								<td >${row.message_id}</td>
								<td >${row.message_user_id}</td>
								<td >${row.message_content}</td>
								<td >${row.message_status}</td>
								<td class="f-14 td-manage">
									<a style="text-decoration:none" onClick="shenhe(this,${row.message_id})" href="javascript:;" title="审核">审核</a> 
									<a style="text-decoration:none" class="ml-5" onClick="shanchu(this,${row.message_id})" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> 
		<!--/_footer 作为公共模版分离出去-->
		<!--请在下方写此页面业务相关的脚本-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
		<script type="text/javascript">
		function shenhe(obj,id){
			layer.confirm('确认编号为 '+id+' 的申请审核是否通过', {
				btn: ['通过','取消'], 
				shade: false,
				closeBtn: 0
			},
			function(){
				 $.post("${pageContext.request.contextPath }/gonggao/update.action",{"id":id},
					function(data){
						if(data =="OK"){
		               	 	alert("审核成功！");
		                	window.location.reload();
		            	}
						else
						{
		                	alert("审核失败！");
		                	window.location.reload();
		            	}
					});
			}); 
		}
		function shanchu(obj,id){
			layer.confirm('确认是否删除编号为 '+id+' 申请', {
				btn: ['确认','取消'], 
				shade: false,
				closeBtn: 0
			},
			function(){
				$.post("${pageContext.request.contextPath }/gonggao/delete.action",{"id":id},
						function(data){
							if(data =="OK"){
			               	 	alert("删除成功！");
			                	window.location.reload();
			            	}
							else
							{
			                	alert("删除失败！");
			                	window.location.reload();
			            	}
						});
			});
		}
		</script>
	</body>
</html>