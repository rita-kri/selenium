package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample {
	public static void main(String[] args) {
		//Invoking browser
		//Chrome - ChromeDriver extends -methods close get
		//FireFox - FireFoxDriver - methods close get
		//WebDriver -close get 
		//WebDriver methods+ class methods
		
		//chromedriver.exe -> chrome broswer(third party broswer file to launch the browser where we can invoke the browser
		
		//ChromeDriver driver = new ChromeDriver();//driver object has access to all the methods of chrome driver
		
		//step to invoke the chrome driver
		//Chromedriver.exe -> chrome broswer Selenium Manager
		
		//System.setProperty("webdriver.chrome.driver", "Users/ritmh/Documents/chromedriver");//download manually chrome driver


		//1. Give me the count of links on the page
		//a
		WebDriver driver = new ChromeDriver(); //driver objech has access to the methods of chrome driver which are defined in web driver interface.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		
		
		
		
	}

}
