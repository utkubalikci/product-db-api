package com.utkubalikci.productDbSystem.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Category() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
