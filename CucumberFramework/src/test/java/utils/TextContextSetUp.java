package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TextContextSetUp {
	
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtlis genericUtlis;
	
	public TextContextSetUp() throws IOException {
		testBase= new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManger());
		genericUtlis = new GenericUtlis(testBase.webDriverManger());
		
	}
	
	

}
