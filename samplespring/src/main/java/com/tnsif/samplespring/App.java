package com.tnsif.samplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Customer c = var.getBean("customer",Customer.class);
    	System.out.println(c);
    	
    }
}