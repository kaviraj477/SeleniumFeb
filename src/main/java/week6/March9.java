package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class March9 {
	
	//USE CASES:
	//1. CLICK IMAGE AND SWITCH TO OTHER TAB
	//2. IN CHILD TAB -SCROLL TILL SUBSCRIPTION, SEND KEYS AND SUBMIT
	//3.SWITCHING TO PARENT TAB & SCROLL TILL SUBSCRIPTION, SEND KEYS AND SUBMIT
	//4.ACCEPT ALERT & QUIT BROWSER
	
	public static void main (String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	//---------------------USE CASE #1. CLICK IMAGE AND SWITCH TO OTHER TAB-----------------------------------//
		
		
		//Navigating URL:
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//Frame Syntax:
		driver.switchTo().frame("a077aa5e");
		
		//Locating frame:
		try {
		WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",frame);
		frame.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("Frame located and clicked successfully");
		}
		catch (Exception e) {
			System.out.println("the error is "+e);
		}
		
	
		//Handling alert:
//		Alert a = driver.switchTo().alert();
//		a.accept();
//		Thread.sleep(1000);
		
		
		//---------------------USE CASE #2. (IN CHILD SCROLL TILL SUBSCRIPTION, SEND KEYS AND SUBMIT-----------------------------------//
		
		//Switching tabs using WindowHandle:
		String parentID = driver.getWindowHandle();
		System.out.println("parentID "+parentID);
		
		Set <String> childID = driver.getWindowHandles();
		System.out.println("childId :"+childID);
		List <String> Tabs= new ArrayList (childID);
		System.out.println("list of ChildID "+Tabs);
		Thread.sleep(2000);
	
		
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		
		driver.switchTo().window(Tabs.get(1));
		Thread.sleep(3000);
		
		//Handling popup if occured:
		List<WebElement> popup = driver.findElements(By.xpath("//*[@id=\"cbox\"]/div[1]/div/div/div/div/div[1]"));
		
		if (popup.size()>0 && popup.get(0).isDisplayed()){
			popup.get(0).click();
		}
		
		WebElement emailsubs = driver.findElement(By.xpath("//input[@placeholder='your@email.com']"));
		JavascriptExecutor jsa = (JavascriptExecutor)driver;
     	jsa.executeScript("arguments[0].scrollIntoView({block:'centre'});",emailsubs);
		Thread.sleep(1000);
		System.out.println("the scrolling action is performed");
		Thread.sleep(4000);	
			 
		emailsubs.sendKeys("absdfsdf@gmail.com");	
		WebElement submitbutton = driver.findElement(By.xpath("//span[normalize-space()='Join FREE']"));
	    submitbutton.click();
	    Thread.sleep(2000);
	    System.out.println("Submit button clicked successfully in child tab");
	    
//	  //---------------------USE CASE #3. SWITCHING TO PARENT TAB & SCROLL TILL SUBSCRIPTION, SEND KEYS AND SUBMIT-----------------------------------//  
//		
		//Performing actions in main tab:
	    
	    driver.switchTo().window(parentID);
	    
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
    	email.sendKeys("abcsdf@gmail.com");
		Thread.sleep(1000);
		
		WebElement submitbutton2 = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitbutton2.click();
		Alert ab = driver.switchTo().alert();
		ab.accept();
		System.out.println("Submit button clicked successfully in parent tab");
		Thread.sleep(2000);
		
	    driver.close();
        driver.quit();
      
	}

}
