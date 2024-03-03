//IMPORTANT INTERVIEW QUESTION WHAT WE DID IN AUOTMATION/ ANY OPTIMIZATIONS HERE IS THE ANSWER 34 LINE TO 48.


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		//Assessment
				/*
				 * 1.select any checkbox 2. Grab the label of the slected//put into variable. 3.
				 * Select an option in dropdown. Here option to select should come form dstep2//
				 * don not hard code text.drive it dynamically from step 2 4. enter the step 2
				 * grabbed lebel text in editbox // 5. click alert and then verify if text
				 * grabbed from step 2 is present in the pop up message.
				 */
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
//		String text2 = driver.switchTo().alert().getText();
//		if(text2.contains(text)) {
//			System.out.println("Alert message success");
//		}else {
//			System.out.println("Something went wromg with the excecution");
//		}
//		System.out.println(driver.switchTo().window(text));
//		
		// Switching to the alert and accepting it
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		if (alertText.contains(text)) {
		    System.out.println("Alert message success: " + alertText);
		    alert.accept();
		} else {
		    System.out.println("Something went wrong with the execution");
		}
		
		Thread.sleep(2000L);
	
        System.out.println(driver.findElements(By.tagName("a")).size());
        //create a sub driver
		WebElement footerDriver= driver.findElement(By.id("gf-BIG"));//limiting webdriver scope 
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //use findelement only when we create webelement for liminting scope
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link in the column and check if the pages are opening-
		
		for(int i =1; i<columndriver.findElements(By.tagName("a")).size();i++) {
			String clickonlinks= Keys.chord(Keys.CONTROL, Keys.ENTER); //clk control btn and clk enter then we will see link in differenet tabs
			//columndriver.findElements(By.tagName("a")).get(i).click();
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			Thread.sleep(5000L);
			
		}
		//open all the tabs
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
