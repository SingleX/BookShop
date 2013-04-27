package com.chinasofti.etc.bookshop.dao.jdbcimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.bookshop.dao.CartItemDao;
import com.chinasofti.etc.bookshop.po.CartItem;
import com.chinasofti.etc.bookshop.po.OrderDetail;

public class CartItemDaoImpl extends BaseDao implements CartItemDao {

	public int deleteCartByCartItemId(int cartItemId) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "delete from CartItems where cartItemId = ?";
		doOperate(sql,cartItemId);
		closeAll();
		return result;
	}

	public int deleteCartByCustomermId(int customerId) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "delete from CartItems where customerId = ?";
		doOperate(sql,customerId);
		closeAll();
		return result;
	}



	public int addBooksToCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		getConn();
		
		String sql = "insert into CartItems values(?,?,?,?,?)";
		doOperate(sql,cartItem.getBookId(),cartItem.getBookNum(),
				cartItem.getSubTotal(),cartItem.getBookPrice(),cartItem.getCustomerId());
		
		closeAll();
		return result;
	}

	public List<CartItem> findAllCartItemsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<CartItem> cartItems = new ArrayList<CartItem>();
		getConn();
		
		String sql = "select * from CartItems where customerId = ?";
		doQuery(sql,customerId);
		try {
			while(rs.next()){
				CartItem cartItem = new CartItem();
				cartItem.setCartItemId(rs.getInt(1));
				cartItem.setBookId(rs.getInt(2));
				cartItem.setBookNum(rs.getInt(3));
				cartItem.setSubTotal(rs.getDouble(4));
				cartItem.setBookPrice(rs.getDouble(5));
				cartItem.setCustomerId(rs.getInt(6));
				cartItems.add(cartItem);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return cartItems;
	}

	
}
