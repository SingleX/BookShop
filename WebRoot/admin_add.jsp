<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'admin_add.jsp' starting page</title>

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
	添加管理员信息
	<br>
	<br>
	<form action="adminAddServlet">
		用&nbsp;户&nbsp;名：<input type="text" name="adminname"
			value=<%=request.getParameter("adminname") == null ? "" : request.getParameter("adminname")%>><br />
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="adminpassword"><br />
		确认密码：<input type="password" name="adminpassword2"><br /> <input
			type="submit" value="添加">
	</form>

</body>
</html>
