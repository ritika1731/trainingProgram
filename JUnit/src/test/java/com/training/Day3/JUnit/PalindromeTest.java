package com.training.Day3.JUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	
	
	@Test
    public void nullValue() {
        assertFalse(PalindromeTest.isPalindrome(null));
    }

    @Test
    public void emptyValue() {
        assertTrue(PalindromeTest.isPalindrome(""));
    }

    @Test
    public void oneValue() {
        assertTrue(PalindromeTest.isPalindrome("1"));
    }

    @Test
    public void twoValue() {
        assertTrue(PalindromeTest.isPalindrome("11"));
    }

    @Test
    public void twoValues() {
        assertFalse(PalindromeTest.isPalindrome("12"));
    }

    @Test
    public void palindrome() {
        assertTrue(PalindromeTest.isPalindrome("121"));
    }

public static boolean isPalindrome(String value) {
    if (value == null) {
        return false;
    } else if (value.length() < 2) {
        return true;
    } else {
        if (!value.endsWith(value.substring(0, 1))) {
            return false;
        }
        return isPalindrome(value.substring(1, value.length() - 1));
    }
}
}
