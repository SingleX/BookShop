package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.bookshop.po.Book;
import com.chinasofti.etc.bookshop.po.CartItem;
import com.chinasofti.etc.bookshop.service.BookService;
import com.chinasofti.etc.bookshop.service.CartItemService;
import com.chinasofti.etc.bookshop.service.impl.BookServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.CartItemServiceImpl;

public class AddCartItemServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddCartItemServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String StingbookId = request.getParameter("bookId");
		String StingbookNum = request.getParameter("bookNum");
		String stingcustomerId = request.getParameter("customerId");
		
		int bookId = Integer.parseInt(StingbookId);
		int bookNum = Integer.parseInt(StingbookNum);
		
		int customerId = Integer.parseInt(stingcustomerId);
		
		BookService bookService = new BookServiceImpl();
		
		
		CartItemService cartItemService = new CartItemServiceImpl();
		
		List<CartItem> cartItems = cartItemService.findAllCartItemsByCustomerId(customerId);
		if(cartItems == null){
			cartItems = new ArrayList<CartItem>();
			
		}
		CartItem cartItem = new CartItem();
		Book book = bookService.findBookByBookId(bookId);
		cartItem.setBookId(bookId);
		cartItem.setBookNum(bookNum);
		cartItem.setCustomerId(customerId);
		cartItem.setBookPrice(book.getBookPrice());
		cartItem.setSubTotal(bookNum*book.getBookPrice());
//		cartItem.setSubTotal(5);
		cartItemService.addBooksToCartItem(cartItem);
		cartItems.add(cartItem);
		
		HttpSession session = request.getSession();
		session.setAttribute("customerId", customerId);
		session.setAttribute("cartItems", cartItems);
		
		
		response.sendRedirect("cartitem.jsp");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
