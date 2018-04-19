package com.training.Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Array {

	/*
	public static < E > void printArray(E[] values) {  
		List<E> list=new ArrayList<>();

	}*/
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		List<E> list=new ArrayList<>();

		System.out.println("Enter no.of elements:");
		Scanner sc=new Scanner(System.in);

		int values=sc.nextInt();
		//String result=printArray(values);
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
	}


}
