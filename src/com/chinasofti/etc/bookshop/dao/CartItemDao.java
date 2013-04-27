package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.CartItem;

public interface CartItemDao {
	
	int deleteCartByCartItemId(int cartItemId);
	int deleteCartByCustomermId(int customerId);
	List<CartItem> findAllCartItemsByCustomerId(int CustomerId);
	
	public int addBooksToCartItem(CartItem cartItem);
}
