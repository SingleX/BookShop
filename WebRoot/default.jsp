<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.chinasofti.etc.bookshop.po.Book"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<!-- 以下是本页面的关键代码，“3”表示等三秒，url后带参数index跳到indexServlet里面做处理 -->
<meta http-equiv="refresh" content="3;url=indexServlet?action=index">
<title>畅享书城</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="styles.css">
</head>

<body>
<!-- 这里面都是DIV控制显示，浮云。。。 -->
	<div id="top">
		<div id="topnavi"></div>
		<div id="toplogo"></div>
	</div>
	<div id="default_main">	</div>
	<div id="bottom">
		Copyright © 2012-2013  畅享书城
	</div>
</body>
</html>
