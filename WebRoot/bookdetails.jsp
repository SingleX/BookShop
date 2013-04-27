<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.chinasofti.etc.bookshop.po.Book"%>
<%@page import="com.chinasofti.etc.bookshop.control.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>我的书城</title>

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
		<%
			int customerId =(Integer) session.getAttribute("customerId");
			Book book = (Book) session.getAttribute("book");
		%>
		
		<div id="bookdetails">
			书&nbsp;&nbsp;名：《<%=book.getBookName()%>》<br> <br> ISBN：<%=book.getBookIsbn()%><br>
			<br> 作&nbsp;&nbsp;者：<%=book.getBookAuthor()%><br> <br>
			出版社：<%=book.getBookPublisher()%><br> <br> 价&nbsp;&nbsp;格：<%=book.getBookPrice()%><br>
			<br> 库&nbsp;&nbsp;存：<%=book.getBookStore()%><br> <br>
		</div>
		<div id="bookimage">
			<a href="bookDetailsServlet?bookId=<%=book.getBookId()%>"
				target="_blank"><img alt="<%=book.getBookName()%>"
				src="images/<%=book.getBookImage()%>"> </a>
		</div>
			<form action="addCartItemServlet">
				书籍ID：<input type="text" name="bookId" value="<%=book.getBookId() %>" readonly="true" /><br><br>
				用户ID：<input type="text" name="customerId" value="<%=customerId %>" readonly="true" /><br><br>
				购买数量：<input type="text" name="bookNum" /><br><br>
				<input type="submit" value="加入购物车"/>
			</form>
	</div>
	<div id="bottom">Copyright © 2012-2013 畅享书城</div>
</body>
</html>
