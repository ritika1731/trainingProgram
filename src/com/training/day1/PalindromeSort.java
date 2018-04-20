package com.training.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeSort {


	public static void checkPalindrome(String s)
	{

		String reverse = new StringBuffer(s).reverse().toString();


		if (s.equals(reverse))
		{  

			List<String> myList = new ArrayList<String>();
			myList.add(reverse);
			Collections.sort(myList, Collections.reverseOrder());


			for(String str: myList){
				System.out.println(str);
			}


		}

	}


	public static void main(String[] args)
	{


		checkPalindrome("121");
		checkPalindrome("111");



	}

}


