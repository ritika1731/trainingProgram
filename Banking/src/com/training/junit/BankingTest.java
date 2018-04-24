package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.controller.BankController;
import com.training.entity.CheckingAccount;
import com.training.entity.FlexibleSavingAccount;
import com.training.entity.SavingAccount;

public class BankingTest {

	@Test
	public void BankSave() {
		SavingAccount account = new SavingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account.deposit(100);
		assertEquals(expected, actualResult);

		
	}
	@Test
	public void BankSave1() {
		SavingAccount account = new SavingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account.withdraw(100);
		assertEquals(expected, actualResult);

		
	}
	
	@Test
	public void BankFlexible() {
		FlexibleSavingAccount account1 = new FlexibleSavingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account1.deposit(100);
		assertEquals(expected, actualResult);

	}

	@Test
	public void BankFlexible1() {
		FlexibleSavingAccount account1 = new FlexibleSavingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account1.withdraw(100);
		assertEquals(expected, actualResult);

	}
	@Test
	public void BankChecking() {
		CheckingAccount account2 = new CheckingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account2.deposit(100);
		assertEquals(expected, actualResult);

	}
	@Test
	public void BankChecking1() {
		CheckingAccount account2 = new CheckingAccount();

		float balance=1000;
		float interestRate=2;
		float interestPeriod=5;
		
		int expected=1100;
		int actualResult = (int) account2.withdraw(100);
		assertEquals(expected, actualResult);

	}
}
