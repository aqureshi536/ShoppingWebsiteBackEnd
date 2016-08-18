package com.ahmad.dao;

import com.ahmad.model.Users;

public interface UsersDAO {

	void saveOrUpdate(Users users);
	
	void delete(String customerId);
}
