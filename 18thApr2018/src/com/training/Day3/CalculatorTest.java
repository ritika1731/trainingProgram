package com.training.Day3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	public void testPower()
	{
		int base = 2, power = 4;
		
		int expectedResult = 16;
		int actualResult = (int) calculator.MyCalculator(base, power);
	
		assertEquals(expectedResult, actualResult);
	}
	

	@Test(expected=CalculatorException.class)
	public void testPower1()
	{
		int base = -2, power = 4;
		
		int expectedResult = 16;
		int actualResult = (int) calculator.MyCalculator(base, power);
	
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(expected=CalculatorException.class)
	public void testPower2()
	{
		int base = 2, power = -4;
		
		int expectedResult = 16;
		int actualResult = (int) calculator.MyCalculator(base, power);
	
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(expected=CalculatorException.class)
	public void testPower3()
	{
		int base = 0, power = 0;
		
		int expectedResult = 16;
		int actualResult = (int) calculator.MyCalculator(base, power);
	
		assertEquals(expectedResult, actualResult);
	}
	
	
}
