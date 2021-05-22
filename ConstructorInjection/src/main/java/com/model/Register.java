package com.model;

public class Register {
	
	private String name;
	private String mobileNo;
	private float deposit;
	private String city;
	
	

	public Register(String name, String mobileNo, float deposit, String city) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.deposit = deposit;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Register [name=" + name + ", mobileNo=" + mobileNo + ", deposit=" + deposit + ", city=" + city + "]";
	}

}
