package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.traning.entity.Address;
import com.traning.entity.Customer;

public class BankController {

	static Logger log = Logger.getLogger("controller logger");
	
	 
	static Scanner sc = new Scanner(System.in);
	static Customer cust = new Customer();
	static List<Customer> customer = new ArrayList<Customer>();

	static void application() {
		// TODO Auto-generated method stub
		System.out.println("Enter mobile number");
		String mobile = sc.next();

	}

	static void accountSelect() {
		String account;
		System.out.println("Select account type\n");
		System.out.println("1-Savings Account");
		System.out.println("2-Flexible Savings Account");
		System.out.println("3-Checking Account");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			
			account = "SavingAccount";
			cust.setAccountType(account);
			break;

		case 2:
			
			account = "FlexibleSavingAccount";
			cust.setAccountType(account);
			break;
		case 3:
		
			account = "CheckingAccount";
			cust.setAccountType(account);
			break;
		}
	}

	static void display() {
		for (Customer bean : customer) {
			System.out.println("First Name:" + bean.getFirstName());
			System.out.println("Last Name:" + bean.getLastName());
			System.out.println("Initial Amount:" + bean.getInitial_Amount());
			System.out.println("Mobile Number:" + bean.getMobileNumber());
			System.out.println("Phone Number:" + ((Contact) bean).getPhoneNumber());
			System.out.println("Email:" + bean.getEmail());
			System.out.println("Account Type Is:" + bean.getAccount_type());

		}
	}

	static void customerdetails() {
		System.out.println("Welcome!Happy To Help You");
		System.out.println("-------------------------------------------------------");
		System.out.println("Hi.Please Enter Customer Id");
		String id = sc.next();
		customerobject.setCustomer_id(id);
		System.out.println("Please Enter Your First Name");
		String frsname = sc.next();
		customerobject.setFirstname(frsname);
		System.out.println("Please Enter Your Sur Name");
		String surname = sc.next();
		customerobject.setSurname(surname);
		System.out.println("Please Enter Your Mobile Number");
		String mobilenumber = sc.next();
		customerobject.setMobileNumber(mobilenumber);
		System.out.println("Please Enter Your Phone Number");
		String phonenumber = sc.next();
		customerobject.setMobileNumber(phonenumber);
		System.out.println("Please Enter The Email");
		String email = sc.next();
		customerobject.setEmail(email);
		System.out.println("Thank You!");
		System.out.println("---------------------------------------");
		System.out.println("Please Enter Your Street");
		String street = sc.next();
		customerobject.setStreet(street);
		System.out.println("Please Enter Your House Number");
		String housenumber = sc.next();
		customerobject.setHouseNumber(housenumber);
		System.out.println("Please Enter Your Zipcode");
		String zipcode = sc.next();
		customerobject.setZipCode(zipcode);
		System.out.println("Please Enter Your City");
		String city = sc.next();
		customerobject.setCity(city);
	}

	static void transactions() {
		System.out.println("Ready For First Transaction");
		System.out.println("Please Enter Customer's Id");
		String find_id = sc.next();

		int count = 0;
		for (final CustomerAddress entity : liststick) {
			if (entity.getCustomer_id().equalsIgnoreCase(find_id)) {
				count = 1;
			}
		}
		if (count != 0) {

			log.info("User Found");
			System.out.println("Enter Amount");
			float entered_Amount = sc.nextFloat();
			float updated_balance = customerobject.getInitial_Amount() - entered_Amount;
			customerobject.setInitial_Amount(updated_balance);
			System.out.println("Please Enter Remarks For The Transaction");
			String remarks = sc.next();
		} else {
			log.info("No user found");
		}

	}

	public static void main(String args[]) {
		
		System.out.println("Welcome To Capgemini India Global Bank");
		System.out.println("============================================");
		System.out.println("Happy To Help You");
		System.out.println("1-New User");
		System.out.println("2-Existing User Login");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			customerdetails();
			accountchoice();
			liststick.add(customerobject);
			display();
			transactions();
			if(customerobject.getAccount_type().equals("SavingAccount"))
			{
				Account account=new SavingAccount();
			account.calculateInterest();
			}
			else if(customerobject.getAccount_type().equals("FlexibleSavingAccount"))
			{
				Account account=new FlexibleSavingAccount();
			account.calculateInterest();
			}
			else
			{Account account=new CheckingAccount();
			account.calculateInterest();
				
			}
			display();
			
			break;
		case 2:
			application();
			break;

		}

	}
}
