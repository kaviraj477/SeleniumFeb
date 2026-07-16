package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HrefPractice {
	
	
	public static void main (String [] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		                        //#METHOD ONE
		List <WebElement> Hrefitems = driver.findElements(By.xpath("//a[@href]"));  //We cannot use set method because to locate a webelement, List method is predefined in Java
		int valueOne = Hrefitems.size();                                            //<Datatype> must be mentioned to initiate it in for loop
		System.out.println("Printing using MethodOne :" + valueOne);
		
		
                               //#METHOD TWO		
		List var = driver.findElements(By.xpath("//a[@href]"));
		int valueTwo = var.size();
		System.out.println("Printing the size of href using MethodTwo :" + valueTwo);
		
	
		
		for (WebElement forVar : Hrefitems) {
			String s1 = forVar.getAttribute("href"); //getAttribute specifically searches for "href" tags in the entire dom structure which has many tags
			System.out.println("the values are :"+s1);
			
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
