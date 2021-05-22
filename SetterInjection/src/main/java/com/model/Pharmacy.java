package com.model;

public class Pharmacy {
	
	private Admin admin;
	private User user;
	private Medicines medicine;
	private Branch branch;
	private Tests test;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Medicines getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicines medicine) {
		this.medicine = medicine;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Tests getTest() {
		return test;
	}
	public void setTest(Tests test) {
		this.test = test;
	}
	@Override
	public String toString() {
		return "Pharmacy [admin=" + admin + ", user=" + user + ", medicine=" + medicine + ", branch=" + branch
				+ ", test=" + test + "]";
	}
	
	

}
