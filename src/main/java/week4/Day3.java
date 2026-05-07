package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//locating using Id
		//WebElement id = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		
		//locating using name:
		WebElement name = driver.findElement(By.name("pass"));
		
		//using Xpath:
		WebElement Xpath = driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]"));
		
		
				
		
		
	}

}
