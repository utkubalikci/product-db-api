package com.utkubalikci.productDbSystem.Business;

import java.util.List;

import com.utkubalikci.productDbSystem.Entities.Category;

public interface ICategoryService {
	List<Category> getAll();
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	Category getById(int id);
}
