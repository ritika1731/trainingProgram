package com.training.entity;

public class Contact extends Address{
	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", mobile=" + mobile + ", email=" + email + "]";
	}
	private String phone;
	private String mobile;
	private String email;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(final String mobile) {
		this.mobile = mobile;
	}
	public Contact() {
		super();
	}
	public Contact(final String phone,final  String mobile, final String email) {
		super();
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
}
