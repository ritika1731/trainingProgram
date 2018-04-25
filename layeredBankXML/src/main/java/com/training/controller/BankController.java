package com.training.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Address;
import com.training.service.BankService;
import com.training.service.BankServiceImpl;

public class BankController {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
			BankService service= appContext.getBean("bankService", BankServiceImpl.class);

			while(true)
			{

				System.out.println("###################################");
				System.out.println("1.Add Customer");
				System.out.println("2.Deposit.");
				System.out.println("3.Withdraw.");
				System.out.println("4.Exit.");
				System.out.println("###################################");
				System.out.println("Select your Choice");
				
				int choice =sc.nextInt();
				if(choice<1 || choice >3)
				{
					System.out.println("Choice out of range. Try again");
					continue;
				}
				else
				{
				switch(choice)
				{
				case 1:
					Address address=new Address();
					System.out.println("CustomerId:");
					String id=sc.next();
					System.out.println("FirstName:");
					String fname=sc.next();
					System.out.println("LastName:");
					String lname=sc.next();
					System.out.println("street:");
					String street=sc.next();
					address.setStreet(street);
					
					break;
				case 2:
					
					System.out.println("Enter Balance");
					float balance=sc.nextFloat();
					System.out.println("Enter Deposit Amount");
					int depositAmount=sc.nextInt();
					service.deposit(depositAmount);
					break;
				case 3:
					
					break;
					
					
				case 4:
					System.exit(0);
					System.out.println("Thankyou");
					break;
					
				}
				}
			}
}
}
