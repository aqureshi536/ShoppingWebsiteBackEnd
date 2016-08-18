package com.ahmad.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.UserAuthoritiesDAO;
import com.ahmad.model.UserAuthorities;

@Repository("userAuthoritiesDAO")
public class UserAuthoritiesDAOImpl implements UserAuthoritiesDAO {

	@Autowired
	SessionFactory sessionFactory;

	public UserAuthoritiesDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(UserAuthorities userAuthorities) {
		sessionFactory.getCurrentSession().saveOrUpdate(userAuthorities);
	}

	@Transactional
	public void delete(String customerId) {
		UserAuthorities userAuthoritiesToDelete = new UserAuthorities();
		userAuthoritiesToDelete.setCustomerId(customerId);
		sessionFactory.getCurrentSession().delete(userAuthoritiesToDelete);
	}

}
