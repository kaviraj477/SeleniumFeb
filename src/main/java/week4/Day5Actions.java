package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Actions {
	
	public static void main (String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();                     // import WebDriver
		driver.get("https://www.facebook.com/"); 
		
		//To maximize
		driver.manage().window().maximize();
		
		//Locating;
		WebElement email       = driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]"));
		WebElement password    = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Log in']"));
		
		//Actions:(inputing values)
		Actions a = new Actions(driver);                           // import Actions
		a.sendKeys(email,"abddfsd@gmail.com").build().perform();   // action'svar.sendkeys(element'svar,"user value");
		a.sendKeys(password,"sdfjnsdijfnis").build().perform();    // action'svar.sendkeys(element'svar,"user value");
	  
		
		
		//Double click:
		WebElement doubleclick = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
		a.doubleClick(doubleclick).build().perform();
		  
		//Actions:(clicking)
		a.click(loginButton).build().perform();
		
		Thread.sleep(3000);
		
		//Context click
		a.contextClick().build().perform();                        // Right clicks where the pointer is at last 
			
	}

}
