package com.model;

public class Branch {
	
	private int branchcode;
	private String area;
	private String city;
	private int pincode;
	
	public Branch(int branchcode,  String area, String city, int pincode) {
		super();
		this.branchcode = branchcode;
		
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBranchcode() {
		return branchcode;
	}


	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Branch [branchcode=" + branchcode +  ", area=" + area + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	

}
