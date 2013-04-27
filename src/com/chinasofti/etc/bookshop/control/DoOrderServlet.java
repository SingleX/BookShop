package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.bookshop.po.CartItem;
import com.chinasofti.etc.bookshop.po.Order;
import com.chinasofti.etc.bookshop.po.OrderDetail;
import com.chinasofti.etc.bookshop.service.CartItemService;
import com.chinasofti.etc.bookshop.service.OrderDetailService;
import com.chinasofti.etc.bookshop.service.OrderService;
import com.chinasofti.etc.bookshop.service.impl.CartItemServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.OrderDetailServiceImpl;
import com.chinasofti.etc.bookshop.service.impl.OrderServiceImpl;

public class DoOrderServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DoOrderServlet() {
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

		String stingCustomerId = request.getParameter("customerId");
		int customerId = Integer.parseInt(stingCustomerId);
		String stringTotal = request.getParameter("totalMoney");
		double total = Double.parseDouble(stringTotal);

		CartItemService cartItemService = new CartItemServiceImpl();
		List<CartItem> cartItems = new ArrayList<CartItem>();
		cartItems = cartItemService.findAllCartItemsByCustomerId(customerId);
		CartItem cartItem = null;

		OrderDetailService orderDetailService = new OrderDetailServiceImpl();
		OrderDetail orderDetail = null;

		OrderService orderService = new OrderServiceImpl();
		Date date = new Date();
		SimpleDateFormat matter = new SimpleDateFormat("yyyyMMddHHmmss");
		String timePattern = matter.format(date);
		SimpleDateFormat matter1 = new SimpleDateFormat("yyyy-MM-dd");
		String timePattern1 = matter1.format(date);
		int num = orderService.findOrderMaxId();

		Order order = new Order();
		// order.setOrderId(num+1);
		order.setOrderNo(timePattern);
		order.setOrderMaker("liuhongjun");
		order.setRecMoneyId(customerId);
		order.setCustomerId(customerId);
		order.setDate(timePattern1);
		order.setTotal(total);

		orderService.addOrders(order);

		Iterator<CartItem> iterator = cartItems.iterator();
		while (iterator.hasNext()) {
			cartItem = iterator.next();
			orderDetail = new OrderDetail();
			// orderDetail.setOrderDetailId(num+1);
			orderDetail.setOrderId(num + 1);
			orderDetail.setBookId(cartItem.getBookId());
			orderDetail.setBookPrice(cartItem.getBookPrice());
			orderDetail.setBookNum(cartItem.getBookNum());
			orderDetail.setSubTotal(cartItem.getSubTotal());
			orderDetailService.addOrderDetail(orderDetail);

		}

		cartItemService.deleteCartByCustomermId(customerId);

		// Order order1 = orderService.findOrderByOrderNo(timePattern);
		order = orderService.findOrderByOrderId(num+1);

		HttpSession session = request.getSession();
		session.setAttribute("order", order);

		response.sendRedirect("order.jsp");
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
