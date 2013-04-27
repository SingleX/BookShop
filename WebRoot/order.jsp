<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ page import="com.chinasofti.etc.bookshop.po.Order"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单</title>

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
			<a href="#">Welcome <%=session.getAttribute("customerName")%></a>
		</div>
		<div id="toplogo"></div>
		<div id="navi">
			<div id="navitag">
				<a href="#">首页</a> <a href="#">经典著作</a> <a href="#">社科文学</a> <a
					href="#">历史地理</a> <a href="#">军事科学</a> <a href="#">政治法律</a> <a
					href="#">文化教育</a> <a href="#">中国文学</a> <a href="#">音乐美术</a> <a
					href="#">数理化学</a> <a href="#">计算机</a> <a href="#">生活休闲</a> <a
					href="#">少儿读物</a>
			</div>
		</div>
	</div>
	<div id="index_main">
		<br> 订单：<br> <br>
		<div id="cartitem_navi">
			<div class="area">订单ID</div>
			<div class="area">制单人</div>
			<div class="area">收款人</div>
			<div class="area">用户ID</div>
			<div class="area">日期</div>
			<div class="area">总价</div>
		</div>
		<%
			Order order = (Order) session.getAttribute("order");
		%>
		<div id="cartitem">
			<div class="area"><%=order.getOrderId()%></div>
			<div class="area"><%=order.getOrderMaker()%></div>
			<div class="area"><%=order.getRecMoneyId()%></div>
			<div class="area"><%=order.getCustomerId()%></div>
			<div class="area"><%=order.getDate()%></div>
			<div class="area"><%=order.getTotal()%></div>
		</div>
		<a href="orderDetailServlet?orderId=<%=order.getOrderId()%>">订单细节</a>
	</div>
	<div id="bottom">Copyright © 2012-2013 畅享书城</div>
</body>
</html>
