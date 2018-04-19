package com.training.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * @param args
 */
public class Palindrome {
	
	private final static Logger logger = Logger.getLogger(Palindrome.class.getName());
public static int isPalindrome(int number)
{
	int num;
	try {
			//Captured input would be stored in number
			num = number;
			int reverse=0;
			int remainder;
			
			//reversing number
			
			while(number>0)
			{
				remainder=number%10;
				reverse=reverse*10+remainder;
				number=number/10;
			}
			if(reverse==num)
			{
				//System.out.println("Number is Palindrome");
				logger.info("Number is Palindrome");
				return 1;

			}
			else
			{
				//System.out.println("Number is not palindrome");
				logger.info("Number is not palindrome");
				return 0;

			}
		
		} 
	
	catch (InputMismatchException e) {
		//System.out.println("Numbers only");
		logger.info("Number only");
		return 1;

	}
}
	public static void main(String args[])
	{
		BasicConfigurator.configure();

		//System.out.println("Enter number:");
		logger.info("Enter number:");
		//for taking input from user 
		final Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		final int result = isPalindrome(number);

		
		
	}
}
