package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Customer;

public interface UserDetailsDAO {

	void saveOrUpdate(Customer userDetails);
	
	void delete(String userName);
	
	Customer get(String userName);
	
	List<Customer> listUsers();
}
