import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement childWindow = driver.findElement(By.xpath("//span[.='Sign in with Google']"));
		childWindow.click();
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		//handle multiple windows
		
		Set<String> parentchild = driver.getWindowHandles();
		System.out.println(parentchild);
				
	
		
		
	}

}
