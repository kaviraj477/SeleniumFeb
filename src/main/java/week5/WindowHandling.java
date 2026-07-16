package week5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		
		//Navigating to the required URL:
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		//managing the ads:
		try {
		WebElement ad = driver.findElement(By.xpath("//span[text()='Got it']"));
		ad.click();
		Thread.sleep(3000);
		System.out.println("the ad was clicked");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("No such popup found");
			Thread.sleep(3000);
		}
		
		//scroll to view :
		try {
	   WebElement remote = driver.findElement(By.xpath("//span[text()='Remote']"));
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView({block:'center'});",remote); //views the element in the centre
	   remote.click();
	   System.out.println("next element located and clicked");
	   Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("js not executed");
		}
	   //Window Handling:
	     
	   String parentHandleID = driver.getWindowHandle();   //fetching the unique ID and saving in String's variable
	   System.out.println(parentHandleID);
	   Set <String> childHandlesID = driver.getWindowHandles(); //Fetches unique ID of all currently opened tabs, since it is more we use Set<String>
	   System.out.println(childHandlesID);
	   
	   //Storing Handle IDs:
//	   for (String childURL: childHandlesID) 
//		   //for loop goes through all ID's one by one where the command in line 58 can access it line by line
//		   //So we must  Store Set String values in for loop as string value ( which views line by line each string values)
//	   {
//		   if (!parentHandleID.equals(childURL))
//		   driver.switchTo().window(childURL); // if not changed to for, this command can't operate as the value of is set of strings
//		   Thread.sleep(3000);
//	   }
//	   String childURL = driver.getCurrentUrl();
//	   System.out.println(childURL);		
	}
}
