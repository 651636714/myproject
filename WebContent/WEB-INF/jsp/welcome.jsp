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
		
		<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
		
		<title>信息公告</title>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
	</head>
	<body>
		<div class="page-container">
				<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
					<thead>
						<tr>
							<th colspan="7" scope="col">最近公告</th>
						</tr>
						<tr class="text-c">
							<th width="80">ID</th>
							<th width="80">发布人编号</th>
							<th>内容</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.getRows()}" var="row">
							<tr class="text-c">
								<td >${row.message_id}</td>
								<td >${row.message_user_id}</td>
								<td >${row.message_content}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
				<div >
					<itheima:page url="${pageContext.request.contextPath }/shenhegonggao.action" />
				</div>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> 
		<!--/_footer 作为公共模版分离出去-->
	</body>
</html>