package week6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		//Locating and initializing dropdown:
		WebElement ab = driver.findElement(By.id("fruits"));
		Select s = new Select(ab);
		
		//whether it is multiset
		boolean b = s.isMultiple();
		System.out.println("is the element multiple ?"+ b);
		
	//-------------------/Methods of selecting element/------------------------------------//
	 
		//1.selectByIndex:
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		//2.selectByValue("")
		s.selectByValue("banana");               //which is in blue text
		Thread.sleep(2000);
		
		//3.SelectByVisibleText(""):
		s.selectByVisibleText("Apple");          //which is in black text
		Thread.sleep(2000);
		
		
 //------------------------------Methods of getting selected value----------------------------//
		
		//1.getOptions: (gets all the option present in the element)
		List<WebElement> options = s.getOptions();
		for (WebElement f1:options) {
			System.out.println("the available options are :"+f1.getText());
		}
		Thread.sleep(1000);
		
		//2.getFirstSelectedOption
		WebElement option = s.getFirstSelectedOption();
		System.out.println("the first selected option is :"+ option.getText());
		Thread.sleep(1000);
		
		//3.getAllSelectedOptions:
		List <WebElement> alloptions = s.getAllSelectedOptions();
		for (WebElement F2:alloptions) {
			System.out.println("the selected options are :"+ F2.getText());
		}
		Thread.sleep(1000);
		
//-------------------------------------Methods of deselecting-----------------------------------//
		
		//1.deselectByIndex():
		s.deselectByIndex(1);
		Thread.sleep(1000);
		
		//2.deselectByValue();
		s.deselectByValue("banana");
		Thread.sleep(1000);
		
		//3.deselectByVisibleText():
		s.deselectByVisibleText("Grape");
		Thread.sleep(1000);
		
		//4.deselectAll();
		s.deselectAll();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
