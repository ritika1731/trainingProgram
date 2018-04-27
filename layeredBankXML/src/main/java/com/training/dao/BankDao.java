package com.training.dao;


import java.util.Map;

import com.training.entity.Customer;

public interface BankDao {

	public Map<String,Customer> addCustomer(Customer customer);
	public float deposit(int depositAmount);
	public float withdraw(int withdrawAmount);
	public float getBalance();
	public int listCustomerId(String customerId);
	public void updateDetails(Customer cust,int mobile);
}
