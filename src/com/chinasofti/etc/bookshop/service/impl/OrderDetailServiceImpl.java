package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.OrderDao;
import com.chinasofti.etc.bookshop.dao.OrderDetailDao;
import com.chinasofti.etc.bookshop.dao.jdbcimpl.OrderDetailDaoImpl;
import com.chinasofti.etc.bookshop.po.OrderDetail;
import com.chinasofti.etc.bookshop.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {

	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();
	
	public List<OrderDetail> findOrderDetailsByOrderId(int orderId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDetailDaoString = properties.getProperty("orderDetailDaoString");
			OrderDetailDao orderDetailDao = (OrderDetailDao) Class.forName(orderDetailDaoString).newInstance();
			return orderDetailDao.findOrderDetailsByOrderId(orderId);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<OrderDetail> findOrderDetailsByCustomerId(int customerID) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDetailDaoString = properties.getProperty("orderDetailDaoString");
			OrderDetailDao orderDetailDao = (OrderDetailDao) Class.forName(orderDetailDaoString).newInstance();
			return orderDetailDao.findOrderDetailsByCustomerId(customerID);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDetailDaoString = properties.getProperty("orderDetailDaoString");
			OrderDetailDao orderDetailDao = (OrderDetailDao) Class.forName(orderDetailDaoString).newInstance();
			return orderDetailDao.addOrderDetail(orderDetail);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
