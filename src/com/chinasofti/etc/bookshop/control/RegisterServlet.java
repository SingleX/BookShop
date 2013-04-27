package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.etc.bookshop.po.Customer;
import com.chinasofti.etc.bookshop.service.CustomerService;
import com.chinasofti.etc.bookshop.service.impl.CustomerServiceImpl;

public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
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

		String customerName = request.getParameter("username");
		String customerPassword = request.getParameter("userpassword");
		String customerPassword2 = request.getParameter("userpassword2");
		
		String customerAddress0 = request.getParameter("useraddress");
		String customerAddress = new String(customerAddress0.getBytes("ISO-8859-1"),"utf-8");
		
		CustomerService customerService = new CustomerServiceImpl();
		if (customerService.findCustomerByCustomerName(customerName) == null) {
			Customer customer = new Customer();
			customer.setCustomerName(customerName);
			customer.setCustomerPassword(customerPassword);
			customer.setCustomerAddress(customerAddress);
			customerService.addCustomers(customer);
			response.sendRedirect("success.jsp");
		}
		else {
			RequestDispatcher rdp = request.getRequestDispatcher("register.jsp");
			rdp.forward(request, response);
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
