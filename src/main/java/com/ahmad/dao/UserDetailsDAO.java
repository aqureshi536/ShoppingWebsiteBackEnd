package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.UserDetails;

public interface UserDetailsDAO {

	void saveOrUpdate(UserDetails userDetails);
	
	void delete(String userName);
	
	UserDetails get(String userName);
	
	List<UserDetails> listUsers();
}
