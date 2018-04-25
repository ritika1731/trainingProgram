package com.training.service;

import java.util.List;

import com.training.dao.BankDao;
import com.training.dao.BankDaoImpl;
import com.training.entity.Customer;

public class BankServiceImpl implements BankService{

	BankDao dao=new BankDaoImpl();

	@Override
	public float deposit(int depositAmount) {
		// TODO Auto-generated method stub
		return dao.deposit(depositAmount);
	}

	@Override
	public float withdraw(int withdrawAmount) {
		// TODO Auto-generated method stub
		return dao.withdraw(withdrawAmount);
	}

	@Override
	public List<Customer> addCustomer() {
		// TODO Auto-generated method stub
		return dao.addCustomer();
	}

	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return dao.getBalance();
	}

}
