package com.model;

public class Manager {
	
	private String managerId;
	private String password;
	
	public Manager(String managerId, String password) {
		super();
		this.managerId = managerId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", password=" + password + "]";
	}
	
	

}
