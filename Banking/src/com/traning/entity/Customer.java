package com.traning.entity;

import java.util.List;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	public List<Contact> contact;
	public List<Bank> bank;
	public List<Account> account;


	/**
	 * @return the contact
	 */
	public List<Contact> getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(List<Contact> contact) {
		this.contact = contact;
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
