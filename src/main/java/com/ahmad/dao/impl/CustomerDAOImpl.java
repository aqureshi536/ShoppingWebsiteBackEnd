package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.CustomerDAO;
import com.ahmad.model.Customer;
@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public CustomerDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		
	}

	@Transactional
	public Customer get(String customerId) {
		return sessionFactory.getCurrentSession().get(Customer.class,customerId);
		
	}

	@Override
	public List<Customer> listCustomer() {
		String hql = "from Customer";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		List<Customer> listOfCustomers = query.getResultList();
		return listOfCustomers;
	}

}
