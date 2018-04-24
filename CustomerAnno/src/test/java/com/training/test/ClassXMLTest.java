package com.training.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class ClassXMLTest {
@Autowired
	  ApplicationContext applicationContext;
	 
	    @Test
	    public void testContext() {
	        assertNotNull(applicationContext.getBean("entity"));
	    }
	    
	    @Test
	    public void testContext1() {
	        assertNotNull(applicationContext.getBean("entity2"));
	    }
	    
	    @Test
	    public void testContext2() {
	        assertNull(applicationContext.getBean("hello"));
	    }
	
}
