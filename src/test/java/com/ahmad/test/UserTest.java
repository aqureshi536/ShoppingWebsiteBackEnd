package com.ahmad.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmad.dao.UserLoginDAO;
import com.ahmad.model.UserLogin;

public class UserTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ahmad");
		context.refresh();

		UserLoginDAO userLoginDAO = (UserLoginDAO) context.getBean("userLoginDAO");

		UserLogin userLogin = (UserLogin) context.getBean("userLogin");
		userLogin.setUserId("003");
		userLogin.setUsername("ahmadsaa");
		userLogin.setEnabled(true);
		userLogin.setPassword("quareshidd");

		// test case for insert or updating user

		userLoginDAO.saveOrUpdate(userLogin);

		// Test case for get user

		if (userLoginDAO.get("003") != null) {
			System.out.println("USer Exist");
		} else {
			System.out.println("User doesnt Exist");
		}

		// Test case for delete user

		//userLoginDAO.delete("002");
		
		
	}

}
