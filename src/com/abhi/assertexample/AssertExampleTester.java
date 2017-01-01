package com.abhi.assertexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AssertExampleTester {

	@Test  
	public void testFindMax(){  
		assertEquals(4,AssertExample.findMax(new int[]{1,3,4,2}));  
		assertEquals(-1,AssertExample.findMax(new int[]{-12,-1,-3,-4,-2}));  
	} 
	
	@Test  
	public void testPrintString(){  
		assertEquals("Hello Abhi",AssertExample.printString("Abhi"));  
		assertEquals("Hello Ravi",AssertExample.printString("Ravi"));   
	}
} 

