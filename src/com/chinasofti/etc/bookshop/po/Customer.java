package com.chinasofti.etc.bookshop.po;

public class Customer {
	private int customerId;
	private String customerNo;
	private String customerName;
	private String customerPassword;
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Customer(int customerId, String customerNo, String customerName, String customerPassword, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
