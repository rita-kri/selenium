package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//for manage the webdriver how we manage for all pages in page manager 
public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver webDriverManger() throws IOException {
		//this is so important because we using giving life to driver once no need to create driver object more than one time
		
		//D:\Demo\CucumberFramework\src\test\resources\global.properties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver(); 
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				//firefox code
			}
			
			//explicit wait until object is not found
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		 //driver gets the life
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}

}
