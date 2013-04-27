package com.chinasofti.etc.bookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.bookshop.dao.jdbcimpl.BaseDao;
import com.chinasofti.etc.bookshop.po.Book;
import com.chinasofti.etc.bookshop.service.BookService;
import com.chinasofti.etc.bookshop.service.impl.BookServiceImpl;

public class IndexServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public IndexServlet() {
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
		
		/**
		 * 这里做数据库的初始化操作 ，并返回index.jsp页面
		 */
		BaseDao baseDao =new BaseDao();
		baseDao.doInit();//调用数据库初始化函数，到这句话，数据库已经完全OK了
		
		String action = request.getParameter("action");
		BookService bookService = new BookServiceImpl();
		if (action.equals("index")) {//接受参数
			List<Book> books = bookService.findAllBooks();
			HttpSession session = request.getSession();
			session.setAttribute("books", books);//得到books
			response.sendRedirect("index.jsp");//传参
		}
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
