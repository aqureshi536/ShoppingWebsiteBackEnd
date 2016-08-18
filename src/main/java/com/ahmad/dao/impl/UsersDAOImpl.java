package com.ahmad.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.UsersDAO;
import com.ahmad.model.Users;

@Repository("usersDAO")
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public UsersDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void saveOrUpdate(Users users) {
		sessionFactory.getCurrentSession().save(users);

	}

	@Transactional
	public void delete(String customerId) {
		Users usersToDelete = new Users();
		usersToDelete.setUsername(customerId);

	}

}
