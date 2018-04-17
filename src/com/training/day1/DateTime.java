package com.training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateTime {
	public static void main(String args[]) throws java.text.ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Date and time dd-MMM-yyyy HH:mm:ss: ");
		String date = sc.next();
		System.out.println("Enter the Second Date and time dd-MMM-yyyy HH:mm:ss: ");
		String date1=sc.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date date2=null;
		Date date3=null;
		long difference=0;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse(date);
		    date3 = dateFormat.parse(date1);
		    difference=date3.getTime()-date2.getTime();
		    
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(difference);
		
	}
}
