package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.bookshop.po.Book;
import com.chinasofti.etc.bookshop.po.Customer;
import com.chinasofti.etc.bookshop.service.BookService;
import com.chinasofti.etc.bookshop.service.CustomerService;
import com.chinasofti.etc.bookshop.service.impl.BookServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.CustomerServiceImpl;

public class BuyAgainServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BuyAgainServlet() {
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

		String dString = request.getParameter("customerId");
		int customerId = Integer.parseInt(dString);
		BookService bookService = new BookServiceImpl();
		List<Book> books = bookService.findAllBooks();
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.findCustomerByCustomerId(customerId);
		String customerName = customer.getCustomerName();
		
		HttpSession session = request.getSession();
		session.setAttribute("customerName", customerName);
		session.setAttribute("books", books);
		response.sendRedirect("booklist.jsp");
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
