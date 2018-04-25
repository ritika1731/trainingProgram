package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.entity.Account;
import com.training.entity.Customer;

public class BankDaoImpl implements BankDao{
Account account=new Account();
Scanner sc=new Scanner(System.in);

	@Override
	public float deposit(int depositAmount) {
		return account.getBalance()+depositAmount;
	}

	@Override
	public float withdraw(int withdrawAmount) {
		// TODO Auto-generated method stub
		return account.getBalance()-withdrawAmount;
	}

	@Override
	public List<Customer> addCustomer() {
		List<Customer> list=new ArrayList<Customer>();
		return list;
		
	}

	@Override
	public float getBalance() {
		int interest=sc.nextInt();
		account.setInterestRate(interest);
		return account.getInterestRate()*account.getBalance()*account.getInterestPeriod()/100;
		
	}

}
