package com.utkubalikci.productDbSystem.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkubalikci.productDbSystem.DataAccess.ICategoryDal;
import com.utkubalikci.productDbSystem.Entities.Category;

@Service
public class CategoryManager implements ICategoryService {

	private ICategoryDal categoryDal;
	
	@Autowired
	public CategoryManager(ICategoryDal categoryDal) {
		this.categoryDal = categoryDal;
	}

	@Override
	@Transactional
	public List<Category> getAll() {
		return this.categoryDal.getAll();
	}

	@Override
	@Transactional
	public void add(Category category) {
		this.categoryDal.add(category);
		
	}

	@Override
	@Transactional
	public void update(Category category) {
		this.categoryDal.update(category);
		
	}

	@Override
	@Transactional
	public void delete(Category category) {
		this.categoryDal.delete(category);
		
	}

	@Override
	@Transactional
	public Category getById(int id) {
		return this.categoryDal.getById(id);
	}

}
