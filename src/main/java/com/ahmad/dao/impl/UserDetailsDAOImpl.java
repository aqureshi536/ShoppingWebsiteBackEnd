package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.UserDetailsDAO;
import com.ahmad.model.Customer;

@Repository("userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDetailsDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Customer userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}

	@Transactional
	public void delete(String userName) {
		Customer userDetailsToDelete = new Customer();
		userDetailsToDelete.setUserName(userName);
		sessionFactory.getCurrentSession().delete(userDetailsToDelete);

	}

	@Transactional
	public Customer get(String userName) {
		sessionFactory.getCurrentSession().get(Customer.class, userName);
		return null;
	}

	@Transactional
	public List<Customer> listUsers() {
		List<Customer> listUsers = sessionFactory.getCurrentSession().createCriteria(Customer.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUsers;
	}

}
