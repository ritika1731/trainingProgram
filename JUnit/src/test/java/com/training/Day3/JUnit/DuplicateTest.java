package com.training.Day3.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateTest {

	@Test
	public void isDuplicate()

	{
			Duplicates test = new Duplicates();
			assertEquals("false", test.isDuplicate("apple"), "true");
			assertEquals("true", test.isDuplicate("star"), "true");
		}
	}
	
