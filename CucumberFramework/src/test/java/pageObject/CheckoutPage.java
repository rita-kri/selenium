package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	By cart = By.cssSelector("[alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void checkOutItems() {
		driver.findElement(cart).click();
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}

	public boolean verifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	}
