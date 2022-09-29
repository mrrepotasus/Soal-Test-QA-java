package com.TestSoal.Tokped;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = ""
				,features = {"src/test/resources/Tokped/TestTokped.feature"}
				,glue = "com.TestSoal.Tokped"
				,plugin = {"pretty","html:target/cucumber-Tokpedreports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
}