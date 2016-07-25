package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.CartDAO;
import com.ahmad.model.Cart;

public class CartTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		
		
		Cart cart=(Cart)context.getBean("cart");
		CartDAO cartDAO =(CartDAO)context.getBean("cartDAO");
		
		cart.setCartProductId("123");
		cart.setCartProductName("First Cart Item");
		cart.setCartProductUser("user 1");
		cart.setCartProductPrice(123);
		cartDAO.saveOrUpdate(cart);
	}
}
