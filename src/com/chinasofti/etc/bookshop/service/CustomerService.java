package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Customer;

public interface CustomerService {
	List<Customer> findAllCustomers();
	Customer findCustomerByCustomerName(String customerName);
	Customer findCustomerByCustomerId(int customerId);
	int addCustomers(Customer customer);
	int deleteCustomers(int customerId);
	int modifyCustomers(int customerId);
	void doCustomerInit();
	boolean isValidateCustomer(String customerName, String customerPassword);
}
