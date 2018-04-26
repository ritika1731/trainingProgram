package com.training.service;

import java.util.Map;

import com.training.entity.Customer;

public interface BankService {
	public Map<String,Customer> addCustomer(Customer customer) ;
	public float deposit(int depositAmount);
	public float withdraw(int withdrawAmount);
	public float getBalance();
	public int listCustomerId(String customerId);
}
