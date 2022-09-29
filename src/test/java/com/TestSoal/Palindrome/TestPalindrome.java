package com.TestSoal.Palindrome;

import io.cucumber.java.en.When;

public class TestPalindrome {
	
	@When ("test palindrom {string}")
	public void TestPalindrom(String input) {
		
		String s = input;
		
		String []s1=s.split("");
		String reverseString="";
		 
		for(int i=s1.length-1;i>=0;i--){
		 
		reverseString=reverseString+s1[i];
		 
		}
		System.out.println(reverseString);
		 
		if(s.equals(reverseString)){
		 
		System.out.println("Given string is a palindrom");
		}
		else{
		System.out.println("Given string is not a palindromen");
		}
		
	}
	
}

