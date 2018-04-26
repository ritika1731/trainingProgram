package com.training.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Contact;
import com.training.entity.Customer;
import com.training.service.BankService;
import com.training.service.BankServiceImpl;

public class BankController {
	final static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {


		Contact contact = new Contact();
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		BankService service= appContext.getBean("bankService", BankServiceImpl.class);
		Customer customer = (Customer) appContext.getBean("Customer");
		//Customer customer1 = (Customer) appContext.getBean("Customer1");
		System.out.println("Customer Id: "+customer.getCustomerId());
		System.out.println("Customer Name: "+customer.getFirstName()+" "+customer.getLastName());
		System.out.println("Current Balance= " +(customer.getCurrentBalance()) );
		System.out.println("Balance after Withdrawl of 100 = " +(customer.getCurrentBalance()-100) );
		System.out.println("Balance after Deposit of 300 = " +((customer.getCurrentBalance()-100)+300) );
		System.out.println("Statement="+service.addCustomer(customer));
		System.out.println(	service.listCustomerId(customer.getCustomerId()));
		
		
		System.out.println("Enter Balance to deposit:");
//		float balanceDeposit=sc.nextFloat();
		System.out.println("Enter Deposit Amount");
		int depositAmount=sc.nextInt();

		float balanceAmount=service.getBalance();
		float deposit=service.deposit(depositAmount);
		System.out.println(balanceAmount);
		System.out.println(deposit);
		
		System.out.println("Enter Balance to deposit:");
//		float balanceDeposit=sc.nextFloat();
		System.out.println("Enter withdraw Amount");
		int withdrawAmount=sc.nextInt();

		float balanceAmount1=service.getBalance();
		float withdraw=service.withdraw(withdrawAmount);
		System.out.println(balanceAmount1);
		System.out.println(withdraw);
		
	//service.deposit(customer.getCustomerId(),customer.getCustomerId(),400);


		/*List<Customer> list=new ArrayList<Customer>();
			String id;
			while(true)
			{

				System.out.println("###################################");
				System.out.println("1.Add Customer");
				System.out.println("2.Deposit.");
				System.out.println("3.Withdraw.");
				System.out.println("4.Statement");
				System.out.println("5.Exit.");
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
					Customer customer=new Customer();
					Address address=new Address();
					System.out.println("CustomerId:");
					 id=sc.next();
					customer.setCustomerId(id);
					System.out.println("FirstName:");
					String fname=sc.next();
					customer.setFirstName(fname);
					System.out.println("LastName:");
					String lname=sc.next();
					customer.setLastName(lname);
//					System.out.println("Street:");
//					String street=sc.next();
					Customer cust=new Customer(id,fname,lname,address);

					list.add(cust);
					service.addCustomer();
					//System.out.println(service.addCustomer());

					break;
				case 2:
					//System.out.println("CurrentBalance:"+balance);
//					System.out.println("Enter Balance to deposit:");
//					float balanceDeposit=sc.nextFloat();
					System.out.println("Enter Deposit Amount");
					int depositAmount=sc.nextInt();

					float balanceAmount=service.getBalance();
					float deposit=service.deposit(depositAmount);
					System.out.println(balanceAmount);
					System.out.println(deposit);
					break;
				case 3:
//					System.out.println("Enter Balance to deposit:");
//					float balanceDeposit=sc.nextFloat();
					System.out.println("Enter withdraw Amount");
					int withdrawAmount=sc.nextInt();

					float balanceAmount1=service.getBalance();
					float withdraw=service.withdraw(withdrawAmount);
					System.out.println(balanceAmount1);
					System.out.println(withdraw);
					break;

				case 4:
					System.out.println("Statement");
					System.out.println("Enter Customer id:");
					id=sc.next();
					break;

				case 5:
					System.exit(0);
					System.out.println("Thankyou");
					break; 

				}
				}
			}*/
	}
}
