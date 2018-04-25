package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.entity.Contact;


public class ContactTest {
Contact contact=new Contact();

	@Test
	public void EmailTest()
	{
		contact.setEmail("abc@gmail.com");
		assertEquals(contact.getEmail(),"abc@gmail.com");
		
	}
	@Test
	public void PhoneTest()
	{
		contact.setPhone("98765");
		assertEquals(contact.getPhone(),"98765");
		
	}
	
	@Test
	public void MobileTest()
	{
		contact.setMobile("98765");
		assertEquals(contact.getMobile(),"98765");
		
	}
}
