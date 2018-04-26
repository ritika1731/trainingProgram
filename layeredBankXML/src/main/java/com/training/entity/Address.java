package com.training.entity;

public class Address {

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zipCode=" + zipCode + ", city=" + city
				+ "]";
	}

	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;
	
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param street
	 * @param houseNumber
	 * @param zipCode
	 * @param city
	 * @param contact
	 */

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}	
	
}
