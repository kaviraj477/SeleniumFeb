package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptMethod {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Execution via Javascript:
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//Entering the URL:
		js.executeScript("window.location = 'https://demoqa.com/alerts'");
		driver.manage().window().maximize();
		
		
		//Highlighting the text with box:
		WebElement simple = driver.findElement(By.xpath("//span[text()='Click Button to see alert '] "));
		js.executeScript("arguments[0].style.border='3px solid green'",simple);
		Thread.sleep(2000);
		
		//Highlighting the box with color:
		js.executeScript("arguments[0].style.backgroundColor='yellow'", simple);
		Thread.sleep(3000);
		
		//To click a button:
		WebElement button = driver.findElement(By.xpath("//button[@id='alertButton']"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		//To scroll down till the end:
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//to scroll up:
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Move with axis:
		js.executeScript("window.scrollBy(0,400)");
		
		
		Thread.sleep(3000);
		driver.close();

	}
}
