package com.training.Day3.JUnit;

import java.util.Scanner;

public class ReverseString {
		
	public static void main(String args[]) {
		
		
		String value;
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		//Captured input would be stored in value
		 value=sc.nextLine();
		
		System.out.println("Reverse String is: ");
		
		//StringBuilderinitialized to the contents of the specified string.
		 for (String part : value.split(" ")) {
			    System.out.print(new StringBuilder(part).reverse().toString());
			    System.out.print(" ");
			}	    
			    
		
	}
}
