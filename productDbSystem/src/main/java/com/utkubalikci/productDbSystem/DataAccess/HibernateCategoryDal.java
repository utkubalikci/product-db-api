package com.utkubalikci.productDbSystem.DataAccess;
import java.util.List;

import jakarta.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.utkubalikci.productDbSystem.Entities.Category;

@Repository
public class HibernateCategoryDal implements ICategoryDal{
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCategoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Category> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Category> products = session.createQuery("from Category",Category.class).getResultList();
		return products;
	}

	@Override
	public void add(Category category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	public void update(Category category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	public void delete(Category category) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
	}

	@Override
	public Category getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Category category = session.get(Category.class, id);
		return category;
	}
}
