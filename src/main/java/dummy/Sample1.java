package dummy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	
	public static void main (String [] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//context click
		Actions a = new Actions (driver);
		a.contextClick().build().perform();
		Thread.sleep(2000);
		
		//Robot 
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password =  driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement loginbutton = driver.findElement(By.xpath("//div[@role='button']"));
		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		a.sendKeys(username,"abc").build().perform();
		a.sendKeys(password,"sdfkjaodf").build().perform();
		a.click(loginbutton).build().perform();
		Thread.sleep(2000);
		
		
		driver.close(); 
		
		
	
	}

}
