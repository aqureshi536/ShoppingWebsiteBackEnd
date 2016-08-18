package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.OrderedItems;

public interface OrderedItemsDAO {

	void saveOrUpdate(OrderedItems orderedItems );
	
	void delete(String orderedItemId);
	
	List<OrderedItems> listOrderedItems();
}
