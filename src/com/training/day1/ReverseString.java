package com.training.day1;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ReverseString {
	private final static Logger logger = Logger.getLogger(Duplicates.class.getName());
	public static String isReverse(String value) {
		//StringBuilderinitialized to the contents of the specified string.
		String reverse="";
		for (String part : value.split(" ")) {
		   // System.out.print(new StringBuilder(part).reverse().toString());
		   reverse=new StringBuilder(part).reverse().toString();
		//System.out.print(value);
			//logger.info(" ");
		    System.out.print(reverse);

		}
		return reverse;
		    
	}

	public static void main(String args[]) {
		
		BasicConfigurator.configure();
		String value;
		//System.out.println("Enter the String: ");
		logger.info("Enter the String: ");
		final Scanner sc=new Scanner(System.in);
		//Captured input would be stored in value
		 value=sc.nextLine();
		
		//System.out.println("Reverse String is: ");
		logger.info("Reverse String is: ");
		String result=isReverse(value);

		 
		
	}
}
