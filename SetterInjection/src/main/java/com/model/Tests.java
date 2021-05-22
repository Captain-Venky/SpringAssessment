package com.model;

public class Tests {
	
	private String testName;
	private float price;
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Tests [testName=" + testName + ", price=" + price + "]";
	}
	
	

}
