package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.entity.Email;
import com.training.entity.PhoneNumber;

public class ContactTest {

	Email email=new Email();
	PhoneNumber phone=new PhoneNumber();

	@Test
	public void EmailTest()
	{
		email.setEmail("abc@gmail.com");
		assertEquals(email.getEmail(),"abc@gmail.com");
		
	}
	@Test
	public void PhoneTest()
	{
		phone.setPhone("98765");
		assertEquals(phone.getPhone(),"98765");
		
	}
	
	@Test
	public void MobileTest()
	{
		phone.setMobile("98765");
		assertEquals(phone.getMobile(),"98765");
		
	}
}
