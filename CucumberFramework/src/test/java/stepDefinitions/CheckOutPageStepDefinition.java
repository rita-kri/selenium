package stepDefinitions;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;
import pageObject.LandingPage;
import utils.TextContextSetUp;

public class CheckOutPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TextContextSetUp textContextSetUp;
	
	
	
	public CheckOutPageStepDefinition(TextContextSetUp textContextSetUp) {
		this.textContextSetUp = textContextSetUp;
		this.checkoutPage = textContextSetUp.pageObjectManager.getCheckoutPage();  // because constructor call first so no need to assigned same object again again in different method
		
	}
	
	@Then("Verify the user has ability to enter the promo code and place the order")
	public void  Verify_the_user_has_ability_to_enter_the_promo_code() {
//		checkoutPage = textContextSetUp.pageObjectManager.getCheckoutPage();
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout(String name) throws InterruptedException {
		checkoutPage.checkOutItems();
		Thread.sleep(2000);
		//Assertion to extract name from screen and compare with name
	}
	
	

}
