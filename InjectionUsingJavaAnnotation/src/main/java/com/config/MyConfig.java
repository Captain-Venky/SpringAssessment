package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Bank;
import com.model.Branch;
import com.model.Customer;
import com.model.Employee;
import com.model.Manager;
import com.model.Register;

@Configuration
public class MyConfig {
	
	@Bean
	public Register register() {
		return new Register("Venky","6451115445",2500.0f,"hyderabad");
	}
	
	@Bean
	public Customer customer() {
		return new Customer("4531352121","Venky",250000.0f);
	}
	
	@Bean
	public Manager manager() {
		return new Manager("20226","manager123");
	}
	
	@Bean
	public Employee employee() {
		return new Employee("123456","employee123");
	}
	
	@Bean
	public Branch branch() {
		return new Branch(4723,"raidurgam","hyderabad",500008);
	}
	
	@Bean
	public Bank bank() {
		return new Bank();
	}

}
