package com.model;

public class Admin {
	
	private String empid;
	private String password;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Admin [empid=" + empid + ", password=" + password + "]";
	}
	

}
