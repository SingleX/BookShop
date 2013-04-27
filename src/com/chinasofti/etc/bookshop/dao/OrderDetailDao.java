package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.OrderDetail;

public interface OrderDetailDao {

	List<OrderDetail> findOrderDetailsByOrderId(int orderId);

	List<OrderDetail> findOrderDetailsByCustomerId(int customerID);

	int addOrderDetail(OrderDetail orderDetail);

	// int deleteCartByCartItemId(int cartItemId);

}
