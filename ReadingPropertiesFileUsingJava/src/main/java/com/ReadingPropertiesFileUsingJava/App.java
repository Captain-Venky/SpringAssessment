package com.ReadingPropertiesFileUsingJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.DatabaseDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new AnnotationConfigApplicationContext(MyConfiguration.class);
    	 DatabaseDetails dbConfig = ( DatabaseDetails) context.getBean("db");
    	System.out.println(dbConfig.toString());
    }
}
