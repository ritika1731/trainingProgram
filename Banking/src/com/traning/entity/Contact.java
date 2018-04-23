package com.traning.entity;

import java.util.List;

abstract class Contact {
	private PhoneNumber phone;
	private PhoneNumber mobile;
	private Email email;
	public Address Address;
	public List<Bank> bank;

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
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		Address = address;
	}
	/**
	 * @return the phone
	 */
	public PhoneNumber getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	/**
	 * @return the mobile
	 */
	public PhoneNumber getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(PhoneNumber mobile) {
		this.mobile = mobile;
	}
	
	
	
}
