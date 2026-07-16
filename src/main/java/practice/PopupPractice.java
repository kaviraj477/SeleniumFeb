package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupPractice {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		                            //First Button:
		WebElement FirstButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		js.executeScript("arguments[0].style.backgroundColor='yellow' ",FirstButton);
		
		Thread.sleep(2000);
		FirstButton.click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		                             // Second Button:
		
		
		WebElement SecButton = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		js.executeScript("arguments[0].style.backgroundColor = ' green' ", SecButton);
		Thread.sleep(2000);
		SecButton.click();
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10); //10-represents maximum amount of time
		Alert a2 = wait.until(ExpectedConditions.alertIsPresent()); //no need driver.switchTo.alert
		a2.accept();
		System.out.println("second alert is clicked");
		}
		catch (Exception e) {
			System.out.println("Alert is not clicked");
		}
		
		       
		                        //Third Button:
		WebElement FourButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		System.out.println("third button is located");
		
		try {
		js.executeScript("arguments[0].style.backgroundColor='orange'", FourButton);
		System.out.println("third button colour changed");
	}
	catch(Exception e) {
		System.out.println("third button colour not changed");
	}
	
	
	
		Thread.sleep(1000);
		FourButton.click();
		System.out.println("third alert is clicked");
		Thread.sleep(2000);
		

		
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			Alert a3 = wait.until(ExpectedConditions.alertIsPresent());
			a3.accept();
			
			boolean success = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@id='confirmResult']"), "You selected "));
		    System.out.println("fourth alert is clicked successfully");	
			
		}
		catch (Exception e) {
			System.out.println("alert is not clicked");
		}
		
		driver.close();
	}

}
