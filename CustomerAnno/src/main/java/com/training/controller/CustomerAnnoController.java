package com.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.entity.Customer;
import com.training.entity.CustomerConfig;

public class CustomerAnnoController {
	
	   public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(CustomerConfig.class);
	   
	      Customer cust = ctx.getBean(Customer.class);
	      cust.setFirstName("ritika");
	      System.out.println(cust.getFirstName());
	   }
}
