package com.chinasofti.etc.bookshop.po;


public class Order {
	private int orderId;
	private String orderNo;
	private String orderMaker;
	private int recMoneyId;
	private int customerId;
	private String date;
	private double total;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderMaker() {
		return orderMaker;
	}
	public void setOrderMaker(String orderMaker) {
		this.orderMaker = orderMaker;
	}
	public int getRecMoneyId() {
		return recMoneyId;
	}
	public void setRecMoneyId(int recMoneyId) {
		this.recMoneyId = recMoneyId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Order(int orderId, String orderNo, String orderMaker,
			int recMoneyId, int customerId, String date, double total) {
		super();
		this.orderId = orderId;
		this.orderNo = orderNo;
		this.orderMaker = orderMaker;
		this.recMoneyId = recMoneyId;
		this.customerId = customerId;
		this.date = date;
		this.total= total;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
