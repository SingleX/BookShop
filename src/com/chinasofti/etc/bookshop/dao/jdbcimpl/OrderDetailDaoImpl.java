package com.chinasofti.etc.bookshop.dao.jdbcimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.OrderDetailDao;
import com.chinasofti.etc.bookshop.po.OrderDetail;

public class OrderDetailDaoImpl extends BaseDao implements OrderDetailDao {

	public List<OrderDetail> findOrderDetailsByOrderId(int orderId) {
		// TODO Auto-generated method stub
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		getConn();
		
		String sql = "select * from OrderDetails where orderId = ?";
		doQuery(sql,orderId);
		try {
			while(rs.next()){
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setOrderDetailId(rs.getInt(1));
				orderDetail.setOrderId(rs.getInt(2));
				orderDetail.setBookId(rs.getInt(3));
				orderDetail.setBookPrice(rs.getDouble(4));
				orderDetail.setBookNum(rs.getInt(5));
				orderDetail.setSubTotal(rs.getDouble(6));
				orderDetails.add(orderDetail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return orderDetails;
	}

	public List<OrderDetail> findOrderDetailsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		getConn();
		
		String sql = "select * from OrderDetails where customerId = ?";
		doQuery(sql,customerId);
		try {
			while(rs.next()){
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setOrderDetailId(rs.getInt(1));
				orderDetail.setOrderId(rs.getInt(2));
				orderDetail.setBookId(rs.getInt(3));
				orderDetail.setBookPrice(rs.getDouble(4));
				orderDetail.setBookNum(rs.getInt(5));
				orderDetail.setSubTotal(rs.getDouble(6));
				orderDetails.add(orderDetail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return orderDetails;
	}

	public int addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "insert into OrderDetails values(?,?,?,?,?)";
		doOperate(sql,orderDetail.getOrderId(),
				orderDetail.getBookId(),orderDetail.getBookPrice(),orderDetail.getBookNum(),
				orderDetail.getSubTotal());
		
		closeAll();
		return result;
	}
	

}
