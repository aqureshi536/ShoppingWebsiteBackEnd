package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.CartDAO;
import com.ahmad.model.Cart;
import com.ahmad.model.OrderedItems;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	@Transactional
	public void delete(String cartId) {
		sessionFactory.getCurrentSession().delete(cartId);

	}

	@Transactional
	public Cart getCartByCustomerId(String customerId) {
		String hql = "from Cart where customerId=" + "'" + customerId + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> customerList = query.getResultList();
		if (customerList != null && !customerList.isEmpty())
			return customerList.get(0);

		return null;
	}

	@Transactional
	public List<Cart> listCart() {
		String hql = "from Cart";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> listOfCarts = query.getResultList();
		return listOfCarts;

	}

	@Override
	public List<OrderedItems> listOrderedItems(String customerId) {
		String hql = "from OrderedItems where customerId="+"'"+customerId+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<OrderedItems> listOfOrderedItems = query.getResultList();
		return listOfOrderedItems;
	}

	

}
