package com.training.controller;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.BankDao;
import com.training.entity.Customer;
import com.training.service.BankService;
import com.training.service.BankServiceImpl;

public class BankController {
	final private static Scanner sc=new Scanner(System.in);
	private static Logger logger = Logger.getLogger(BankController.class.getName());
	public static void main(final String[] args) {
		BasicConfigurator.configure();

		//final Contact contact = new Contact();
		final ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		final BankService service= appContext.getBean("bankService", BankServiceImpl.class);
		
		final Customer customer = (Customer) appContext.getBean("Customer");
		//Customer customer1 = (Customer) appContext.getBean("Customer1");
		logger.info("Customer Id: "+customer.getCustomerId());
		logger.info("Customer Name: "+customer.getFirstName()+" "+customer.getLastName());
		logger.info("Current Balance= " +(customer.getCurrentBalance()) );
		logger.info("Balance after Withdrawl of 100 = " +(customer.getCurrentBalance()-100) );
		logger.info("Balance after Deposit of 300 = " +((customer.getCurrentBalance()-100)+300) );
		logger.info("Statement="+service.addCustomer(customer));
		logger.info(service.listCustomerId(customer.getCustomerId()));
		
		
		logger.info("Enter Balance to deposit:");
//		float balanceDeposit=sc.nextFloat();
		logger.info("Enter Deposit Amount"); 
		final int depositAmount=sc.nextInt();

		final float balanceAmount=service.getBalance();
		final float deposit=service.deposit(depositAmount);
		logger.info(balanceAmount);
		logger.info(deposit);
		
		logger.info("Enter Balance to deposit:");
//		float balanceDeposit=sc.nextFloat();
		logger.info("Enter withdraw Amount");
		final int withdrawAmount=sc.nextInt();

		final float balanceAmount1=service.getBalance();
		final float withdraw=service.withdraw(withdrawAmount);
		logger.info(balanceAmount1);
		logger.info(withdraw);
		
	//service.deposit(customer.getCustomerId(),customer.getCustomerId(),400);


		/*List<Customer> list=new ArrayList<Customer>();
			String id;
			while(true)
			{

				logger.info("###################################");
				logger.info("1.Add Customer");
				logger.info("2.Deposit.");
				logger.info("3.Withdraw.");
				logger.info("4.Statement");
				logger.info("5.Exit.");
				logger.info("###################################");
				logger.info("Select your Choice");

				int choice =sc.nextInt();
				if(choice<1 || choice >3)
				{
					logger.info("Choice out of range. Try again");
					continue;
				}
				else
				{
				switch(choice)

				{
				case 1:
					Customer customer=new Customer();
					Address address=new Address();
					logger.info("CustomerId:");
					 id=sc.next();
					customer.setCustomerId(id);
					logger.info("FirstName:");
					String fname=sc.next();
					customer.setFirstName(fname);
					logger.info("LastName:");
					String lname=sc.next();
					customer.setLastName(lname);
//					logger.info("Street:");
//					String street=sc.next();
					Customer cust=new Customer(id,fname,lname,address);

					list.add(cust);
					service.addCustomer();
					//logger.info(service.addCustomer());

					break;
				case 2:
					//logger.info("CurrentBalance:"+balance);
//					logger.info("Enter Balance to deposit:");
//					float balanceDeposit=sc.nextFloat();
					logger.info("Enter Deposit Amount");
					int depositAmount=sc.nextInt();

					float balanceAmount=service.getBalance();
					float deposit=service.deposit(depositAmount);
					logger.info(balanceAmount);
					logger.info(deposit);
					break;
				case 3:
//					logger.info("Enter Balance to deposit:");
//					float balanceDeposit=sc.nextFloat();
					logger.info("Enter withdraw Amount");
					int withdrawAmount=sc.nextInt();

					float balanceAmount1=service.getBalance();
					float withdraw=service.withdraw(withdrawAmount);
					logger.info(balanceAmount1);
					logger.info(withdraw);
					break;

				case 4:
					logger.info("Statement");
					logger.info("Enter Customer id:");
					id=sc.next();
					break;

				case 5:
					System.exit(0);
					logger.info("Thankyou");
					break; 

				}
				}
			}*/
	}
}
