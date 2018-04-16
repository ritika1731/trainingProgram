package com.training.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		//for taking input from user 
		Scanner sc=new Scanner(System.in);
		int number,num;
		try {
				//Captured input would be stored in number
				number = sc.nextInt();
				num = number;
				int reverse=0,remainder;
				
				//reversing number
				
				while(number>0)
				{
					remainder=number%10;
					reverse=reverse*10+remainder;
					number=number/10;
				}
				if(reverse==num)
				{
					System.out.println("Number is Palindrome");
				}
				else
				{
					System.out.println("Number is not palindrome");
				}
			
			} 
		
		catch (InputMismatchException e) {
			System.out.println("Numbers only");
			
		}
		
	}
}
