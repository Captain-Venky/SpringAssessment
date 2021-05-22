package com.model;

public class Employee {
	
	private String empId;
	private String password;
	
	public Employee(String empId, String password) {
		super();
		this.empId = empId;
		this.password = password;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", password=" + password + "]";
	}
	
	

}
