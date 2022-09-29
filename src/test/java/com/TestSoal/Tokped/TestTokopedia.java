package com.TestSoal.Tokped;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.TestSoal.page.Tokopedia;
import com.TestSoal.Tokped.Hooks;
import com.TestSoal.Utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTokopedia {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Tokopedia tokped = new Tokopedia();
	
	public TestTokopedia() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	@When("User go to web tokopedia")
	public void user_go_to_web_tokopedia() {
		driver.get(Constans.URL);
		System.out.println("Test Case 1");
	}
	
	@Then("User search item {string}")
	public void user_search_item(String input) {
		tokped.search(input);
		Hooks.delay(3);
		System.out.println("Test Case 2");
	}
	
	@And("User move to last item")
	public void user_move_to_last_item() {
		Hooks.scroll(3000);
		Hooks.delay(2);
		tokped.lastitem();
		System.out.println("Test Case 3");
	}
	
	@And("Check result")
	public void check_result() {
		assertEquals(tokped.Cektotalitem(),"Menampilkan 1561 - 1570 barang dari total 1.570 untuk");
		System.out.println(tokped.Cektotalitem());
	}
}
