package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Cart;

public interface CartDAO {

	void saveOrUpdate(Cart cart);
	
	void delete(String id);
	
	Cart get(String id);
	
	List<Cart> listCartItems();
}
