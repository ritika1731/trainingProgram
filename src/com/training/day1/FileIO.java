package com.training.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FileIO {
	private final static Logger logger = Logger.getLogger(DateTime.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();

		try {
			//System.out.println("enter file name");
			logger.info("enter file name");
			final Scanner sc=new Scanner(System.in);
			System.out.flush();
			final String  filename=sc.nextLine();
			final File inputfile=new File(filename);
			final Scanner input=new Scanner(inputfile);
			final File outputfile=new File("newFile.txt");
			final PrintWriter writer=new PrintWriter(outputfile);
			String output="";
			while(input.hasNextLine())
			{
				output = input.nextLine();
				writer.println(output);
			}
			input.close();

			writer.close(); 
		}catch(FileNotFoundException e)
		{
			//System.out.println("No file");
			logger.info("No file");
			//e.printStackTrace();
		}
	}
}

