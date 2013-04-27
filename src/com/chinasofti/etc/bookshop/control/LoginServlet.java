package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.bookshop.po.Book;
import com.chinasofti.etc.bookshop.service.AdminService;
import com.chinasofti.etc.bookshop.service.BookService;
import com.chinasofti.etc.bookshop.service.CustomerService;
import com.chinasofti.etc.bookshop.service.impl.AdminServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.BookServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.CustomerServiceImpl;

public class LoginServlet extends HttpServlet {
	
	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idString = request.getParameter("shenfen");
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("userpassword");
		
		AdminService adminService = new AdminServiceImpl();
		BookService bookService = new BookServiceImpl();
		CustomerService customerService = new CustomerServiceImpl();
		
		if (idString.equals("1")) {
			if (adminService.isValidateAdmin(userName, userPassword)) {
				HttpSession session = request.getSession();
				session.setAttribute("adminName", userName);
				
				response.sendRedirect("admin.jsp");
			} else {
				RequestDispatcher rdp = request.getRequestDispatcher("login.jsp");
				rdp.forward(request, response);
			}
		}
		else {
			if (customerService.isValidateCustomer(userName, userPassword)) {
				HttpSession session = request.getSession();
				session.setAttribute("customerName", userName);
				
				List<Book> books = bookService.findAllBooks();
				session.setAttribute("books", books);
				
				response.sendRedirect("booklist.jsp");
			} else {
				RequestDispatcher rdp = request.getRequestDispatcher("login.jsp");
				rdp.forward(request, response);
			}
			
			
			
			
		}
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
