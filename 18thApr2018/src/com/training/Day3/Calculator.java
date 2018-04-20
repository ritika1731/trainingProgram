package com.training.Day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

		static double MyCalculator(int base, int power) throws CalculatorException
		{
			double answer=0;
			
			if(base<0 || power<0)
			{
				throw new CalculatorException("base and power should be non-negative");
			}
			
			else if(base==0 && power==0)
			{
				throw new CalculatorException("base and power should not be zero");
			}
			
			else
			{

				answer=Math.pow(base, power);
				System.out.println(answer);
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter base:");
		Scanner sc = new Scanner(System.in);
		int base=sc.nextInt();
		System.out.println("Enter Power:");
		int power=sc.nextInt();

		try 
		{
			MyCalculator(base, power);
		} 
		catch (InputMismatchException e) {
			System.out.println(" base or power should be integers only");
		}
		
		sc.close();
	}
	
}
