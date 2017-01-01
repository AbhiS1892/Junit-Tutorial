package com.abhi.suitetestexample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   MessageUtilTester1.class,
   MessageUtilTester2.class
})

public class MessageUtilTestSuite {

}
