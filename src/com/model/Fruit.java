package com.model;

public class Fruit {

	private String fruitName;
	private String fruitCategory;
	
	public Fruit(String fruitName, String fruitCategory) {
		super();
		this.fruitName = fruitName;
		this.fruitCategory = fruitCategory;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitCategory() {
		return fruitCategory;
	}

	public void setFruitCategory(String fruitCategory) {
		this.fruitCategory = fruitCategory;
	}
	
}
