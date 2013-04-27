<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.chinasofti.etc.bookshop.po.Customer"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>查看客户信息</title>

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
	<table>
		<thead>
			<td>ID</td>
			<td>客户编号</td>
			<td>客户姓名</td>
			<td>登录密码</td>
			<td>客户地址</td>
		</thead>
		<%
			List<Customer> customers = (List<Customer>) session.getAttribute("customers");

			for (Customer customer : customers) {
		%>
		<tr>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getCustomerNo()%></td>
			<td><%=customer.getCustomerName()%></td>
			<td><%=customer.getCustomerPassword()%></td>
			<td><%=customer.getCustomerAddress()%></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>
