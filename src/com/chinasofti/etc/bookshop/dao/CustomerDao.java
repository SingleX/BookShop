package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Customer;

public interface CustomerDao {
	List<Customer> findAllCustomers();
	Customer findCustomerByCustomerName(String customerName);
	Customer findCustomerByCustomerId(int customerId);
	int addCustomers(Customer customer);
	int deleteCustomers(int customerId);
	int modifyCustomers(int customerId);
	void doCustomerInit();
}
