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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
		<title>查看评价</title>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 服务人员评价 <span class="c-gray en">&gt;</span> 查看评价 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
			<form method="get" action="${pageContext.request.contextPath}/pingjia/chakan.action">
			<div class="text-c"> 
				按维修单编号查找：
				<input id="data" name="data" type="text" class="input-text" style="width:250px" placeholder="">
				<button id="chaxun" type="submit" class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
			</div>
			</form>
			<table class="table table-border table-bordered">
				<thead>
					<tr>
						<th colspan="7" scope="col">已评价列表</th>
					</tr>
					<tr class="text-c">
						<th>服务评价编号</th>
						<th>评价人编号</th>
						<th>被评价维修单编号</th>
						<th>评价时间</th>
						<th>评价级别</th>
						<th>评价内容</th>
						<th>评价建议</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.getRows()}" var="row">
							<tr class="text-c">
								<td >${row.eva_id}</td>
								<td >${row.eva_person_id}</td>
								<td >${row.eva_report_id}</td>
								<td >${row.eva_time}</td>
								<td >${row.eva_grade}</td>
								<td >${row.eva_contents}</td>
								<td >${row.eva_sugg}</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>  
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script> 
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->

		
	</body>
</html>