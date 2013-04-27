package com.chinasofti.etc.bookshop.dao.mysqlimpl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.OrderDao;
import com.chinasofti.etc.bookshop.po.Order;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		List<Order> orders = new ArrayList<Order>();
		getConn();
		String sql = "select * from Orders";
		doQuery(sql);
		try {
			while(rs.next()){
				Order order = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderNo(rs.getString(2));
				order.setOrderMaker(rs.getString(3));
				order.setRecMoneyId(rs.getInt(4));
				order.setCustomerId(rs.getInt(5));
				order.setDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(6)) );
				order.setTotal(rs.getDouble(7));
				orders.add(order);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return orders;
	}

	public List<Order> findOrdersByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		List<Order> orders = new ArrayList<Order>();
		
		getConn();
		
		String sql = "select * from Orders where customerName = ?";
		doQuery(sql,customerName);
		try {
			while(rs.next()){
				Order  order = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderNo(rs.getString(2));
				order.setOrderMaker(rs.getString(3));
				order.setRecMoneyId(rs.getInt(4));
				order.setCustomerId(rs.getInt(5));
				order.setDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(6)));
				order.setTotal(rs.getDouble(7));
				orders.add(order);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return orders;
	}

	public int addOrders(Order order) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "insert into Orders values (null, ?, ?, ?, ?, ?, ?)";
		doOperate(sql,order.getOrderNo(),order.getOrderMaker(),
				order.getRecMoneyId(),order.getCustomerId(),order.getDate(),order.getTotal());
		
		closeAll();
		return result;
	}

	public Order findOrderByOrderId(int orderId) {
		// TODO Auto-generated method stub
		Order order = null;
		getConn();
		
		String sql = "select * from Orders where orderId = ?";
		doQuery(sql,orderId);
		try {
			while(rs.next()){
				order = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderNo(rs.getString(2));
				order.setOrderMaker(rs.getString(3));
				order.setRecMoneyId(rs.getInt(4));
				order.setCustomerId(rs.getInt(5));
				order.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(rs.getDate(6)));
				order.setTotal(rs.getDouble(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return order;
	}

	public Order findOrderByOrderNo(String orderNo) {
		// TODO Auto-generated method stub
		Order order = null;
		getConn();
		
		String sql = "select * from Orders where orderNo = ?";
		doQuery(sql,orderNo);
		try {
			while(rs.next()){
				 order = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderNo(rs.getString(2));
				order.setOrderMaker(rs.getString(3));
				order.setRecMoneyId(rs.getInt(4));
				order.setCustomerId(rs.getInt(5));
				order.setDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(6)));
				order.setTotal(rs.getDouble(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return order;
	}

	public int findOrderMaxId() {
		// TODO Auto-generated method stub
		int num = 0;
		getConn();
		
		String sql = "select MAX(orderId) from Orders";
		doQuery(sql);
		try {
			while(rs.next()){
				num = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return num;
	}

}
