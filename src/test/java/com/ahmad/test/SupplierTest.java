package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.SupplierDAO;
import com.ahmad.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();

		Supplier supplier = (Supplier) context.getBean("supplier");

		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		supplier.setSupplierId("SUP-005");
		supplier.setSupplierName("mUkesh");
		supplier.setSupplierContact("9964663627");
		supplier.setSupplierAddress("Peeli Gali");
		supplier.setSupplierEmail("muk@g.c");
		supplier.setSupplierImage("bye.jpg");

		supplierDAO.saveOrUpdate(supplier);

		if (supplierDAO.get("SUP003") != null)
			System.out.println("Supplier Exist");
		else
		System.out.println("Supplier not Exist ");

		
			 //supplierDAO.delete("SUP-001");
		 
		 System.out.println(supplierDAO.listSupplier().size());
		 
	}

}
