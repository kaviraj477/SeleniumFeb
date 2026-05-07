package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandling {
	
	//Use cases:
	// 1.open the URL
	// 2.enter the ID
	// 3.click submit
	// 4.Handling popup

	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		// 1.Opening the WebSite:
		driver.get("https://demo.guru99.com/test/delete_customer");
		driver.manage().window().maximize();
		
		// 2.Entering the ID:
		WebElement ID = driver.findElement(By.xpath("//input[@name='cusid']"));
		ID.sendKeys("abc12dsfds");
		
		// 3.click submit
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		//4.Handling popup:
		Alert a = driver.switchTo().alert();
		a.getText();
		String alertText = 	a.getText();
		System.out.println(alertText);
		a.accept();
		Thread.sleep(3000);
		
		
		Alert a2 = driver.switchTo().alert();
		a2.getText();
		String alertText2 = a2.getText();
		System.out.println(alertText2);
		a2.accept();
	}
}
