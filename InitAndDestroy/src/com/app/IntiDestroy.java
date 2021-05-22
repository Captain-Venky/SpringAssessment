package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntiDestroy {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		  User user = (User) appContext.getBean("user");
		  System.out.println("UserDeatils "+"sno" +user.getSno() + "Name: "+user.getSname());
		  appContext.close();
	}

}
