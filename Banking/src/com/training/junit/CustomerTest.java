package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.entity.Customer;

public class CustomerTest {

Customer cust=new Customer();
	
	@Test
	public void FNameTest()
	{
		cust.setFirstName("ritika");
		assertEquals(cust.getFirstName(),"ritika");
		
	}
	@Test
	public void LNameTest()
	{
		cust.setFirstName("verma");
		assertEquals(cust.getFirstName(),"verma");
		
	}
	@Test
	public void IDTest()
	{
		cust.setCustomerId("1");
		assertEquals(cust.getCustomerId(),"1");
		
	}
}
