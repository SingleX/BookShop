package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.CartItemDao;
import com.chinasofti.etc.bookshop.dao.OrderDetailDao;
import com.chinasofti.etc.bookshop.dao.jdbcimpl.CartItemDaoImpl;
import com.chinasofti.etc.bookshop.po.CartItem;
import com.chinasofti.etc.bookshop.service.CartItemService;

public class CartItemServiceImpl implements CartItemService {
	
	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();
	
	public int deleteCartByCartItemId(int cartItemId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String cartItemDaoString = properties.getProperty("cartItemDaoString");
			CartItemDao cartItemDao = (CartItemDao) Class.forName(cartItemDaoString).newInstance();
			return cartItemDao.deleteCartByCartItemId(cartItemId);

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

	public int deleteCartByCustomermId(int customerId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String cartItemDaoString = properties.getProperty("cartItemDaoString");
			CartItemDao cartItemDao = (CartItemDao) Class.forName(cartItemDaoString).newInstance();
			return cartItemDao.deleteCartByCustomermId(customerId);

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


	public int addBooksToCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String cartItemDaoString = properties.getProperty("cartItemDaoString");
			CartItemDao cartItemDao = (CartItemDao) Class.forName(cartItemDaoString).newInstance();
			return cartItemDao.addBooksToCartItem(cartItem);

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

	public List<CartItem> findAllCartItemsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String cartItemDaoString = properties.getProperty("cartItemDaoString");
			CartItemDao cartItemDao = (CartItemDao) Class.forName(cartItemDaoString).newInstance();
			return cartItemDao.findAllCartItemsByCustomerId(customerId);

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

}
