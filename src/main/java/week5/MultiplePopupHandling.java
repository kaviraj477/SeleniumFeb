package week5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplePopupHandling {
	
	public static void main (String [] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Robot r = new Robot();
	
		
		//Simple popup
		WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simple.click();
		Alert a = driver.switchTo().alert();
		a.getText();
		String alertText = 	a.getText();
		System.out.println(alertText);
		a.accept();
		Thread.sleep(2000);
			
		//Simple timer popup
		WebElement simpletimer = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		simpletimer.click();
		Thread.sleep(7000);
		Alert a2 = driver.switchTo().alert();
		a.getText();
		String alertText2 = a.getText();
		System.out.println(alertText2);
		a2.accept();
		
		//Confirm popup
		WebElement confirmtimer = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmtimer.click();
		Thread.sleep(2000);
		Alert a3 = driver.switchTo().alert();
		a.getText();
		String alertText3 = a.getText();
		System.out.println(alertText3);
		a3.accept();
		Thread.sleep(3000);
		
		//prompt popup
		
		//Locating & clicking alert:
		
		WebElement promtpopup = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtpopup.click();
		Thread.sleep(3000);
		Alert a4 = driver.switchTo().alert();
		a4.getText();
		String promttext = a.getText();
		System.out.println(promttext);
		Thread.sleep(2000);
		
		
		//Sending keys and equating for confirmation:
		
		a4.sendKeys("abcdfodijsifoe");
		a4.accept();
		Thread.sleep(3000);
		WebElement promptresult = driver.findElement(By.xpath("//span[@id='promptResult']"));
		promptresult.getText();
		String promptmsg = promptresult.getText();
		System.out.println("the promptmsg value is " +promptmsg);
		
		String enteredinput = "You entered abcdfodijsifoe";
	 
		//Confirming using 'if & else if'
		if (enteredinput.equals(promptmsg)) {
			System.out.println("Both the values are equal");	}	
		else if (!enteredinput.equals(promptmsg)) {
			System.out.println("Both the values are not equal");}
		
		Thread.sleep(3000);
		 driver.close();
		 }}
