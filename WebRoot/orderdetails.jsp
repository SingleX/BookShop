<%@page
	import="com.chinasofti.etc.bookshop.service.impl.OrderServiceImpl"%>
<%@page import="com.chinasofti.etc.bookshop.po.Order"%>
<%@page
	import="com.chinasofti.etc.bookshop.service.impl.OrderDetailServiceImpl"%>
<%@page import="com.chinasofti.etc.bookshop.control.OrderDetailServlet"%>
<%@page import="com.chinasofti.etc.bookshop.service.OrderService"%>
<%@page
	import="com.chinasofti.etc.bookshop.service.impl.BookServiceImpl"%>
<%@page import="com.chinasofti.etc.bookshop.service.BookService"%>
<%@page import="com.chinasofti.etc.bookshop.po.Book"%>
<%@page import="com.chinasofti.etc.bookshop.po.OrderDetail"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>畅享书城</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="styles.css">

	</head>
	<!-- List<OrderDetail> orderDetails = new ArrayList<OrderDetail>(); -->

	<body>
		<div id="top">
			<div id="topnavi">
				<a href="login.jsp">用户登录</a>
				<a href="register.jsp">免费注册</a>
			</div>
			<div id="toplogo"></div>
			<div id="navi">
				<div id="navitag">
					<a href="#">首页</a>
					<a href="#">经典著作</a>
					<a href="#">社科文学</a>
					<a href="#">历史地理</a>
					<a href="#">军事科学</a>
					<a href="#">政治法律</a>
					<a href="#">文化教育</a>
					<a href="#">中国文学</a>
					<a href="#">音乐美术</a>
					<a href="#">数理化学</a>
					<a href="#">计算机</a>
					<a href="#">生活休闲</a>
					<a href="#">少儿读物</a>
				</div>
			</div>
		</div>
		<div id="index_main">

			订单详情列表：
			<br>
			<br>
			<%
				int i = 1;
				List<OrderDetail> orderDetails = (List<OrderDetail>) session.getAttribute("orderDetails");
				OrderDetail orderDetail = null;

				OrderService orderService = new OrderServiceImpl();
				Order order = null;

				BookService bookService = new BookServiceImpl();
				Book book = null;

				Iterator<OrderDetail> iterator = orderDetails.iterator();
				while (iterator.hasNext()) {
					orderDetail = iterator.next();
			%>
			<%
				order = orderService.findOrderByOrderId(orderDetail.getOrderId());
			%>
			<%
				if (i == 1) {
			%>
			<div id="cartitem_navi_od">
				<div class="area">订单号<br><%=order.getOrderNo()%></div>
				<div class="area">制单人<br><%=order.getOrderMaker()%></div>
				<div class="area"><%=order.getDate()%></div>
				<div class="area">总价<br><%=order.getTotal()%></div>
				<div class="area"></div>
				<div class="area"></div>
				<div class="area"></div>
			</div>
			<%
				i++;
					}
			%>
			<%
				book = bookService.findBookByBookId(orderDetail.getBookId());
			%>
			
			<div id="cartitem_navi">
				<div class="area">ISBN</div>
				<div class="area">书名</div>
				<div class="area">作者</div>
				<div class="area">价格</div>
				<div class="area">出版社</div>
				<div class="area">购买数量</div>
				<div class="area">小计</div>
			</div>
			<div id="cartitem">
				<div class="area"><%=book.getBookIsbn()%></div>
				<div class="area"><%=book.getBookName()%></div>
				<div class="area"><%=book.getBookAuthor()%></div>
				<div class="area"><%=book.getBookPublisher()%></div>
				<div class="area"><%=book.getBookPrice()%></div>
				<div class="area"><%=orderDetail.getBookNum()%></div>
				<div class="area"><%=orderDetail.getSubTotal()%></div>
			</div>
			<%
				}
			%>
		</div>
		<div id="bottom">
			Copyright © 2012-2013 畅享书城
		</div>

	</body>
</html>
