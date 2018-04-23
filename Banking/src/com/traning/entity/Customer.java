package com.traning.entity;

import java.util.List;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	public List<Contact> contact;
	public List<Bank> bank;
	public List<Account> account;
	private float initial_Amount=1000;
	private String accountType;

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the initial_Amount
	 */
	public float getInitial_Amount() {
		return initial_Amount;
	}
	/**
	 * @param initial_Amount the initial_Amount to set
	 */
	public void setInitial_Amount(float initial_Amount) {
		this.initial_Amount = initial_Amount;
	}
	/**
	 * @return the contact
	 */
	public List<Contact> getContact() {
		return contact;
	}
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param contact
	 * @param bank
	 * @param account
	 * @param initial_Amount
	 */
	
	/**
	 * @param contact the contact to set
	 */
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	/**
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param contact
	 * @param bank
	 * @param account
	 * @param initial_Amount
	 * @param accountType
	 */
	public Customer(String customerId, String firstName, String lastName, List<Contact> contact, List<Bank> bank,
			List<Account> account, float initial_Amount, String accountType) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.bank = bank;
		this.account = account;
		this.initial_Amount = initial_Amount;
		this.accountType = accountType;
	}
	/**
	 * @return the bank
	 */
	public List<Bank> getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	/**
	 * @return the account
	 */
	public List<Account> getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	



}
