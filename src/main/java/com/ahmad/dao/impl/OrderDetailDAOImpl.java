package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.OrderDetailDAO;
import com.ahmad.model.OrderDetail;

@Repository("orderDetailDAO")
public class OrderDetailDAOImpl implements OrderDetailDAO {

	@Autowired
	SessionFactory sessionFactory;

	public OrderDetailDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(OrderDetail orderDetail) {
		sessionFactory.getCurrentSession().saveOrUpdate(orderDetail);

	}

	@Transactional
	public void delete(String orderDetailId) {
		OrderDetail orderDetailTodelete = new OrderDetail();
		orderDetailTodelete.setOrderDetailId(orderDetailId);

	}

	@Transactional
	public List<OrderDetail> listOrderDetails() {
		String hql="from OrderDetail";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<OrderDetail> listOfOrderDetails = query.getResultList();
		return listOfOrderDetails;
	}

}
