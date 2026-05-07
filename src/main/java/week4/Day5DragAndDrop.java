package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5DragAndDrop {

public static void main (String [] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	



	
	//locating sourcers:
	WebElement DBdrag1 = driver.findElement(By.xpath("//li[@data-id='5']"));
	WebElement DBdrop1 = driver.findElement(By.xpath("//ol[@id='bank']"));
	WebElement DBdrag2 = driver.findElement(By.xpath("//li[@data-id='2']"));
	WebElement DBdrop2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
	//----------------------------------------------------------------------------------------
	WebElement CRdrag1 = driver.findElement(By.xpath("//li[@data-id='6']"));
	WebElement CRdrop1 = driver.findElement(By.xpath("//ol[@id='loan']"));
	WebElement CRdrag2 = driver.findElement(By.xpath("//li[@data-id='2']"));
	WebElement CRdrop2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
	
	//To scroll down:
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300)");
	
	//Action
	Actions a = new Actions(driver);
	a.dragAndDrop(DBdrag1, DBdrop1).perform();
	a.dragAndDrop(DBdrag2, DBdrop2).perform();
	a.dragAndDrop(CRdrag1, CRdrop1).perform();
	a.dragAndDrop(CRdrag2, CRdrop2).perform();
	
	//Performing submit(click function)
	WebElement perfect = driver.findElement(By.xpath("//div[@class='table4_result']"));
	a.click(perfect);
	
	Thread.sleep(5000);
	driver.close();
	
	
}

}
