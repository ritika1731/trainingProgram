package com.training.service;

import java.util.List;

import com.training.entity.Customer;

public interface BankService {
	public List<Customer> addCustomer();
	public float deposit(int depositAmount);
	public float withdraw(int withdrawAmount);
	public float getBalance();
}
