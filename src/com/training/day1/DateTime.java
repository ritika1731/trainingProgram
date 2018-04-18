package com.training.day1;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class DateTime {
	private final static Logger logger = Logger.getLogger(DateTime.class.getName());

	public static void main(String args[]) throws java.text.ParseException {
		BasicConfigurator.configure();

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Date and time dd-MMM-yyyy HH:mm:ss: ");
		String date = sc.next();
		System.out.println("Enter the Second Date and time dd-MMM-yyyy HH:mm:ss: ");
		String date1=sc.next();*/
		
		final String date="31-JAN-2018 08:18:18";
		String date1="01-FEB-2018 09:18:18";

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date date2=null;
		Date date3=null;
		//long difference=0;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse(date);
		    date3 = dateFormat.parse(date1);
		    
		    final long difference=date3.getTime()-date2.getTime();
		    long diffSeconds = difference / 1000 % 60;
			long diffMinutes = difference / (60 * 1000) % 60;
			long diffHours = difference / (60 * 60 * 1000) % 24;
			long diffDays = difference / (24 * 60 * 60 * 1000);
			System.out.println(date2);
			System.out.println(date3);
			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    //e.printStackTrace();
			 logger.error("Your description here", e); 
		}
		
		
		
	}
}
