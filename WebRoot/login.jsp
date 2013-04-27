<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户登录 - 畅享书城</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="styles.css">

</head>

<body>
	<div id="top">
		<div id="topnavi">
			<a href="#">畅享书城欢迎您！</a> <a href="register.jsp">免费注册</a>
		</div>
		<div id="toplogo"></div>
	</div>
	<div id="login_main">
			<form action="loginServlet">
				用户名：<input type="text" id="myusn" name="username"
					value=<%=request.getParameter("username") == null ? "" : request.getParameter("username")%>><br />
				<br /> 密&nbsp;&nbsp;码：<input type="password" id="mypwd"
					name="userpassword"><br />
				<br /> <input type="radio" name="shenfen" value="0" checked />用户 <input
					type="radio" name="shenfen" value="1" />管理<br />
				<br /> <input type="submit" value="登录"> <input type="reset"
					value="重写">
			</form>
	</div>
	<div id="bottom">
		Copyright © 2012-2013  畅享书城
	</div>
</body>
</html>
