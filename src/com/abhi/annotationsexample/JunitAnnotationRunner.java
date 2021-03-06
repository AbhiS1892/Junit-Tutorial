package com.abhi.annotationsexample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitAnnotationRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitAnnotationTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
