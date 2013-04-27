<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户注册 - 畅享书城</title>

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
			<a href="#">畅享书城欢迎您！</a> <a href="login.jsp">用户登录</a>
		</div>
		<div id="toplogo"></div>
	</div>
	<div id="login_main">
		<form action="registerServlet">
			用&nbsp;户&nbsp;名：<input type="text" id="myusn" name="username"
				value=<%=request.getParameter("username") == null ? "" : request.getParameter("username")%>><br />
			<br />密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" id="mypwd"
				name="userpassword"><br /> <br />确认密码：<input type="password"
				id="mypwd2" name="userpassword2"><br /> <br />送货地址：<input
				type="text" id="myaddr" name="useraddress"><br /> <br /><input
				type="submit" value="注册"> <input type="reset" value="重写">
		</form>
	</div>
	<div id="bottom">Copyright © 2012-2013 畅享书城</div>
</body>
</html>
