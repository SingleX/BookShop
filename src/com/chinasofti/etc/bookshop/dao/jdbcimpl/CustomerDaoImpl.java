package com.chinasofti.etc.bookshop.dao.jdbcimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.CustomerDao;
import com.chinasofti.etc.bookshop.po.Customer;

public class CustomerDaoImpl extends BaseDao implements CustomerDao {

	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		getConn();
		String sql = "select * from Customers";
		doQuery(sql);
		try {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerNo(rs.getString(2));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPassword(rs.getString(4));
				customer.setCustomerAddress(rs.getString(5));

				customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return customers;
	}

	public Customer findCustomerByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		Customer customer = null;
		getConn();
		String sql = "select * from Customers where customerName like ?";
		doQuery(sql, customerName);
		try {
			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerNo(rs.getString(2));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPassword(rs.getString(4));
				customer.setCustomerAddress(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeAll();
		return customer;
	}

	public Customer findCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		getConn();
		String sql = "select * from Customers where customerId = ?";
		doQuery(sql, customerId);
		try {
			if (rs.next()) {
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerNo(rs.getString(2));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPassword(rs.getString(4));
				customer.setCustomerAddress(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return customer;
	}

	public int addCustomers(Customer customer) {
		// TODO Auto-generated method stub
		getConn();

		String sql = "insert into Customers values(?,?,?,?)";
		doOperate(sql, customer.getCustomerNo(), customer.getCustomerName(), customer.getCustomerPassword(), customer.getCustomerAddress());
		System.out.println("--用户添加成功--");

		closeAll();
		return 0;
	}

	public int deleteCustomers(int customerId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Customers where customerId = ?";
		doOperate(sql, customerId);
		
		closeAll();
		return 0;
	}

	public int modifyCustomers(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		getConn();
		String sql = "select * from Customers where customerId = ?";
		doQuery(sql, customerId);
		try {
			if (rs.next()) {
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerNo(rs.getString(2));
				customer.setCustomerName(rs.getString(3));
				customer.setCustomerPassword(rs.getString(4));
				customer.setCustomerAddress(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "update Customers set customerIsbn=?,customerName=?,customerPassword=?,customerAdress = ? where customerId = ?";
		doOperate(sql,customer.getCustomerNo(),customer.getCustomerName(),customer.getCustomerPassword(),customer.getCustomerAddress(),customerId);
		
		closeAll();
		return 0;
	}

	public void doCustomerInit() {
		// TODO Auto-generated method stub
		getConn();

		String sql = null;
		if (!existTable("Customers")) {
			// 初始化表Books
			sql = "create table Customers(customerId int primary key identity(1,1), customerIsbn nvarchar(100), customerName nvarchar(100), customerPassword nvarchar(100), customerAdress nvarchar(100))";
			doOperate(sql);
			sql = "insert into Customers values('20121', 'AAA', 'AAA', '淄博张店')";
			doOperate(sql);
			sql = "insert into Customers values('20122', 'BBB', 'BBB', '淄博张店')";
			doOperate(sql);
			sql = "insert into Customers values('20123', 'CCC', 'CCC', '淄博张店')";
			doOperate(sql);
			System.out.println("====初始化表Customers成功===");

		}

	}

}
