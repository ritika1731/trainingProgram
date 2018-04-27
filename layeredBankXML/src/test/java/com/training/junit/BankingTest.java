package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.dao.BankDao;
import com.training.dao.BankDaoImpl;

public class BankingTest {
	BankDao account = new BankDaoImpl();
	@Test
	public void bankSave() {
		
		float balance=1500;
		float interestRate=2;
		float interestPeriod=3;
		
		int expected=1100;
		int actualResult = (int) account.deposit(100);
		assertEquals(expected, actualResult);

		
	}
	@Test
	public void bankSave1() {
	
/*
		final float balance=1000;
		final float interestRate=2;
		final float interestPeriod=5;
		*/
		final int expected=1100;
		final int actualResult = (int) account.withdraw(100);
		assertEquals(expected, actualResult);

		
		
	}
	
}
