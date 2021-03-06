package com.training.entity;

import java.util.Scanner;

public class SavingAccount implements Account{
	


	private Money money;
	private InterestRate interestRate;
	private Period interestPeriod;

	public float deposit(int depositAmount)
	{
		
		return money.getBalance()+depositAmount;
	}
	public float withdraw(int withdrawAmount)
	{
		return money.getBalance()-withdrawAmount;
	}
	
	public float getBalance()
	{
		Scanner sc=new Scanner(System.in);
		int interest=sc.nextInt();
		interestRate.setInterestRate(interest);
		return interestRate.getInterestRate()*money.getBalance()*interestPeriod.getInterestPeriod()/100;
	}
}
