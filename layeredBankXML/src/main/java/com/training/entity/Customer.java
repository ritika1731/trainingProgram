package com.training.entity;

public class Customer extends Account{
	
	private String customerId;
	private String firstName;
	private String lastName;
	private float currentBalance;
	private Address address;

	private Contact contact;
	
	
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(final Address address) {
		this.address = address;
	}
	
	public Contact getContact() {
		return contact;
	}
	public void setContact( final Contact contact) {
		this.contact = contact;
	}
	
	public float getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(final float currentBalance) {
		this.currentBalance = currentBalance;
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
	public void setCustomerId(final String customerId) {
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
	public void setFirstName(final String firstName) {
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
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", currentBalance=" + currentBalance + ", address=" + address + ", contact=" + contact + "]";
	}


	public Customer(final String customerId,final  String firstName,final String lastName, final float currentBalance,final  Address address,
			final Contact contact) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentBalance = currentBalance;
		this.address = address;
		this.contact = contact;
	}

}
