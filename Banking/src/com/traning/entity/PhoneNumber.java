package com.traning.entity;

public class PhoneNumber {

	private String phone;
	private String mobile;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", mobile=" + mobile + "]";
	}
	
}
