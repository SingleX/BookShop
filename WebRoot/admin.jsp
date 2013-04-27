<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>后台管理</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="styles.css">

	</head>

	<body>
		<div id="admin_top">

		</div>
		<div id="admin_main">
			<div id="admin_left">
				欢迎管理员:<%=session.getAttribute("adminName")%>
				<br />
				<br />
				<br />
				<ul>
					<li>
						书籍管理
					</li>
					<ul>
						<li>
							查看书籍
						</li>
						<li>
							添加书籍
						</li>
						<li>
							修改书籍
						</li>
						<li>
							删除书籍
						</li>
					</ul>
					<li>
						客户管理
					</li>
					<ul>
						<li>
							<a href="adminServlet?action=customer_showall" target="iframe">查看客户</a>
						</li>
						<li>
							添加客户
						</li>
						<li>
							修改客户
						</li>
						<li>
							删除客户
						</li>
					</ul>
					<li>
						员工管理
					</li>
					<ul>
						<li>
							查看员工
						</li>
						<li>
							添加员工
						</li>
						<li>
							修改员工
						</li>
						<li>
							删除员工
						</li>
					</ul>
					<li>
						系统管理
					</li>
					<ul>
						<li>
							<a href="adminServlet?action=admin_showall" target="iframe">查看管理员</a>
						</li>
						<li>
							<a href="admin_add.jsp" target="iframe">添加管理员</a>
						</li>
						<li>
							<a href="admin_modify.jsp" target="iframe">修改管理员</a>
						</li>
						<li>
							<a href="admin_delete.jsp" target="iframe">删除管理员</a>
						</li>
					</ul>
				</ul>
			</div>
			<div id="admin_right">
				<iframe id="admin_iframe" src="admin_iframe.jsp" name="iframe"></iframe>
			</div>
		</div>
	</body>
</html>
