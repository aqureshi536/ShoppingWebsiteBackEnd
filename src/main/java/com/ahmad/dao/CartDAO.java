package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Cart;
import com.ahmad.model.OrderedItems;

public interface CartDAO {

	void saveOrUpdate(Cart cart);
	
	void delete(String cartId);
	
	Cart getCartByCustomerId(String customerId);
	
	List<Cart> listCart();
	
	List<OrderedItems> listOrderedItems(String customerId);
	
	/*Cart createCart(Cart cart);

	Cart read(String cartId);

	void update(String cartId, Cart cart);

	void delete(String Id);
*/
}
