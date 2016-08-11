package com.ahmad.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItem {
	@Id
	private String cartItemId;
	
	private String cartId;
	private String customerId;
	private String productId;
	

	private int quantity;
	private double totalPrice;
	
	
	
	/*@Transient
	Product product;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/
	
	
	
	
	

	public String getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	public CartItem() {
		this.cartItemId ="CRTITEM" +UUID.randomUUID().toString().substring(24).toUpperCase();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/*
	 * private Product product; private int quantity; private double totalPrice;
	 * 
	 * public Product getProduct() { return product; }
	 * 
	 * public void setProduct(Product product) { this.product = product; }
	 * 
	 * public int getQuantity() { return quantity; }
	 * 
	 * public void setQuantity(int quantity) { this.quantity = quantity; }
	 * 
	 * public double getTotalPrice() { return totalPrice; }
	 * 
	 * 
	 * 
	 * public void setTotalPrice(double totalPrice) { this.totalPrice =
	 * totalPrice; }
	 * 
	 * public CartItem(){}
	 * 
	 * public CartItem(Product product, int quantity, double totalPrice) {
	 * this.product = product; this.quantity = quantity; this.totalPrice =
	 * totalPrice; }
	 */

}
