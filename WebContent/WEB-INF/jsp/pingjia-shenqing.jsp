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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
		
		<title>给予评价</title>
	</head>
	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 服务人员评价 <span class="c-gray en">&gt;</span> 给予评价 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
				<div class="mt-20">
					<table class="table table-border table-bordered table-bg">
					<thead>
						<tr class="text-c">
							<th width="80">维修单编号</th>
							<th width="80">维修人编号</th>
							<th width="80">保修单编号</th>
							<th width="80">维修时间</th>
							<th width="80">维修结果</th>
							<th width="80">给予评价</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.getRows()}" var="row">
							<tr class="text-c">
								<td >${row.service_id}</td>
								<td >${row.service_person_id}</td>
								<td >${row.service_report_id}</td>
								<td >${row.service_time}</td>
								<td >${row.service_result}</td>
								<td class="f-14 td-manage"> 
									<a style="text-decoration:none" class="ml-5" onClick="pingjia('评价','${pageContext.request.contextPath }/pingjia/toadd.action',${row.service_id},'810','510')" href="javascript:;" title="添加"><i class="Hui-iconfont">&#xe6df;</i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
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
		function pingjia(title,url,id,w,h){
			$.post("${pageContext.request.contextPath }/pingjia/baocun.action",{"id":id});
			layer_show(title,url,w,h);
		}
		</script>
	</body>
</html>