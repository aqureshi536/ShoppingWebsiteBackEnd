package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Category;
import com.ahmad.model.Product;

public interface CategoryDAO {

	void saveOrUpdate(Category category);
	
	void delete(String id);
	
	Category get(String id);
	
	public List<Category> listCategory();
	
	List<Product> selectedCategoryProductList(String id);
	
	List<Product> selectAllCategoryProducts(String categoryId);
	
	int getProductCountByCategory(String id);	
}
