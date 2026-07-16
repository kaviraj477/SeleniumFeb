package week6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicFrames {
	public static void main (String [] args) throws InterruptedException {
		
		//USE CASES:
		//1.GET ALL THE IFRAMES
		//2.PERFORM THE ACTION ON THE SPECIFIC IFRAME 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		
	//----------------------1.GET ALL THE IFRAMES-----------------------------------//
		List <WebElement> iframes = driver.findElements(By.tagName("iframe"));
		int framesize             = iframes.size();
		System.out.println("No.of frames present is/are :"+framesize);
		
		//switching frames till we reach the target frame:
		
		for (int i=0; i<framesize; i++){  //iterating frames
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);  //performs switching
			Thread.sleep(2000);
			
			List<WebElement> target = driver.findElements(By.xpath("//img[@src='Jmeter720.png']")); //target frame locating
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//we should always use list and elements in plural form when we perform for loop to find element
		
	//-------------------------------2.PERFORM THE ACTION ON THE SPECIFIC IFRAME -------------------------------------------//		
		if (!target.isEmpty() && target.get(0).isDisplayed()) { //get (value) should preceed before isDisplayed
			
			//#method 2 :
			//WebElement variable = target.get(0);
			//so replace target.get(0) with variable everywhere
			Thread.sleep(2000);
			JavascriptExecutor  as = (JavascriptExecutor)driver;
			as.executeScript("arguments[0].scrollIntoView({block:'center'});",target.get(0));
			
			Thread.sleep(2000);
			target.get(0).click();    //performing the clicking action
			
			System.out.println("Located frame and clicked succcessfully");
			break;                    //To stop the loop
		}}
		
		Thread.sleep(2000);
		driver.quit();
	
		
	}}
	
	


