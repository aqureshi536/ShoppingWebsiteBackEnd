package com.ahmad.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ahmad.model.UserLogin;


public interface UserLoginDAO {
	void saveOrUpdate(UserLogin userLogin);

	void delete(String id);

	UserLogin get(String id);

	public List<UserLogin> list();

}
