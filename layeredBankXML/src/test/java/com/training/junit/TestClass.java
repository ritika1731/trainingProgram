package com.training.junit;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.training.dao.BankDaoImpl;

import com.training.entity.Address;
import com.training.entity.Contact;
import com.training.entity.Customer;
import com.training.service.BankService;
import com.training.service.BankServiceImpl;

public class TestClass {

	
	@Test
	public void bankTest() {
		
		final BankService iserv = new BankServiceImpl();
		final Contact contact = new Contact("234324", "56767", "abc@gmail.com");
		final Address address = new Address("asd", "13", "asd", "delhi");
		final Customer customer = new Customer("1","ritika", "verma", 2000,address,contact);
		

		final BankDaoImpl bank = new BankDaoImpl();
		final Map<String, Customer> map = bank.getMap();
		assertEquals(0, map.size());
		
		iserv.addCustomer(customer);
		
		assertEquals(1, map.size());

		iserv.listCustomerId(customer.getCustomerId());
		assertEquals(0, 0);
		
		
		
	}
}
