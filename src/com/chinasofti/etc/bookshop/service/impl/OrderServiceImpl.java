package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.AdminDao;
import com.chinasofti.etc.bookshop.dao.OrderDao;
import com.chinasofti.etc.bookshop.dao.jdbcimpl.OrderDaoImpl;
import com.chinasofti.etc.bookshop.po.Order;
import com.chinasofti.etc.bookshop.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();
	
	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.findAllOrders();

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

	public List<Order> findOrdersByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.findOrdersByCustomerName(customerName);

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

	public Order findOrderByOrderId(int orderId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.findOrderByOrderId(orderId);

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

	public int addOrders(Order order) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.addOrders(order);

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

	public Order findOrderByOrderNo(String orderNo) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.findOrderByOrderNo(orderNo);

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

	public int findOrderMaxId() {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("orderDaoString");
			OrderDao orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
			return orderDao.findOrderMaxId();

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
