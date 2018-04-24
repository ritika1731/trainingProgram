package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.entity.Bank;

public class BankTest {
Bank bank=new Bank();
	
	@Test
	public void BankNameTest()
	{
		bank.setBankName("asd");
		assertEquals(bank.getBankName(),"asd");
		
	}
	
	@Test
	public void BranchNameTest()
	{
		bank.setBranchName("assda");
		assertEquals(bank.getBranchName(),"assda");
		
	}
}
