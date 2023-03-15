package com.utkubalikci.productDbSystem.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utkubalikci.productDbSystem.Business.IProductService;
import com.utkubalikci.productDbSystem.Entities.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	private IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public List<Product> get(){
		return productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Product product) {
		productService.add(product);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Product product) {
		productService.update(product);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Product product) {
		productService.delete(product);
	}
	
	@GetMapping("/products/{id}")
	public Product getById(@PathVariable int id){
		return productService.getById(id);
	}
	
}
