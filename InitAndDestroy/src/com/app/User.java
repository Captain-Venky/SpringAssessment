package com.app;

public class User {
	
	private int sno;
	private String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void init()
	 {
	  System.out.println("In init block of user");
	 }
	 
	 public void destroy()
	 {
	  System.out.println("In destroy block of user");
	 }
	

}
