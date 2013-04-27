package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.CustomerDao;
import com.chinasofti.etc.bookshop.po.Customer;
import com.chinasofti.etc.bookshop.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();

	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.findAllCustomers();
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

	public Customer findCustomerByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.findCustomerByCustomerName(customerName);
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

	public Customer findCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.findCustomerByCustomerId(customerId);
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

	public int addCustomers(Customer customer) {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.addCustomers(customer);
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

	public int deleteCustomers(int customerId) {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.deleteCustomers(customerId);
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

	public int modifyCustomers(int customerId) {
		// TODO Auto-generated method stub
		
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			return customerDao.modifyCustomers(customerId);
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

	public void doCustomerInit() {
		// TODO Auto-generated method stub
		try {
			properties = new Properties();
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();
			customerDao.doCustomerInit();
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

	}

	public boolean isValidateCustomer(String customerName, String customerPassword) {
		// TODO Auto-generated method stub
		
		boolean result = false;

		try {
			properties.load(new FileInputStream(file));
			String customerDaoString = properties.getProperty("customerDaoString");
			CustomerDao customerDao = (CustomerDao) Class.forName(customerDaoString).newInstance();

			Customer customer = customerDao.findCustomerByCustomerName(customerName);
			if (customer != null && customer.getCustomerPassword().equals(customerPassword)) {
				result = true;
			}

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
		return result;
	}

}
