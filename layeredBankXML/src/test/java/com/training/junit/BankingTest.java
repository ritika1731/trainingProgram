package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.dao.BankDao;
import com.training.dao.BankDaoImpl;

public class BankingTest {
	BankDao account = new BankDaoImpl();
	@Test
	public void BankSave() {
		
		float balance=1500;
		float interestRate=2;
		float interestPeriod=3;
		
		int expected=1100;
		int actualResult = (int) account.deposit(100);
		assertEquals(expected, actualResult);

		
	}
	@Test
	public void BankSave1() {
	

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account.withdraw(100);
		assertEquals(expected, actualResult);

		
	}
	
}
