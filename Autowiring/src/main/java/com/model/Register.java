package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Register {
	
	
	private String name;
	
	private String mobileNo;
	
	private float deposit;

	private String city;
	
	

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Register(String name, String mobileNo, float deposit, String city) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.deposit = deposit;
		this.city = city;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public float getDeposit() {
		return deposit;
	}



	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Register [name=" + name + ", mobileNo=" + mobileNo + ", deposit=" + deposit + ", city=" + city + "]";
	}

}
