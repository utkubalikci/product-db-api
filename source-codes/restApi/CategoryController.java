package com.utkubalikci.productDbSystem.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utkubalikci.productDbSystem.Business.ICategoryService;
import com.utkubalikci.productDbSystem.Entities.Category;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private ICategoryService categoryService;

	@Autowired
	public CategoryController(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public List<Category> get(){
		return categoryService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Category category) {
		categoryService.add(category);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Category category) {
		categoryService.update(category);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Category category) {
		categoryService.delete(category);
	}
	
	@GetMapping("/categories/{id}")
	public Category getById(@PathVariable int id){
		return categoryService.getById(id);
	}
	
}
