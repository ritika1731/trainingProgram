package com.training.entity;

public class Account extends Statement {
	private float balance;
	private float interestRate;
	private float interestPeriod;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance( final float balance) {
		this.balance = balance;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(final float interestRate) {
		this.interestRate = interestRate;
	}
	public float getInterestPeriod() {
		return interestPeriod;
	}
	public void setInterestPeriod(final float interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
}
