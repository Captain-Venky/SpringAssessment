package com.model;

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
	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
