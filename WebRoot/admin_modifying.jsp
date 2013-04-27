<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.chinasofti.etc.bookshop.po.Admin"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'admin_modifying.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script language="javascript">
	function check() {
	
		var password = document.getElementById("adminpassword");
		var password2 = document.getElementById("adminpassword2");
		
		if (password.value == "") {
			alert("请输入密码！");
			password.focus();
			return false;
		}
		if (password2.value == "") {
			alert("请确认密码！");
			password2.focus();
			return false;
		}
		if (password.value != password2.value) {
			alert("两次输入的密码不一致，请重新输入！");
			password2.focus();
			password.focus();
			return false;
		}
		return true;
	}
</script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	管理员信息修改
	<br>
	<br>
	<%
		Admin admin = (Admin) session.getAttribute("admin");
	%>
	<form action="adminModifyingServlet" onSubmit="return check()">
		ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：<input type="text" id="adminid"
			name="adminid" value="<%=admin.getAdminId()%>" readonly="true">
		<br> 用&nbsp;户&nbsp;名：<input type="text" id="adminname"
			name="adminname" value="<%=admin.getAdminName()%>" readonly="true"><br>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" id="adminpassword"
			name="adminpassword"><br> 确认密码：<input type="password"
			id="adminpassword2" name="adminpassword2"><br>
			<input type="submit" value="修改">
	</form>
</body>
</html>
