package com.ReadingPropetiesFile;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.DatabaseDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	DatabaseDetails database = (DatabaseDetails) context.getBean("database");
    	System.out.println(database.toString());
    }
}
