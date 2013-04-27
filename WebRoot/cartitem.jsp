<%@page import="com.chinasofti.etc.bookshop.service.BookService"%>
<%@page
	import="com.chinasofti.etc.bookshop.service.impl.BookServiceImpl"%>
<%@page import="com.chinasofti.etc.bookshop.po.CartItem"%>
<%@page import="com.chinasofti.etc.bookshop.po.Book"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物车</title>

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
		<br> 购物车列表：<br> <br>
		<div id="cartitem_navi">
			<div class="area">ISBN</div>
			<div class="area">书名</div>
			<div class="area">作者</div>
			<div class="area">价格</div>
			<div class="area">出版社</div>
			<div class="area">购买数量</div>
			<div class="area">小计</div>
		</div>
		<!--  <%=session.getAttribute("customerId")%> -->
		<%
			List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");
		%>
		<%
			BookService bookService = new BookServiceImpl();
			Book book = null;
			int total = 0;
			for (CartItem cartItem : cartItems) {

				book = bookService.findBookByBookId(cartItem.getBookId());
		%>

		<div id="cartitem">
			<div class="area"><%=book.getBookIsbn()%></div>
			<div class="area"><%=book.getBookName()%></div>
			<div class="area"><%=book.getBookAuthor()%></div>
			<div class="area"><%=book.getBookPrice()%></div>
			<div class="area"><%=book.getBookPublisher()%></div>
			<div class="area"><%=cartItem.getBookNum()%></div>
			<div class="area"><%=cartItem.getSubTotal()%></div>
			<br />
			<%
				total += cartItem.getSubTotal();
			%>
		</div>


		<%
			}
		%>
		<a
			href="doOrderServlet?customerId=<%=session.getAttribute("customerId")%>&totalMoney=<%=total%>">下订单</a>
		<!-- customerId=<%=session.getAttribute("customerId")%>& -->
		<a
			href="buyAgainServlet?customerId=<%=session.getAttribute("customerId")%>">继续购买</a>

	</div>
	<div id="bottom">Copyright © 2012-2013 畅享书城</div>
</body>
</html>
