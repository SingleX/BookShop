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

import com.chinasofti.etc.bookshop.po.OrderDetail;
import com.chinasofti.etc.bookshop.service.OrderDetailService;
import com.chinasofti.etc.bookshop.service.impl.OrderDetailServiceImpl;

public class OrderDetailServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public OrderDetailServlet() {
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

		String stingOrderId = request.getParameter("orderId");
		int orderId = Integer.parseInt(stingOrderId);
		
		OrderDetailService orderDetailService = new OrderDetailServiceImpl();
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		orderDetails = orderDetailService.findOrderDetailsByOrderId(orderId);
	
		HttpSession sessioin = request.getSession();
		sessioin.setAttribute("orderDetails", orderDetails);
		
		response.sendRedirect("orderdetails.jsp");
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
