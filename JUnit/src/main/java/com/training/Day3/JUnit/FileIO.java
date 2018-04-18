package com.training.Day3.JUnit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter file name");
			Scanner sc=new Scanner(System.in);
			System.out.flush();
			String  filename=sc.nextLine();
			File inputfile=new File(filename);
			Scanner input=new Scanner(inputfile);
			File outputfile=new File("newFile.txt");
			PrintWriter writer=new PrintWriter(outputfile);
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
			System.out.println("No file");
			//e.printStackTrace();
		}
	}
}

