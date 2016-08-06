package com.ahmad.dao;

import com.ahmad.model.Cart;

public interface CartDAO {

	Cart createCart(Cart cart);

	Cart read(String cartId);

	void update(String cartId, Cart cart);

	void delete(String Id);

}
