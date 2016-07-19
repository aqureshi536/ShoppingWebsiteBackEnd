package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.Supplier;

public interface SupplierDAO {

	void saveOrUpdate(Supplier supplier);

	void delete(String id);

	Supplier get(String id);
	
	public List<Supplier> listSupplier();
}
