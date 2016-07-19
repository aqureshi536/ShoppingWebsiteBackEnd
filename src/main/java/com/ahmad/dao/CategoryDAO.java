package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Category;

public interface CategoryDAO {

	void saveOrUpdate(Category category);
	
	void delete(String id);
	
	Category get(String id);
	
	public List<Category> listCategory();
}
