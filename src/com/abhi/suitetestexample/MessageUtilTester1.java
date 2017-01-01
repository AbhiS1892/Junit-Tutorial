package com.abhi.suitetestexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageUtilTester1 {
	String message = "Robert";	
	MessageUtil messageUtil = new MessageUtil(message);

	//	@Test(timeout = 1000)
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {	
		System.out.println("Inside testPrintMessage()");    
		//		assertEquals(message, messageUtil.printMessage());  
		messageUtil.printMessage();
	}

}
