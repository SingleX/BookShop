package com.chinasofti.etc.bookshop.po;

public class Book {
	
	private int bookId;
	private String bookIsbn;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
	private String bookPublisher;
	private int bookStore;
	private String bookImage;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public int getBookStore() {
		return bookStore;
	}
	public void setBookStore(int bookStore) {
		this.bookStore = bookStore;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	
	public Book(int bookId, String bookIsbn, String bookName, double bookPrice,
			String bookAuthor, String bookPublisher, int bookStore,
			String bookImage) {
		super();
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookStore = bookStore;
		this.bookImage = bookImage;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
