package com.traning.entity;

public class FlexibleSavingAccount implements Account {

	Customer customerobject=new Customer();
	float getbalance=customerobject.getInitial_Amount();
	@Override
	public void calculateInterest() {

		float interest=(getbalance*6*1)/100;
		System.out.println("Calculated Interest Is :"+interest);
	}
	
	
}
