package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Bank;
import com.model.Branch;
import com.model.Customer;
import com.model.Employee;
import com.model.Manager;
import com.model.Register;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Register register = (Register)context.getBean("register");
    	register.setName("Venky");
    	register.setMobileNo("6535312148");
    	register.setDeposit(2500.0f);
    	register.setCity("Vijayawada");
    	Employee employee = (Employee)context.getBean("employee");
    	employee.setEmpId("123465");
    	employee.setPassword("emp133");
    	Branch branch = (Branch)context.getBean("branch");
    	branch.setBranchcode(1234);
    	branch.setArea("PipuleRoad");
    	branch.setCity("Vijayawada");
    	branch.setPincode(500008);
    	Customer customer = (Customer)context.getBean("custom");
    	customer.setName("Venky");
    	customer.setAccountNo("5131511321");
    	customer.setBalance(25000.0f);
    	Manager manager = (Manager)context.getBean("manager");
    	manager.setManagerId("1645451");
    	manager.setPassword("manager123");
    	Bank b = (Bank)context.getBean("bank");
    	b.setBranch(branch);
    	b.setCustomer(customer);
    	b.setEmployee(employee);
    	b.setManager(manager);
    	b.setRegister(register);
    	System.out.println(b);
    }
}
