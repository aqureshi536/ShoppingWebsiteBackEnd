package com.ahmad.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.SupplierDAO;
import com.ahmad.model.Supplier;

public class SupplierTest {
	static Supplier supplier;

	static SupplierDAO supplierDAO;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		
	supplier=(Supplier) context.getBean("supplier");
	supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
	}
	
	@Test
	public void getSupplierName() {
		supplier = supplierDAO.get("SUP001");
		String supplierName = supplier.getSupplierName();
		assertEquals("Get supplier Name", "Lalit", supplierName);

	}
	
	@Test
	public void listSupplierSize()
	{
		int supplierSize=supplierDAO.listSupplier().size();
		assertEquals("List suppliers", 4, supplierSize);
	}
	@AfterClass
	public static void close(){
		context.close();
		supplier=null;
		supplierDAO=null;
	}
		
	

}
