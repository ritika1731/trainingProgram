package com.training.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.training.dao.BankDaoImpl;

import com.training.entity.Address;
import com.training.entity.Contact;
import com.training.entity.Customer;
import com.training.service.BankService;
import com.training.service.BankServiceImpl;

/**
 * @author trainee
 *
 */
public class TestClass {

	final BankService service = new BankServiceImpl();
	final Contact contact = new Contact("234324", "56767", "abc@gmail.com");
	final Address address = new Address("asd", "13", "asd", "delhi");
	final Customer customer = new Customer("1","ritika", "verma", 2000,address,contact);
	final BankDaoImpl bank = new BankDaoImpl();
//	@Test
//	public void bankTest() {
//	
//		final Map<String, Customer> map = bank.getMap();
//		service.addCustomer(customer);
//		assertEquals(0, map.size());
//	
//		
//	}
//
//		
//		@Test
//		public void bankWithdraw()
//		{
//			//System.out.println(customer.getCurrentBalance());
//			service.withdraw(200);
//			assertTrue(service.withdraw(200)==1800);
//			
//		}
//		
//		@Test
//		public void bankDeposit()
//		{
//			
//			//System.out.println(customer.getCurrentBalance());
//			float a=service.deposit(200);
//			System.out.println(a);
//			assertTrue(service.getBalance()==2200);
//			//assertTrue(service.getBalance()==1800);
//		}
//
//		@Test
//		public void bankWithdraw1()
//		{
//			//System.out.println(customer.getCurrentBalance());
//			service.withdraw(200);
//			assertFalse(service.getBalance()==1200);
//			
//		}
		
		@Test
		public void bankDeposit1()
		{
			//float deposit=100;
			//service.deposit(100);
			assertFalse((service.deposit(100))==2000);
			//assertTrue(service.getBalance()==1800);
		}
	
}
