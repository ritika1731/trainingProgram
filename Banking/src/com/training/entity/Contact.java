package com.training.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface  Contact {
	List <PhoneNumber> mobile=new ArrayList<PhoneNumber>();
	List <PhoneNumber> phone=new ArrayList<PhoneNumber>();
	List <Email> email=new ArrayList<Email>();
	
	Bank bank=new Bank();
	Scanner sc=new Scanner(System.in);
	
	public static void display() {
		System.out.println("Enter phone number");
		String pn = sc.next();
		addPhone(pn);
	}
	
	public static void addPhone(String phoneNum) {
		PhoneNumber phoneNo=new PhoneNumber();
		phoneNo.setPhone(phoneNum);
		phone.add(phoneNo);
	}
	
	public static void addMobile(String mobileNum) {
		PhoneNumber mobileNo=new PhoneNumber();
		System.out.println("Enter mobile address");
		mobileNum = sc.next();
		mobileNo.setPhone(sc.next());
		mobile.add(mobileNo);
	}

	public static void addEmail() {
		Email mail=new Email();
		System.out.println("Enter email address");
		mail.setEmail(sc.next());
		email.add(mail);
	}
	
	public static List<PhoneNumber> getMobile() {
		return mobile;
	}
	public static List<PhoneNumber> getPhone() {
		return phone;
	}
	public static List<Email> getEmail() {
		return email;
	}
	
	
}
