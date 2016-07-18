package com.ahmad.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDAO {

	
	
	public boolean loginControl(String userId, String password) {
		if (userId.equals("a@g.c" ) && password.equals("ahmad") ){
			return true;
		} else {
			return false;
		}
	}

}
