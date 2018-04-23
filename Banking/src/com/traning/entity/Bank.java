package com.traning.entity;

import java.util.List;

public class Bank {

	private String bankName;
	private String branchName;
	public List<Contact> contact;

	/**
	 * @param bankName
	 * @param branchName
	 * @param contact
	 */
	public Bank(String bankName, String branchName, List<Contact> contact) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.contact = contact;
	}
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
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	

	
}
