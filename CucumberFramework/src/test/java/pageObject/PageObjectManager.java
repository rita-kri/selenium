package pageObject;

import org.openqa.selenium.WebDriver;

//follow factory design pattern implementation for creating objects 
public class PageObjectManager {
	
	public LandingPage landingPage;
	public OfferPage offerPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
	}



	public LandingPage getLandingPage() {
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage offersPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
