package com.ahmad.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OrderedItems {
	@Id
	private String orderedItemId;
	private String customerId;
	private String productId;
	private double totalPrice;
	private int quantity;

	public String getOrderedItemId() {
		return orderedItemId;
	}

	public void setOrderedItemId(String orderedItemId) {
		this.orderedItemId = orderedItemId;
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

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderedItems() {
		this.orderedItemId = "OI" + UUID.randomUUID().toString().substring(24).toUpperCase();
	}

}
