package com.chinasofti.etc.bookshop.service;

import java.util.List;

import com.chinasofti.etc.bookshop.po.CartItem;

public interface CartItemService {

	int deleteCartByCartItemId(int cartItemId);

	int deleteCartByCustomermId(int customerId);

	List<CartItem> findAllCartItemsByCustomerId(int customerId);

	public int addBooksToCartItem(CartItem cartItem);
}
