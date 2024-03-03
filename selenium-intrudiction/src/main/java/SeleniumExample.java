import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myworkday.com/wday/authgwy/synechron/login.htmld");
	System.out.println(driver.getTitle());
	//driver.close(); //only close with one window which open
	//driver.quit(); // close all associate window
	Thread.sleep(2000);
	//create a webelement for continue the application
	
	//WebElement findElement = driver.findElement(By.id("authSelectorOption"));
	//WebElement element = driver.findElement(By.cssSelector("div[data-automation-id='authSelectorOption'][role='menuitem']"));
	//element.click();
	WebElement findElement = driver.findElement(By.cssSelector(".GDPVGE1BJ1"));
	findElement.click();
	System.out.println("Success");
	driver.findElement(By.id("userNameInput")).sendKeys("rita.kumari@synechron.com");
	driver.findElement(By.id("passwordInput")).sendKeys("hello@123");
	driver.findElement(By.id("submitButton")).click();
	System.out.println(driver.findElement(By.id("errorText")).getText());
	
//	driver.findElement(By.cssSelector("Input[placeholder='someone@example.com']")).clear();
//	driver.findElement(By.cssSelector("Input[placeholder='someone@example.com']")).sendKeys("rita.kumari@synechron.com");
//	driver.findElement(By.xpath("//Input[@placeholder='Password']")).sendKeys("Richa27@RK");
//	driver.findElement(By.className("submit")).click();
	
}
}
