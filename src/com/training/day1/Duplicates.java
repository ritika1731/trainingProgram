package com.training.day1;

import java.util.Scanner;

public class Duplicates {
	 public static void main(String[] args)
	 {
		 System.out.println("Enter String:");
		 Scanner sc=new Scanner(System.in);
		 String value=sc.nextLine();
		 char [] arr=value.toCharArray();
		 
		 int count=0;
		 int length=value.length();
		 
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
			  System.out.println("true");
			}
			else
			  {
				  System.out.println("false");
			  }
	 }
}

