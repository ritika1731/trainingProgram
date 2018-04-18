package com.training.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.training.bean.PhoneBean;

public class PersonController {


//	static void view()
//	{
//		System.out.println("Enter The Choice");
//		System.out.println("============================");
//		System.out.println("1  Add  Person");
//		System.out.println("2  View all Person");
//		System.out.println("3  Search by MobileNumber");
//		System.out.println("4  Delete Person");
//		System.out.println("5  Exit");
//		System.out.println("============================");
//	}

	public static void main(String args[])
	{
		ArrayList<PhoneBean> phone  = new ArrayList<PhoneBean>();	

		Scanner sc=new Scanner(System.in);

		while(true)
		{

			System.out.println("###################################");
			System.out.println("1. Add a Person.");
			System.out.println("2. View details of given Person.");
			System.out.println("3. Search a Person.");
			System.out.println("4. Remove a Person.");
			System.out.println("5. Exit");
			System.out.println("###################################");
			System.out.println("Enter a choice please: ");
			System.out.println("###################################");
			//view();
			int choice =sc.nextInt();
			if(choice<1 || choice >5)
			{
				System.out.println("Choice out of range. Try again");
				continue;
			}
			else
			{
			switch(choice)
			{
			case 1:
				PhoneBean phonebook=new PhoneBean();
				System.out.println("Enter FirstName");
				String firstName=sc.next();
				phonebook.setFirstName(firstName);
				System.out.println("Enter LastName");
				String lastName=	sc.next();
				phonebook.setLastName(lastName);
				System.out.println("Enter Mobile Number ");
				String mobileNumber=sc.next();
				phonebook.setMobileNumber(mobileNumber);
				System.out.println("Details Added Succesfully:" + phonebook.getFirstName()+" "+phonebook.getLastName()+" "+" has the number "+phonebook.getMobileNumber());
				phone.add(phonebook);

				System.out.println(phone.size());
				break;

			case 2:

				for(PhoneBean bean:phone)
				{
					System.out.println(bean);
					System.out.println("First Name"+ " "+bean.getFirstName());
					System.out.println("Last Name"+" " +bean.getLastName());
					System.out.println("Mobile Number"+" "+bean.getMobileNumber());
				}

				break;
			case 3:
				System.out.println("Enter Mobile  Number to search:");
				PhoneBean phonebook1=new PhoneBean();
				String search=sc.next();
				int count=0;



				for(PhoneBean bean:phone)
				{
					if(bean.getMobileNumber().equals(search))
					{count=1;
						
					}
				}
				if (count!=0)
				{
					System.out.println("Person Found");
				}
				else
				{
					System.out.println("No Person found");
				}



				break;
				
			case 4:
				
				
				break;
				
			case 5:
				System.exit(0);
				break;
			}
		}
			System.out.println("Thank You!!");
	}

	}


}


