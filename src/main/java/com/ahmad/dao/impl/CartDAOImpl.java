package com.ahmad.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ahmad.dao.CartDAO;
import com.ahmad.model.Cart;

public class CartDAOImpl implements CartDAO {

	// Gets the whole cart and assign to the map
	private Map<String, Cart> listOfCarts;

	public CartDAOImpl() {
		listOfCarts = new HashMap<>();
	}

	@Override
	public Cart createCart(Cart cart) {
		if(listOfCarts.containsKey(cart.getCartId())){
			throw new IllegalArgumentException(String.format("Cannot create cart with with id",cart.getCartId()));
		}
		return null;
	}

	@Override
	public Cart read(String cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String cartId, Cart cart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String Id) {
		// TODO Auto-generated method stub

	}

}
