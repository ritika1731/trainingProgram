package com.training.Day3.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void isReverse()

	{
			ReverseString reverse = new ReverseString();
			String expectedResult = "olleh";
			String actualResult=reverse.isReverse("hello");
			assertEquals(expectedResult,actualResult);
			
			
			
		}
	
}
