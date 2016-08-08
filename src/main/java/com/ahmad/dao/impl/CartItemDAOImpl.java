package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmad.dao.CartItemDAO;
import com.ahmad.model.CartItem;

@Repository("cartItemDAO")
public class CartItemDAOImpl implements CartItemDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CartItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveOrUpdate(CartItem cartItem) {
		sessionFactory.getCurrentSession().saveOrUpdate(cartItem);

	}

	@Override
	public void delete(String cartItemId) {
		sessionFactory.getCurrentSession().delete(cartItemId);
	}

	@Override
	public List<CartItem> getCartItemsByCustomerId(String customerId) {
		String hql = "from CartItem where customerId=" + "'" + customerId + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<CartItem> listOfCartItems = query.getResultList();
		return listOfCartItems;
	}

}
