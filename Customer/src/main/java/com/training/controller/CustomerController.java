package com.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.training.entity.Customer;

public class CustomerController {
	
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		      
		      Customer cust = (Customer) context.getBean("entity");
		      Customer cust1= (Customer) context.getBean("entity2");
		      
		      System.out.println(cust.getFirstName());
		      System.out.println(cust1.getLastName());
	}
	
}
