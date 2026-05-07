package week6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {
public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		
     //selectByIndex:
		WebElement dd1 = driver.findElement(By.id("dropdown"));
		Select s = new Select(dd1);
		s.selectByIndex(1);
		Thread.sleep(2000);
		
	//selectByValue();
		WebElement dd2 = driver.findElement(By.id("elementsPerPageSelect"));
		Select s2 = new Select (dd2);
		s2.selectByValue("50");
		Thread.sleep(2000);
		
		
	//selectByVisibleText();
		WebElement dd3 = driver.findElement(By.id("country"));
		Select s3 = new Select(dd3);
		s3.selectByVisibleText("India");
		
		
//-----------------------GETTING VALUES OF SELECTED OPTIONS----------------------------------//
		
		WebElement option1 = s.getFirstSelectedOption();
		System.out.println("the first selected option is :"+ option1.getText());
		Thread.sleep(2000);
		
		WebElement option2 = s2.getFirstSelectedOption();
		System.out.println("the second selected option is :"+ option2.getText());
		Thread.sleep(2000);
		
		WebElement option3 = s3.getFirstSelectedOption();
		System.out.println("the third selected option is :"+ option3.getText());
		Thread.sleep(2000);
		
//----------------------GETTING ALL SELECTED OPTIONS----------------------------------------//
		
		//To get all the selected option from different path:
		List <String> L1 = new ArrayList<String>();
		L1.add(s.getFirstSelectedOption().getText());
		L1.add(s2.getFirstSelectedOption().getText());
		L1.add(s3.getFirstSelectedOption().getText());
		
		System.out.println("All the selected options are :"+ L1);
		Thread.sleep(2000);

		
		driver.quit();		

}}
