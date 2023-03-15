package com.utkubalikci.productDbSystem.DataAccess;

import java.util.List;

import com.utkubalikci.productDbSystem.Entities.Category;

public interface ICategoryDal {
	List<Category> getAll();
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	Category getById(int id);
}
