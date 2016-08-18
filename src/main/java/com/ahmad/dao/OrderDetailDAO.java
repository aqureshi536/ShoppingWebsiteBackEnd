package com.ahmad.dao;

import java.util.List;

import com.ahmad.model.OrderDetail;

public interface OrderDetailDAO {

	void saveOrUpdate(OrderDetail orderDetail);

	void delete(String orderDetailId);

	List<OrderDetail> listOrderDetails();

}
