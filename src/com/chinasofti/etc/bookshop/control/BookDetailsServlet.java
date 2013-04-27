package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;

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

public class BookDetailsServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookDetailsServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strBookIdString = request.getParameter("bookId");
		String customerNameString = request.getParameter("customername");
		
		int bookId = Integer.parseInt(strBookIdString);
		BookService bookService = new BookServiceImpl();
		Book book = bookService.findBookByBookId(bookId);
		
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.findCustomerByCustomerName(customerNameString);
		int customerId = customer.getCustomerId();

		HttpSession session = request.getSession();
		session.setAttribute("book", book);
		session.setAttribute("customerId", customerId);
		session.setAttribute("customerName", customerNameString);

		response.sendRedirect("bookdetails.jsp");
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
