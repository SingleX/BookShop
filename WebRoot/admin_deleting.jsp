<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.chinasofti.etc.bookshop.po.Admin"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'admin_deleting.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	管理员信息修改
	<br>
	<br>
	<%
		Admin admin = (Admin) session.getAttribute("admin");
	%>
	<form action="adminDeletingServlet">
		ID&nbsp;&nbsp;：<input type="text" id="adminid"
			name="adminid" value="<%=admin.getAdminId()%>" readonly="true">
		<br> 用户名：<input type="text" id="adminname"
			value="<%=admin.getAdminName()%>" readonly="true"><br> <br>
		<input type="submit" value="删除">
	</form>
</body>
</html>
