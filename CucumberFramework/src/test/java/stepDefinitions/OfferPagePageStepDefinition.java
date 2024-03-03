package stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OfferPage;
import pageObject.PageObjectManager;
import utils.TextContextSetUp;

public class OfferPagePageStepDefinition {
	
	public WebDriver driver;
	public String offerPageProductName;
	TextContextSetUp textContextSetUp;
	PageObjectManager pageObjectManager;
	
	
	//single responsibility principal
	//loosely coupled principal
	
	public OfferPagePageStepDefinition(TextContextSetUp textContextSetUp) {
		this.textContextSetUp = textContextSetUp;
	}
	
	
	
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException, IOException {
//		textContextSetUp.driver.findElement(By.linkText("Top Deals")).click();
//		Set<String> s1 = textContextSetUp.driver.getWindowHandles();
//		Iterator<String> i1 = s1.iterator();
//		String parentWindow = i1.next();
//		String childWindow = i1.next();
//		textContextSetUp.driver.switchTo().window(childWindow);
		
		switchToOfferPage();
		OfferPage offerPage = new OfferPage(textContextSetUp.testBase.webDriverManger());
		offerPage.seachItem(shortName);
		
		//textContextSetUp.driver.findElement(By.xpath("//input[@type ='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		
		offerPageProductName = offerPage.getProductName();

		//offerPageProductName = textContextSetUp.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		
	}
	
	public void switchToOfferPage() {
		//pageObjectManager = new PageObjectManager(textContextSetUp.driver);
		LandingPage landingPage = textContextSetUp.pageObjectManager.getLandingPage();
		landingPage.selectTopDealspage();
		textContextSetUp.genericUtlis.switchWindowToChild();
		
	}
	
	@Then("validate product name in offers page matches with Landing Page.")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	
		Assert.assertEquals(offerPageProductName, textContextSetUp.landingPageProductName);
	}

}
