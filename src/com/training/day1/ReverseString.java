package com.training.day1;

import java.util.Scanner;

public class ReverseString {
		
	public static void main(String args[]) {
		
		int length;
		String reverse="";
		String value;
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		//Captured input would be stored in value
		 value=sc.nextLine();
		
		
		length=value.length();
		/*
		for(int i=length-1;i>=0;i--)
		{
			//charAt will return character at specified index
			reverse=reverse+value.charAt(i);
		}*/
		System.out.println("Reverse String is: "+reverse);
		//StringBuilder is inbuilt reverse method
		 for (String part : value.split(" ")) {
			    System.out.print(new StringBuilder(part).reverse().toString());
			    System.out.print(" ");
			}	    
			    
		
	}
}
