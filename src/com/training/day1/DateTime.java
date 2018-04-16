package com.training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateTime {
	public static void main(String args[]) throws java.text.ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date ");

		String date = sc.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2=null;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse(date);
		    
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		System.out.println(date2);
		
	}
}
