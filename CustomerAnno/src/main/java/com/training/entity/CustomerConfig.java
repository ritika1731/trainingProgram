package com.training.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	
	   @Bean 
	   public Customer cust(){
	      return new Customer();
	   }
}
