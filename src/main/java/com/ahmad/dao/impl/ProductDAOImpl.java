package com.ahmad.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.dao.ProductDAO;
import com.ahmad.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	@Transactional
	public void delete(String id) {
		Product productToDelete = new Product();
		productToDelete.setProductId(id);
		sessionFactory.getCurrentSession().delete(productToDelete);
	}

	@Transactional
	public Product get(String id) {

		return sessionFactory.getCurrentSession().get(Product.class, id);
		// String hql = "from Product where productId=" + "'" + id + "'";
		// Query query = sessionFactory.getCurrentSession().createQuery(hql);
		// List<Product> listProducts = query.getResultList();
		// return listProducts.get(0);
	}

	@Transactional
	public List<Product> listProduct() {
		List<Product> listProducts = sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listProducts;
	}

	@Transactional
	public List<Product> listProductByStock() {
		String hql = "from Product where isOutOffStock=" + "'" + false + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listOfProductsByStock = query.getResultList();
		return listOfProductsByStock;
	}

	@Transactional
	public List<Product> similarProducts(String productId) {
		Product product = get(productId);

		String hql = "from Product where productId!=" + "'" + productId + "'" + "and" + " categoryId=" + "'"
				+ product.getCategoryId() + "'" + "and supplierId!=" + "'" + product.getSupplierId() + "'"
				+ "and isOutOffStock=" + "'" + false + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> similarProductList = query.getResultList();
		return similarProductList;

	}

	@Transactional
	public List<Product> searchProduct(String keyword) {
		String hql = "from Product p where lower(p.productName) like lower('%" + keyword + "%') and isOutOffStock="
				+ "'" + false + "'";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listOfSearchedProducts = query.getResultList();
		return listOfSearchedProducts;
	}

	@Transactional
	public List<Product> searchProductAdmin(String keyword) {
		String hql = "from Product p where lower(p.productName) like lower('%" + keyword + "%')";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listOfSearchedProducts = query.getResultList();
		return listOfSearchedProducts;
	}
	

}
