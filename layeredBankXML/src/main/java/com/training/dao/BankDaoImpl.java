package com.training.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import org.apache.log4j.Logger;

import com.training.entity.Account;

import com.training.entity.Customer;

public class BankDaoImpl implements BankDao{
//public final static Logger logger = Logger.getLogger(BankDaoImpl.class.getName());

	Account account=new Account();
	Scanner sc=new Scanner(System.in);
	Map<String,Customer> map=new HashMap<String, Customer>();
	@Override
	public float deposit(final int depositAmount) {
		return account.getBalance()+depositAmount;
	}

	@Override
	public float withdraw(final int withdrawAmount) {
		// TODO Auto-generated method stub
		return account.getBalance()-withdrawAmount;
	}

	@Override
	public Map<String,Customer> addCustomer(final Customer customer) {

		map.put(customer.getCustomerId(), customer);
		return map;

	}

	@Override
	public float getBalance() {
		System.out.println("Enter interestRate:");
		final int interest=sc.nextInt();
		account.setInterestRate(interest);
		System.out.println("Enter interestPeriod:");
		final int interestPeriod=sc.nextInt();
		account.setInterestPeriod(interestPeriod);
		System.out.println("Enter balance:");
		final int balance=sc.nextInt();
		account.setBalance(balance);
		return account.getInterestRate()*account.getBalance()*account.getInterestPeriod()/100;

	}

	@Override
	public int listCustomerId(final String customerId) {
		if (map.containsKey(customerId)) {
			final Customer customerDetails = map.get(customerId);
			//Contact contact=new Contact();
			System.out.println(customerDetails.getFirstName()+" " +customerDetails.getLastName());
			System.out.println("Current balance is: "+customerDetails.getCurrentBalance());
		} else {
			System.out.println("No such user");
		}
		return 0;
	}



}
