package com.TestSoal.Palindrome;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = ""
				,features = {"src/test/resources/palindrome/TestPalindrom.feature"}
				,glue = "com.TestSoal.Palindrome"
				,plugin = {"pretty","html:target/cucumber-Palindromereports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
}