package com.training.Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Array {
	 static Scanner sc=new Scanner(System.in);
	
	public static  < E > Boolean printArray(int values) {  
		List<E> list=new ArrayList<>();

		for(int i=0;i<values;i++)
		{
			E input=(E) sc.next();
			list.add(input);
		}
		System.out.println("Output");
		for(E e:list)
		{
			System.out.println(e);
		}
		sc.close();
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter no.of elements:");
		//Scanner sc=new Scanner(System.in);
		int values=sc.nextInt();
		
		printArray(values);
	}
		

}
