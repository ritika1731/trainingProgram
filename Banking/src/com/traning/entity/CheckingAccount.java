package com.traning.entity;

public class CheckingAccount implements Account{

	
	Customer customer=new Customer();
	float getbalance=customer.getInitial_Amount();
	@Override
	public void calculateInterest()
	{
	
		float interest=(getbalance*4*1)/100;
		System.out.println("Calculated Interest:"+interest);
	}
}
