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

	@Override
	public String toString() {
		return "Branch [branchcode=" + branchcode +  ", area=" + area + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	

}
