package com.training.day2;

import java.util.Scanner;

public class ReorganizeString {
	public static void main(String args[]) {
		char temp;
		String str="";
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char [] arr=input.toCharArray();
		int count=0;
		int length=input.length();
		
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				//System.out.println(input);
				break;

			}
		}
		for(int i=1;i<length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				continue;
			}
			else {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				str=String.valueOf(arr);
			}
			//System.out.println(count);
		}
		try {
			if(count!=3)
			{
				for(int j=0;j<length-1;j++) {
					if(str.charAt(j)==str.charAt(j+1))
					{
						System.out.println("null");
						break;
					}
					else
					{
						System.out.println("output:"+str);
						break;
					}
				}
			}
			else 
				{
					System.out.println(str);
				}
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("null");
		}
		
	}

}

