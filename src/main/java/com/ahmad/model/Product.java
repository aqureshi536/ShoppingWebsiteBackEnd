package com.ahmad.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "product")
@Component
public class Product {
	@Id
	
	private String productId;
	private String productName;
	private String description;
	private String categoryId;
	private String supplierId;
	@Column(name = "out_off_stock")
	private boolean isOutOffStock;

	private int quantity;
	private double price;
	
	@Transient
	private MultipartFile imageUrl;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public boolean isOutOffStock() {
		return isOutOffStock;
	}

	public void setOutOffStock(boolean isOutOffStock) {
		this.isOutOffStock = isOutOffStock;
	}

	
	public MultipartFile getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(MultipartFile imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", categoryId=" + categoryId + ", supplierId=" + supplierId + ", isOutOffStock=" + isOutOffStock
				+ ", imageUrl=" + imageUrl + ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	public Product() {
		
		this.productId=UUID.randomUUID().toString().substring(24);
		
	}
	
	

}
