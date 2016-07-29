package com.ahmad.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.ProductDAO;
import com.ahmad.model.Product;

public class ProductTest {

	static Product product;
	
	static ProductDAO productDAO;
	
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static  void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		
		product=(Product) context.getBean("product");
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	
	@Test
	public void getProductName() {
	product=productDAO.get("PRD001");
	String productName = product.getProductName();
	assertEquals("get the product Name", "Curtain1", productName);
	}
	
	@Test
	public void listProducts(){
		int prd= productDAO.listProduct().size();
		assertEquals("List size of products", 4, prd);
	}
	

}
