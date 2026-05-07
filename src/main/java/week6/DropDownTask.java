package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTask {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//clicking create new account:
		WebElement createbutton = driver.findElement(By.xpath("//span[text()='Create new account']"));
		createbutton.click();
		Thread.sleep(4000);
		
		//Filling normal values:
		WebElement firstname = driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_"));
		firstname.click();
		Thread.sleep(2000);
		firstname.sendKeys("abdfsdfasdf");
		
		
		WebElement surname = driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_"));
		surname.click();
		Thread.sleep(2000);
		surname.sendKeys("sdfnsnadfadsfo");
		
//----------------------Filling via DropDrown method--------------------------------------//
		
		WebElement day = driver.findElement(By.id("_r_3_"));
		//WebElement day = driver.findElement(By.xpath("//span[text()='Day']"));
		day.click();
		System.out.println("click actionis performed successfully");
		Thread.sleep(1000);
		
//		Select s = new Select(day);
//		s.selectByIndex(2);
//		
	}
	
}
