package com.training.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("enter file name");
		Scanner sc=new Scanner(System.in);
		File file=new File(sc.nextLine());
		sc=new Scanner(file); 
		
		while(sc.hasNextLine()) {
			String i=sc.nextLine();
				System.out.println(i);
			}
			sc.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("No files");
			//e.printStackTrace();
		}
	}
}

