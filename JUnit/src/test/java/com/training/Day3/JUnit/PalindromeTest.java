package com.training.Day3.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	
	
	@Test
    public  void isPalindrome() {
		Palindrome palindrome=new Palindrome();
       
		assertEquals("true", Palindrome.isPalindrome(121),1);
		assertEquals("false", Palindrome.isPalindrome(12),0);
		assertEquals("false", Palindrome.isPalindrome(1),1);



    }

}
