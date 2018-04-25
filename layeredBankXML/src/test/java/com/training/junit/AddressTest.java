package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.entity.Address;

public class AddressTest {
Address address=new Address();
	
	@Test
	public void CityTest()
	{
		address.setCity("Delhi");
		assertEquals(address.getCity(),"Delhi");
		
	}
	
	@Test
	public void StreetTest()
	{
		address.setStreet("CP");
		assertEquals(address.getStreet(),"CP");
		
	}
	@Test
	public void HouseTest()
	{
		address.setHouseNumber("117");
		assertEquals(address.getHouseNumber(),"117");
		
	}
	@Test
	public void ZipCodeTest()
	{
		address.setZipCode("110088");
		assertEquals(address.getZipCode(),"110088");
		
	}
}
