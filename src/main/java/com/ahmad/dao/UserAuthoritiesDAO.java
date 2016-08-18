package com.ahmad.dao;

import com.ahmad.model.UserAuthorities;

public interface UserAuthoritiesDAO {
	void saveOrUpdate(UserAuthorities userAuthorities);

	void delete(String customerId);
}
