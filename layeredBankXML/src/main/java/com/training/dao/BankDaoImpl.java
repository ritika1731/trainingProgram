package com.training.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

import com.training.entity.Account;
import com.training.entity.Contact;
import com.training.entity.Customer;

public class BankDaoImpl implements BankDao{
public final static Logger logger = Logger.getLogger(BankDaoImpl.class.getName());
	Customer customer=new Customer();
	Account account=new Account();
	Scanner sc=new Scanner(System.in);
	Map<String,Customer> map=new HashMap<String, Customer>();
	
	
	/*public BankDaoImpl(Account account, Scanner sc, Map<String, Customer> map) {
		super();
		this.account = account;
		this.sc = sc;
		this.map = map;
	}*/

	public Map<String, Customer> getMap() {
		
		return map;
	}
	
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
		logger.info("Enter interestRate:");
		final int interest=sc.nextInt();
		account.setInterestRate(interest);
		logger.info("Enter interestPeriod:");
		final int interestPeriod=sc.nextInt();
		account.setInterestPeriod(interestPeriod);
		logger.info("Enter balance:");
		final int balance=sc.nextInt();
		account.setBalance(balance);
		return account.getInterestRate()*account.getBalance()*account.getInterestPeriod()/100;

	}

	@Override
	public int listCustomerId(final String customerId) {
		if (map.containsKey(customerId)) {
			final Customer customerDetails = map.get(customerId);
			//Contact contact=new Contact();
			logger.info(customerDetails.getFirstName()+" " +customerDetails.getLastName());
			logger.info("Current balance is: "+customerDetails.getCurrentBalance());
		} else {
			logger.info("No such user");
		}
		return 0;
	}
	
	@Override
	public void updateDetails(Customer cust,int mobile) {

		Contact contact=cust.getContact();
		contact.setMobile("123132");
	}

}
