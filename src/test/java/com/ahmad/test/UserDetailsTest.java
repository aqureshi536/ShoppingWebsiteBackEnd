package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.UserDetailsDAO;
import com.ahmad.model.UserDetails;

public class UserDetailsTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();
		
		UserDetails userDetails = (UserDetails)context.getBean("userDetails");
		
		UserDetailsDAO userDetailsDAO =(UserDetailsDAO)context.getBean("userDetailsDAO");
		userDetails.setUserId("user1");
		userDetails.setUserName("aqureshi536");
		userDetails.setPhoneNo("7208834285");
		userDetails.setGender("male");
		userDetails.setPassword("258741");
		
		userDetailsDAO.saveOrUpdate(userDetails);
	}
}
