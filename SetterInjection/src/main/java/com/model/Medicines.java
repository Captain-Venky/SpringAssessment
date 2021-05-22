package com.model;

public class Medicines {
	
	private String name;
	private int quantity;
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Medicines [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	

}
