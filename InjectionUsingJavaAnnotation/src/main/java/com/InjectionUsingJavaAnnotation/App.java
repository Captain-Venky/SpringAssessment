package com.InjectionUsingJavaAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
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
    	ApplicationContext ctx = 
    	         new AnnotationConfigApplicationContext(MyConfig.class);
    	
    	      Register register = ctx.getBean(Register.class);
    	      Manager manager = ctx.getBean(Manager.class);
    	      Employee employee = ctx.getBean(Employee.class);
    	      Customer customer = ctx.getBean(Customer.class);
    	      Branch branch = ctx.getBean(Branch.class);
    	      Bank bank = ctx.getBean(Bank.class);
    	      bank.setRegister(register);
    	      bank.setBranch(branch);
    	      bank.setCustomer(customer);
    	      bank.setEmployee(employee);
    	      bank.setManager(manager);
    	      System.out.println(bank);
    	     

    }
}
