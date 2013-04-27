package com.chinasofti.etc.bookshop.po;

public class OrderDetail {
	private int orderDetailId;
	private int orderId;
	private int bookId;
	private double bookPrice;
	private int bookNum;
	private double subTotal;
	
	public int getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public OrderDetail(int orderDetailId,int orderId, int bookId, double bookPrice, int bookNum,
			double subTotal) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderId = orderId;
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookNum = bookNum;
		this.subTotal = subTotal;
	}
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
