package com.TestSoal.Utils;

public enum TestScenario {

	T1("Shoping");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
