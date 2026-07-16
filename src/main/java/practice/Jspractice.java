package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jspractice {
	
	public static void main (String [] args) throws InterruptedException {
	
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.location= 'https://demoqa.com/alerts' ");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	
	WebElement Login = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	//WebElement Login = driver.findElement(By.xpath("//button[@type='button']"));
	
	
	//to highlight:
     js.executeScript("arguments[0].style.backgroundColor='yellow' ", Login);
	 Thread.sleep(2000);Thread.sleep(2000);
	//driver.close();
	
	//to click:
    js.executeScript("arguments[0].click();", Login);
	
	
	//Alert a = driver.switchTo().alert();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,400)");
}
}