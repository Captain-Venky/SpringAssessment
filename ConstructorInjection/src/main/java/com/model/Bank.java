package com.model;

public class Bank {
	
	private Manager manager;
	
	private Customer customer;
	
	private Employee employee;
	
	private Register register;
	
	private Branch branch;

	public Bank(Manager manager, Customer customer, Employee employee, Register register, Branch branch) {
		super();
		this.manager = manager;
		this.customer = customer;
		this.employee = employee;
		this.register = register;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Bank [manager=" + manager + ", customer=" + customer + ", employee=" + employee + ", register="
				+ register + ", branch=" + branch + "]";
	}


	
	
	
	
	

}
