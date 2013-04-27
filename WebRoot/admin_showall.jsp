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

<title>查看管理用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="styles.css">

</head>

<body>
管理员信息：<br/><br/>
	<table>
		<thead>
			<td>ID</td>
			<td>用户名</td>
			<td>密码</td>
		</thead>
		<%
			List<Admin> admins = (List<Admin>) session.getAttribute("admins");
			for (Admin admin : admins) {
		%>
		<tr>
			<td><%=admin.getAdminId()%></td>
			<td><%=admin.getAdminName()%></td>
			<td><%=admin.getAdminPassword()%></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>
