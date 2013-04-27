package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.CartItem;
import com.chinasofti.etc.bookshop.po.Order;

public interface OrderService {
	
	List<Order> findAllOrders();
	List<Order> findOrdersByCustomerName(String customerName);
	public int findOrderMaxId();
	Order findOrderByOrderId(int orderId);
	Order findOrderByOrderNo(String orderNo);
	int addOrders(Order order);
}
