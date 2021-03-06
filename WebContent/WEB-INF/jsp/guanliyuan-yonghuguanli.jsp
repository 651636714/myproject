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
		
		<title>用户查看</title>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 角色管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
			<table class="table table-border table-bordered table-hover table-bg">
				<thead>
					<tr>
						<th scope="col" colspan="9">用户管理</th>
						<th>
							<button onClick="yonghutianjia('添加用户','${pageContext.request.contextPath }/guanliyuan/toyonghuadd.action','800','500')" class="btn btn-primary radius">创建新角色</button>
						</th>
					</tr>
					<tr class="text-c">
						<th width="40">ID</th>
						<th width="100">登录名</th>
						<th width="100">登录密码</th>
						<th width="100">用户角色编号</th>
						<th width="100">用户编号</th>
						<th width="100">用户姓名</th>
						<th width="70">用户性别</th>
						<th width="100">用户电话</th>
						<th width="200">备注</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.getRows()}" var="row">
							<tr class="text-c">
								<td >${row.user_id}</td>
								<td >${row.user_login_name}</td>
								<td >${row.user_psw}</td>
								<td >${row.user_org_id}</td>
								<td >${row.user_num}</td>
								<td >${row.user_name}</td>
								<td >${row.user_sex}</td>
								<td >${row.user_number}</td>
								<td >${row.user_info}</td>
								<td >
									<a style="text-decoration:none" class="ml-5" onClick="shanchu(this,${row.user_id})" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script>
		<!--/_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/lib/laypage/1.2/laypage.js"></script>
		<script type="text/javascript">
		function yonghutianjia(title,url,w,h){
			layer_show(title,url,w,h);
		}
		function shanchu(obj,id){
			layer.confirm('确认是否删除编号为 '+id+' 申请', {
				btn: ['确认','取消'], 
				shade: false,
				closeBtn: 0
			},
			function(){
				$.post("${pageContext.request.contextPath }/guanliyuan/yonghudelete.action",{"id":id},
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