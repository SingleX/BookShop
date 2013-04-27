package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Order;
public interface OrderDao {
	
	List<Order> findAllOrders();
	List<Order> findOrdersByCustomerName(String customerName);
	int findOrderMaxId();
	Order findOrderByOrderId(int orderId);
	Order findOrderByOrderNo(String orderNo);
	int addOrders(Order order);

}
