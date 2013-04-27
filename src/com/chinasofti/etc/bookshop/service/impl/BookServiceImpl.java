package com.chinasofti.etc.bookshop.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.bookshop.dao.BookDao;
import com.chinasofti.etc.bookshop.dao.jdbcimpl.BookDaoImpl;
import com.chinasofti.etc.bookshop.po.Book;
import com.chinasofti.etc.bookshop.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao = new BookDaoImpl(); 
	File file = new File("F:\\myeclipse\\Config.properties");
	Properties properties = new Properties();
	
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.findAllBooks();
	}

	public int addBooks(Book book) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.addBooks(book);
	}


	public Book findBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.findBookByBookId(bookId);
	}


	public int deleteBooks(int bookId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.deleteBooks(bookId);
	}

	public int modifyBooks(Book book,int bookId) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.modifyBooks(book,bookId);
	}

	public List<String> findAuthorByBookName(String bookName) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.findAuthorByBookName(bookName);
	}

	public List<String> findBookNameByAuthor(String author) {
		// TODO Auto-generated method stub
		try {
			properties.load(new FileInputStream(file));
			String bookDaoString = properties.getProperty("bookDaoString");
		    bookDao = (BookDao) Class.forName(bookDaoString).newInstance();
			
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
		return bookDao.findBookNameByAuthor(author);
	}

}
