package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.CategoryDAO;
import com.ahmad.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();

		Category category = (Category) context.getBean("category");
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		category.setCategoryId("CAT004");
		category.setCategoryName("Tables");
		category.setCategoryDescription("This is a table category");
		category.setCategoryImage("table.jpg");
		
		
		categoryDAO.saveOrUpdate(category);
		
		if(categoryDAO.get("cat-004")!=null)
		{
			System.out.println("Category Exist");
		}
		else{
			System.out.println("Category doesnt exist");
		}
		
		//categoryDAO.delete("cat-003");
		
		System.out.println(categoryDAO.listCategory());
	}

}
