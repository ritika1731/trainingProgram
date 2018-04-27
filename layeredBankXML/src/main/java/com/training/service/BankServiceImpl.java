package com.training.service;

import java.util.Map;

import com.training.dao.BankDao;
import com.training.dao.BankDaoImpl;
import com.training.entity.Customer;

public class BankServiceImpl implements BankService{

	public BankDao dao=new BankDaoImpl();

	@Override
	public float deposit(final int depositAmount) {
		// TODO Auto-generated method stub
		return dao.deposit(depositAmount);
	}

	@Override
	public float withdraw(final int withdrawAmount) {
		// TODO Auto-generated method stub
		return dao.withdraw(withdrawAmount);
	}


	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return dao.getBalance();
	}

	@Override
	public Map<String, Customer> addCustomer(final Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public int listCustomerId(final String customerId) {
		// TODO Auto-generated method stub
		return dao.listCustomerId(customerId);
	}

}
