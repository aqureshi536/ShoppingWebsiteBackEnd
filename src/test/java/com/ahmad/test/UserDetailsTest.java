package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.UserDetailsDAO;
import com.ahmad.model.Customer;

public class UserDetailsTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		
		Customer userDetails = (Customer)context.getBean("userDetails");
		
		UserDetailsDAO userDetailsDAO =(UserDetailsDAO)context.getBean("userDetailsDAO");
		
		userDetails.setUserName("aqureshi536");
		userDetails.setPhoneNo("7208834285");
		userDetails.setGender("male");
		userDetails.setPassword("258741");
		
		userDetailsDAO.saveOrUpdate(userDetails);
	}
}
