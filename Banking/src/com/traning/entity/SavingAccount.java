package com.traning.entity;

public class SavingAccount implements Account{
	


	private Money money;
	private InterestRate interestRate;
	private Period interestPeriod;

	public int deposit(int depositAmmount)
	{
		
		return money.getMoney()+depositAmmount;
	}
	public int withdrawl(int withdrawlAmmount)
	{
		return money.getMoney()-withdrawlAmmount;
	}
	
	public int getBalance()
	{
		Scanner sc=new Scanner(System.in);
		int interest=sc.nextInt();
		interestRate.setInterestRate(interest);
		return interestRate.getInterestRate()*money.getMoney()*interestPeriod.getPeriod()/100;
	}
}
