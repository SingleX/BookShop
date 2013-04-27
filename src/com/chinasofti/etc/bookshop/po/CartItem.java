package com.chinasofti.etc.bookshop.po;

public class CartItem {
	private int cartItemId;
	private int bookId;
	private int bookNum;
	private double subTotal;
	private double bookPrice;
	private int customerId;
	
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public CartItem(int cartItemId, int bookId, int bookNum, double subTotal,int bookPrice,
			int customerId) {
		super();
		this.cartItemId = cartItemId;
		this.bookId = bookId;
		this.bookNum = bookNum;
		this.subTotal = subTotal;
		this.bookPrice = bookPrice;
		this.customerId = customerId;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
