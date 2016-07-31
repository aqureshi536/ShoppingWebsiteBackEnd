package com.ahmad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.model.Category;
import com.ahmad.model.Product;

@Repository(value="categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}

	@Transactional
	public void delete(String id) {
		Category categoryToDelete = new Category();
		categoryToDelete.setCategoryId(id);
		sessionFactory.getCurrentSession().delete(categoryToDelete);

	}

	@Transactional
	public Category get(String id) {

		// sessionFactory.getCurrentSession().get(Category.class,id);
		String hql = "from Category where categoryId=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> listCategory = query.getResultList();
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}

		return null;

	}

	@Transactional
	public List<Category> listCategory() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}
	
	@Transactional
	public List<Product> selectedCategoryProductList(String id)
	{
		String hql="from Product where categoryId=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listSelectedProducts = query.getResultList();
		return listSelectedProducts; 
		
	
	}
	
	@Transactional
	public int getProductCountByCategory(String id)
	{
		String hql="from Product where categoryId=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listSelectedProducts = query.getResultList();
		return listSelectedProducts.size(); 
		
	
	}	
	

	
}
