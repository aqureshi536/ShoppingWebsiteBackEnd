package com.ahmad.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.CardDetailDAO;
import com.ahmad.model.CardDetail;

public class CardDetailDAOImpl implements CardDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CardDetailDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(CardDetail cardDetail) {
	sessionFactory.getCurrentSession().saveOrUpdate(cardDetail);

	}

}
