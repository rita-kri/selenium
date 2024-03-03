package stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TextContextSetUp;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TextContextSetUp textContextSetUp;
	LandingPage landingPage;
	
	
	public LandingPageStepDefinition(TextContextSetUp textContextSetUp) {
		this.textContextSetUp = textContextSetUp;
		this.landingPage = textContextSetUp.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
	    //System.setProperty("webdriver.chrome.drivetr","C:\\Users\\ritmh\\Documents\\chromedriver-win64");
//		textContextSetUp.driver = new ChromeDriver();  //driver gets the life
//		textContextSetUp.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		textContextSetUp.testBase.webDriverManger();
		
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}
	
	@When("^user searched with shortname (.+) and extracted actual name pf product$")
	public void user_searched_with_shortname_and_extracted_actual_name_pf_product(String shortName) throws InterruptedException {
//		LandingPage landingPage = textContextSetUp.pageObjectManager.getLandingPage();
		landingPage.seachItem(shortName);
		//textContextSetUp.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	  Thread.sleep(2000);
	 
	  textContextSetUp.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
	  System.out.println(landingPageProductName + " is extracted from the homepage");
		
	}
	
	@When("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
	   landingPage.incrementItems(Integer.parseInt(quantity));
	   landingPage.addToCartItems();
	}

}
