package com.StudentInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDaoImpl;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	StudentDaoImpl s = (StudentDaoImpl)context.getBean("dao");
    	int i = s.save(new Student(4,"Bhanu",95.0f,"A+"));
    	if(i > 0) {
    		System.out.println("inserted successfully");
    	}
    	
    }
}
