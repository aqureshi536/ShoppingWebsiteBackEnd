package com.ahmad.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.CategoryDAO;
import com.ahmad.model.Category;

public class CategoryTest {

	static Category category;

	static CategoryDAO categoryDAO;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void listCategory() {
		int cat = categoryDAO.listCategory().size();
		assertEquals("Test for list size category", 4, cat);
	}

	@Test
	public  void getCategoryName() {
		category = categoryDAO.get("CAT002");
		String name=category.getCategoryName();
		 assertEquals("This is a test for getting Name","Curtains",name);
	}
	
	
}
