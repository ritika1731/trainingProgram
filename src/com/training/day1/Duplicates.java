package com.training.day1;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Duplicates {
	private final static Logger logger = Logger.getLogger(Duplicates.class.getName());

	 public static void main(String[] args)
	 {
		BasicConfigurator.configure();

		 //System.out.println("Enter String:");
		 logger.info("Enter String:");
		final Scanner sc=new Scanner(System.in);
		final String value=sc.nextLine();
		 char [] arr=value.toCharArray();
		 
		 int count=0;
		 int length= value.length();
		 
		 for (int i = 0; i < length-1; i++)
		 {
			 
			  for (int j = i + 1; j < length; j++) 
			   {
			  
				  if(arr[i]==arr[j])
				  	{
				   count++;
				  	}
			   }
		 }
			if(count>0)
			{
			 // System.out.println("true");
				 logger.info("true");

			}
			else
			  {
				  //System.out.println("false");
					 logger.info("true");

			  }
	 }
}

