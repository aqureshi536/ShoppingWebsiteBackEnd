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
		
		category.setCategoryId("cat-004");
		category.setCategoryName("second Category");
		category.setDescription("This My secong Category");
		category.setImageUrl("cat.jpg");
		category.setSupplierId("SUP-003");
		
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
