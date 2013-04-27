package com.chinasofti.etc.bookshop.dao.mysqlimpl;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	protected int result;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载数据库引擎失败");
		}
	}

	/**
	 * 建立数据库连接
	 */
	public void getConn() {
		String url = "jdbc:mysql://localhost:3306/bookshop?user=root&password=1&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false";
		
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败,请检查服务/数据库名/登陆账户和密码！");
		}
	}

	/**
	 * 关闭所有数据库连接
	 */
	public void closeAll() {
		try {
			if (pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库关闭连接异常");
		}
	}

	/**
	 * 查询数据库
	 */
	public void doQuery(String sql, Object... params) {
		try {
			pstmt = conn.prepareStatement(sql);
			if (pstmt != null) {
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("查询数据库异常！");
		}
	}

	/**
	 * 操作数据库：增删改
	 */
	public void doOperate(String sql, Object... params) {
		try {
			pstmt = conn.prepareStatement(sql);
			if (pstmt != null) {
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 判断表是否存在
	 */
	boolean existTable(String tableName){
		DatabaseMetaData meta;
		try {
			meta = (DatabaseMetaData) conn.getMetaData();
			ResultSet rs = meta.getTables(null, null, tableName, null);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * SQLServer数据库初始化：创建表，添加三行记录
	 */
	public void doInit() {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = null;
		if (!existTable("Admins")) {
			// 初始化表Books
			sql = "create table Admins(adminId int primary key auto_increment, adminName nvarchar(20), adminPassword nvarchar(100))";
			doOperate(sql);
			sql = "insert into Admins values(null, 'admin', '123456')";
			doOperate(sql);
			System.out.println("====初始化表Admins成功===");
		}else {
			System.out.println("Admins表已存在");
		}
		
		if (!existTable("Customers")) {
			// 初始化表Customers
			sql = "create table Customers(customerId int primary key auto_increment, customerNo nvarchar(100), customerName nvarchar(100), customerPassword nvarchar(100), customerAddress nvarchar(100))";
			doOperate(sql);
			sql = "insert into Customers values(null, '80000001','zhangsan', 'zhangsan', '淄博张店')";
			doOperate(sql);
			sql = "insert into Customers values(null, '80000002','lisi', 'lisi', '天津滨海新区')";
			doOperate(sql);
			sql = "insert into Customers values(null, '80000003','wangwu', 'wangwu', '山东理工大学')";
			doOperate(sql);
			System.out.println("====初始化表Customers成功===");

		}else {
			System.out.println("Customers表已存在");
		}
		
		if (!existTable("Books")) {
			// 初始化表Books
			sql = "create table Books(bookId int primary key auto_increment, bookIsbn nvarchar(100), bookName nvarchar(100), bookPrice double, bookAuthor nvarchar(100), bookPublisher nvarchar(100), bookStore int, bookImage nvarchar(100))";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-11-11', '计算机网络', 10, '刘红军', '清华大学出版社', 500, 'a.gif')";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-22-22', 'C#从入门到精通', 20, '李朋伟', '机械出版社', 432, 'b.gif')";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-33-33', '算法导论', 30, '韩雪芹', '电子出版社', 68, 'c.gif')";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-44-44', 'C程序设计', 25, '谭浩强', '清华大学出版社', 88, 'c.gif')";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-55-55', 'ARM嵌入式', 8, '刘磊', '电子出版社', 35, 'd.gif')";
			doOperate(sql);
			sql = "insert into Books values(null, 'ISBN-66-66', '数据库概论', 45, '张良', '电子出版社', 78, 'b.gif')";
			doOperate(sql);
			System.out.println("====初始化表Books成功===");
		}else {
			System.out.println("Books表已存在");
		}
		
		if (!existTable("Employees")) {
			// 初始化表Employees
			sql = "create table Employees(employeeId int primary key auto_increment, employeeNo nvarchar(100), employeeName nvarchar(100), employeeRole nvarchar(100), employeeSex nvarchar(100))";
			doOperate(sql);
			sql = "insert into Employees values(null, '00001', '员工A', '送货员', '男')";
			doOperate(sql);
			sql = "insert into Employees values(null, '00002', '员工B', '送货员', '女')";
			doOperate(sql);
			sql = "insert into Employees values(null, '00003', '员工C', '制单人', '男')";
			doOperate(sql);
			System.out.println("====初始化表Employees成功===");

		}else {
			System.out.println("Employee表已存在");
		}
		
		if (!existTable("CartItems")) {
			// 初始化表CartItems
			sql = "create table CartItems(cartItemId int primary key auto_increment, bookId int, bookNum int, subTotal double, bookPrice double, customerId int)";
			doOperate(sql);
			System.out.println("====初始化表CartItems成功===");

		}else {
			System.out.println("CartItems表已存在");
		}
		
		if (!existTable("Orders")) {
			// 初始化表Orders
			sql = "create table Orders(orderId int primary key auto_increment, orderNo nvarchar(45), orderMaker nvarchar(45), recMoneyId int, customerId int, date date, total double)";
			doOperate(sql);
			System.out.println("====初始化表Orders成功===");

		}else {
			System.out.println("Orders表已存在");
		}
		
		if (!existTable("OrderDetails")) {
			// 初始化表OrderDetails
			sql = "create table OrderDetails(orderDetailId int primary key auto_increment, orderId int, bookId int, bookPrice double, bookNum int, subTotal double)";
			doOperate(sql);
			System.out.println("====初始化表OrderDetails成功===");

		}else {
			System.out.println("OrderDetails表已存在");
		}
		closeAll();

	}
}
