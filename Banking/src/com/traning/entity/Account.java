package com.traning.entity;

import java.util.List;

abstract class Account {

	private Money balance;
	private InterestRate interestRate;
	private Period interestPeriod;
	public List<Statement> statement;
	public List<Customer> customer;

	/**
	 * @return the statement
	 */
	public List<Statement> getStatement() {
		return statement;
	}
	/**
	 * @param statement the statement to set
	 */
	public void setStatement(List<Statement> statement) {
		this.statement = statement;
	}
	/**
	 * @return the customer
	 */
	public List<Customer> getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	/**
	 * @return the balance
	 */
	public Money getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	/**
	 * @return the interestRate
	 */
	public InterestRate getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the interestPeriod
	 */
	public Period getInterestPeriod() {
		return interestPeriod;
	}
	/**
	 * @param interestPeriod the interestPeriod to set
	 */
	public void setInterestPeriod(Period interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	
	
}
