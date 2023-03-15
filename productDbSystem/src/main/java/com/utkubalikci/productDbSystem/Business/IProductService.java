package com.utkubalikci.productDbSystem.Business;

import java.util.List;

import com.utkubalikci.productDbSystem.Entities.Product;

public interface IProductService {
	List<Product> getAll();
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int id);
}
