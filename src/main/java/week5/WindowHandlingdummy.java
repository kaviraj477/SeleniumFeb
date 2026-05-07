package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingdummy {

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
	   WebElement remote = driver.findElement(By.xpath("//span[text()='Remote']"));
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView({block:'center'});",remote); //views the element in the center of the page
	   remote.click();
	   Thread.sleep(3000);
	   
	   //Window Handling:
	     
	   String parentID = driver.getWindowHandle();   //fetching the unique ID of parent Tab and storing in parentID
	   System.out.println(parentID);
	   Set <String> childID = driver.getWindowHandles(); //Fetches all the ID in child Tab's and stores in childID
	   System.out.println("set method "+childID);
	   
	   //Changing Set into List to access using Index:
	   List <String> listmethod = new ArrayList(childID);
	   System.out.println("List method "+listmethod);
	   
	   //Switching index:
	   driver.switchTo().window(listmethod.get(0));
	   System.out.println("Once again changing to parent tab : "+driver.getTitle());
	   Thread.sleep(3000);
	   
	   driver.switchTo().window(listmethod.get(1));
	   System.out.println("working on the child tab : "+ driver.getTitle());
	   
	   //now clicking the login button in child Tab:
	   WebElement loginbutton =  driver.findElement(By.xpath("//a[text()='Login']"));
	   loginbutton.click();
	   Thread.sleep(3000);
	   
	   driver.close(); //for closing current tab i.e, child tab
	   driver.quit(); //for closing all open tabs
	   
	   
	   	   
	}}
