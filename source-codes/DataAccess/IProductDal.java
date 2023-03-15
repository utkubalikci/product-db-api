package com.utkubalikci.productDbSystem.DataAccess;

import java.util.List;

import com.utkubalikci.productDbSystem.Entities.Product;


public interface IProductDal {
	List<Product> getAll();
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int id);
}
