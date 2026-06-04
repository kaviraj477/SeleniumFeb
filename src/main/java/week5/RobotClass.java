package week5;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {
	
	//Use case:
	// 1) Open the URL
	// 2)Perform context click
	// 3)Automating Key functions
	
	
	public static void main (String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//UseCase#1.To open the URL:
		driver.get("https://www.facebook.com/");
		
		//To maximize:
		driver.manage().window().maximize();
		
		//UseCase#2.To perform context click:
		Actions a = new Actions(driver);
		a.contextClick().build().perform(); 
		
		//UseCase#3.Automating keys using robot class:
		try {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		// Saving the file with the name :ABC
		r.keyPress(KeyEvent.VK_A);    
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
			
		}
		catch (Exception e) {
			System.out.println("Failed to automate due to exception");
			e.printStackTrace();
		}	
		driver.close();
		}		
	}


