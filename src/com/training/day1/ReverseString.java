package com.training.day1;

import java.util.Scanner;

public class ReverseString {
		
	public static void main(String args[]) {
		
		
		String value;
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		//Captured input would be stored in value
		 value=sc.nextLine();
		
		System.out.println("Reverse String is: ");
		
		//StringBuilder is inbuilt reverse method
		 for (String part : value.split(" ")) {
			    System.out.print(new StringBuilder(part).reverse().toString());
			    System.out.print(" ");
			}	    
			    
		
	}
}