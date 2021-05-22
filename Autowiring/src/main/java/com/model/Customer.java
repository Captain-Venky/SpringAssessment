package com.model;

import org.springframework.stereotype.Component;

public class Customer {
	
	private String accountNo;
	private String name;
	private float balance;
	public Customer(String accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
