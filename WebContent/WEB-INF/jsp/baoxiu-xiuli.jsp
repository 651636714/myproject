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
		<link rel="Bookmark" href="/favicon.ico" >
		<link rel="Shortcut Icon" href="/favicon.ico" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
		
		<title>接收工单</title>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 故障报修 <span class="c-gray en">&gt;</span> 接收工单 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr>
						<th colspan="9" scope="col">已审核报修列表</th>
					</tr>
					<tr class="text-c">
			   		 	<th>报修单编号</th>
						<th>报修人编号</th>
						<th>报修类型</th>
						<th>报修时间</th>
						<th>报修地点</th>
						<th>报修描述</th>
						<th>报修单状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page1.getRows()}" var="row1">
							<tr class="text-c">
								<td >${row1.report_id}</td>
								<td >${row1.report_user_id}</td>
								<td >${row1.report_type}</td>
								<td >${row1.report_time}</td>
								<td >${row1.report_place}</td>
								<td >${row1.report_desc}</td>
								<td >${row1.report_status}</td>
								<td class="f-14 td-manage"> 
									<a style="text-decoration:none" class="ml-5" onClick="weixiu('添加维修','${pageContext.request.contextPath }/baoxiu/toadd.action',${row1.report_id},'800','500')" href="javascript:;" title="添加"><i class="Hui-iconfont">&#xe6df;</i></a>
									<a style="text-decoration:none" class="ml-5" onClick="shanchu(this,${row1.report_id})" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr>
						<th colspan="9" scope="col">已修理列表</th>
					</tr>
					<tr class="text-c">
			   		 	<th>修理单编号</th>
						<th>修理人编号</th>
						<th>报修单编号</th>
						<th>修理时间</th>
						<th>修理结果</th>
						<th>评价表编号</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page2.getRows()}" var="row2">
							<tr class="text-c">
								<td >${row2.service_id}</td>
								<td >${row2.service_person_id}</td>
								<td >${row2.service_report_id}</td>
								<td >${row2.service_time}</td>
								<td >${row2.service_result}</td>
								<td >${row2.service_eva_id}</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
		<script type="text/javascript">
		function weixiu(title,url,id,w,h){
			$.post("${pageContext.request.contextPath }/baoxiu/baocun.action",{"id":id});
			layer_show(title,url,w,h);
		}
		function shanchu(obj,id){
			layer.confirm('确认是否删除编号为 '+id+' 申请', {
				btn: ['确认','取消'], 
				shade: false,
				closeBtn: 1
			},
			function(){
				$.post("${pageContext.request.contextPath }/baoxiu/delete.action",{"id":id},
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