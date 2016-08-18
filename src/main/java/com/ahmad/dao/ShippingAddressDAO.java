package com.ahmad.dao;

import com.ahmad.model.ShippingAddress;

public interface ShippingAddressDAO {

	void saveOrUpdate(ShippingAddress shippingAddress);
	
	void deleteShippingAddress(String shippingAddressId);
	
	ShippingAddress getShippingAddress(String shippingAddressId);
}
