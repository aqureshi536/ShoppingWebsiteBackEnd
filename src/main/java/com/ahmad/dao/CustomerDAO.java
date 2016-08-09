package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Customer;

public interface CustomerDAO {

	void saveOrUpdate(Customer customer);
	
	Customer get(String customerId);
	
	List<Customer> listCustomer();
	
	Customer getCustomerByUserName(String userName);
}
