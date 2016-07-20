package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.ProductDAO;
import com.ahmad.model.Product;

public class ProductTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();

		Product product =(Product) context.getBean("product");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		
		product.setProductId("pro-003");
		product.setProductName("Product Name");
		product.setDescription("This is  the second product");
		product.setCategoryId("cat-002");
		product.setSupplierId("SUP-001");
		product.setImageUrl("product2.jpg");
		product.setQuantity(15);
		product.setPrice(78.95);
		
		productDAO.saveOrUpdate(product);
		System.out.println(productDAO.listProduct());
		
		if(productDAO.get("pro-002")!=null)
		{
			System.out.println("Product Exist");
		}
		else
		{
			System.out.println("Product not Exists");
		}
		
		
		productDAO.delete("pro-002");
		
		
		
	}
}
