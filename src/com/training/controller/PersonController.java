package com.training.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.training.bean.PhoneBean;

public class PersonController {



	public static void main(String args[])
	{
		ArrayList<PhoneBean> phone  = new ArrayList<PhoneBean>();	

		while(true)
		{

			System.out.println("###################################");
			System.out.println("1. Add a Person.");
			System.out.println("2. View details of All Person.");
			System.out.println("3. Search a Person.");
			System.out.println("4. Remove a Person.");
			System.out.println("5. Exit");
			System.out.println("###################################");
			System.out.println("Enter a choice please: ");
			System.out.println("###################################");
			
			Scanner sc=new Scanner(System.in);
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
				System.out.println("Enter Id");
				String id=sc.next();
				phonebook.setPersonId(id);

				System.out.println("Enter FirstName");
				String firstName=sc.next();
				phonebook.setFirstName(firstName);
				System.out.println("Enter LastName");
				String lastName=	sc.next();
				phonebook.setLastName(lastName);
				System.out.println("Enter Mobile Number ");
				String mobileNumber=sc.next();
				phonebook.setMobileNumber(mobileNumber);
				System.out.println("Details Added Succesfully");
				phone.add(phonebook);
				break;

			case 2:
				System.out.println(" View details of All Person.");

				for(PhoneBean bean:phone)
				{
					System.out.println("Id"+ " "+bean.getPersonId());
					System.out.println("First Name"+ " "+bean.getFirstName());
					System.out.println("Last Name"+" " +bean.getLastName());
					System.out.println("Mobile Number"+" "+bean.getMobileNumber());
				}

				break;
			case 3:
				System.out.println("Enter Mobile  Number to search:");
				String search=sc.next();
				int count=0;

				for(PhoneBean bean:phone)
				{
					if(bean.getMobileNumber().equals(search))
					{
						count=1;
						
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
				
				System.out.println("Enter Mobile  Number to remove:");
				String search1=sc.next();
				int count1=-1;

				for(PhoneBean bean:phone)
				{
					if(bean.getMobileNumber().equalsIgnoreCase(search1))
					{
						
						count1=phone.indexOf(bean);
						
					}
		

				}
				phone.remove(count1);
		break;
				
			case 5:
				System.exit(0);
				System.out.println("Thank You!!");
				break;
			}
		}
	}

	}


}


