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
		
		
		productDAO.similarProducts("PRDE980E13FFCA0");
		
		
	/*	product.setProductId("PRD003");
		product.setProductName("Bed1");
		product.setDescription("This is  the first bed product");
		product.setCategoryId("CAT002");
		product.setSupplierId("SUP002");
		product.setOutOffStock(false);
		
		product.setQuantity(23);
		product.setPrice(52200);
		
		productDAO.saveOrUpdate(product);
		System.out.println(productDAO.listProduct());
		
		if(productDAO.get("PRD001")!=null)
		{
			System.out.println("Product Exist");
		}
		else
		{
			System.out.println("Product not Exists");
		}
		
		System.out.println(productDAO.listProduct().size());
		//productDAO.delete("pro-002");
*/		
		
		
	}
}
