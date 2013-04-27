package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> findOrderDetailsByOrderId(int orderId);

	List<OrderDetail> findOrderDetailsByCustomerId(int customerID);

	int addOrderDetail(OrderDetail orderDetail);
}
