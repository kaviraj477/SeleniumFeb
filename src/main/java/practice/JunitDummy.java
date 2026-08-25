package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitDummy {
	
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement CreateButton = driver.findElement(By.xpath("//span[text()='Create new account']"));
		CreateButton.click();
		
		WebElement firstNameenter = driver.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']"));
		firstNameenter.click();
		firstNameenter.sendKeys("kavi");
		
		WebElement lastNameenter = driver.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']"));
		lastNameenter.click();
		lastNameenter.sendKeys("raj");
		
		WebElement datelist = driver.findElement(By.xpath("//span[text() ='Day']/parent::div"));
	//	wait.until(ExpectedConditions.elementToBeClickable(datelist));
		System.out.println("date is found");
		datelist.click();
		System.out.println("date is clicked");
		
		WebElement dateselect = driver.findElement(By.xpath("//div[@id='_r_1___1']"));
		//wait.until(ExpectedConditions.elementToBeClickable(dateselect));
		dateselect.click();
		
		WebElement monthlist = driver.findElement(By.xpath("//span[text()='Month']/parent::div"));
		monthlist.click();
	
		WebElement monthselect = driver.findElement(By.xpath("//div[text() = 'April']"));
		monthselect.click();
	
		WebElement yearlist = driver.findElement(By.xpath("//span[text() = 'Year']/parent::div"));
		yearlist.click();
	
		WebElement yearselect = driver.findElement(By.xpath("//div[text() = '2014']"));
		yearselect.click();
	
		WebElement emaillist = driver.findElement(By.xpath("//span[text() = 'Select your gender']//parent::div"));
		emaillist.click();
	
		WebElement emailselect = driver.findElement(By.xpath("//div[text() = 'Male']"));
		emailselect.click();
		
		WebElement myemail = driver.findElement(By.xpath("//input[@id='_R_6ad8p4jikacppb6amH1_']"));
		myemail.click();
	
		myemail.sendKeys("password");
		
		WebElement mypassword = driver.findElement(By.xpath("//input[@id='_R_clap4jikacppb6amH1_']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", mypassword);
		js.executeScript("window.scrollBy(0, 1000);");
		mypassword.click();
	
		mypassword.sendKeys("password");	
		
		WebElement submitbutton = driver.findElement(By.xpath("	(//span[text() = 'Submit'])[2]"));
	    submitbutton.click();
		
		
	 
		
	}

}
