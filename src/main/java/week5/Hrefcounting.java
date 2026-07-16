package week5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrefcounting {
	
	public static void main (String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		List <WebElement> hrefvalue = driver.findElements(By.xpath("//a[@href]"));
		int hrefnames = hrefvalue.size();
		System.out.println(hrefnames);
		
		for (WebElement values :hrefvalue) {
			String attributeValues = values.getAttribute("href");
			System.out.println("the values of href are :" + attributeValues);
		}
			
		Thread.sleep(5000);
		driver.close();
		
	}

}
