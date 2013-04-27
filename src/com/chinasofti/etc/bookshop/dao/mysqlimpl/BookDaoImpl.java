package com.chinasofti.etc.bookshop.dao.mysqlimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.BookDao;
import com.chinasofti.etc.bookshop.po.Book;

public class BookDaoImpl extends BaseDao implements BookDao {

	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
        List<Book> books = new ArrayList<Book>();
		
		getConn();
		String sql = "select * from Books";
		doQuery(sql);
		try {
			while(rs.next()){
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookIsbn(rs.getString(2));
				book.setBookName(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookAuthor(rs.getString(5));
				book.setBookPublisher(rs.getString(6));
				book.setBookStore(rs.getInt(7));
				book.setBookImage(rs.getString(8));
				
				books.add(book);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		closeAll();
		return books;
	}

	public Book findBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		Book book = null;
		getConn();
		String sql = "select * from Books where bookId = ?";
		doQuery(sql,bookId);
		try {
			if(rs.next()){
			    book = new Book();
				
				book.setBookId(rs.getInt(1));
				book.setBookIsbn(rs.getString(2));
				book.setBookName(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookAuthor(rs.getString(5));
				book.setBookPublisher(rs.getString(6));
				book.setBookStore(rs.getInt(7));
				book.setBookImage(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return book;
	}

	public int addBooks(Book book) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "insert into Books values(null, ?, ? ,? ,? ,?, ?, ?)";
		doOperate(sql, book.getBookIsbn(),book.getBookName(),book.getBookPrice(),
		book.getBookAuthor(),book.getBookPublisher(),book.getBookStore(),book.getBookImage());
		closeAll();
		return result;
	}

	public int deleteBooks(int bookId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "detete from Books where bookID = ?";
		doQuery(sql, bookId);
		closeAll();
		return result;
	}

	public int modifyBooks(Book book,int bookId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Books set bookId=?,bookIsbn='?',bookName='?'," +
		"bookPrice=?,bookAuthor='?',bookPublisher='?',bookStore=?,bookImage='?'" 
				+"where bookId=?";
		doOperate(sql, book.getBookId(),book.getBookIsbn(),book.getBookName(),
				book.getBookPrice(),book.getBookAuthor(),
				book.getBookPublisher(),book.getBookStore(),book.getBookImage());
		
		closeAll();
		return 0;
	}

	public List<String> findAuthorByBookName(String bookName){
		// TODO Auto-generated method stub
		getConn();

        List <String> strings = new ArrayList<String>();
		String sql = "select * from  BookAuthors where bookName = '?'";
		doQuery(sql, bookName);
		try {
			while(rs.next()){
				Book book = new Book();
				book.setBookAuthor(rs.getString(3));
				strings.add(book.getBookAuthor());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		closeAll();
		return strings;
	}

	public List<String> findBookNameByAuthor(String author) {
		// TODO Auto-generated method stub
		getConn();

        List <String> strings = new ArrayList<String>();
		String sql = "select * from  BookAuthors where bookAuthor = '?'";
		doQuery(sql, author);
		try {
			while(rs.next()){
				Book book = new Book();
				book.setBookName(rs.getString(2));
				strings.add(book.getBookName());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeAll();
		return strings;
	}

}
