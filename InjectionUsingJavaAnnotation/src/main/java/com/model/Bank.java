package com.model;

public class Bank {
	
	private Manager manager;
	
	private Customer customer;
	
	private Employee employee;
	
	private Register register;
	
	private Branch branch;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager getManager() {
		return manager;
	}



	public void setManager(Manager manager) {
		this.manager = manager;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public Register getRegister() {
		return register;
	}



	public void setRegister(Register register) {
		this.register = register;
	}



	public Branch getBranch() {
		return branch;
	}



	public void setBranch(Branch branch) {
		this.branch = branch;
	}



	@Override
	public String toString() {
		return "Bank [manager=" + manager + ", customer=" + customer + ", employee=" + employee + ", register="
				+ register + ", branch=" + branch + "]";
	}


	
	
	
	
	

}
