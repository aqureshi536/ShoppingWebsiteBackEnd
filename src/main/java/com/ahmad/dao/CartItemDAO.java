package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.CartItem;

public interface CartItemDAO {

	void saveOrUpdate(CartItem cartItem);

	void delete(String cartItemId);

	CartItem getCartItem(String cartItemId);

	List<CartItem> getCartItemsByCustomerId(String customerId);

	List<CartItem> listCartItems();

}
