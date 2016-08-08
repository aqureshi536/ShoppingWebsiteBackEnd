package com.ahmad.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "category")
@Component
public class Category {
	@Id
	private String categoryId;
	
	@NotBlank(message="Give category a name")
	private String categoryName;
	
	@NotBlank(message="Give a category description")
	private String categoryDescription;

	@Transient
	private MultipartFile categoryImage;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public MultipartFile getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(MultipartFile categoryImage) {
		this.categoryImage = categoryImage;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", categoryImage=" + categoryImage + "]";
	}

	public Category()
	{
		this.categoryId="CAT"+UUID.randomUUID().toString().substring(24).toUpperCase();
	}
}
