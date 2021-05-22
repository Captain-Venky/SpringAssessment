package com.model;

public class Employee {
	
	private String empId;
	private String password;
	
	public Employee(String empId, String password) {
		super();
		this.empId = empId;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", password=" + password + "]";
	}
	
	

}
