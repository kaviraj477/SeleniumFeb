package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableMethod {
	
	public static void main (String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		
	//------------------------1.SIMPLE TABLE------------------------------------------//
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement tab1td1 = driver.findElement(By.xpath("//table//td[1]"));
		String firstvalue = tab1td1.getText();
		System.out.println("the first value is :"+firstvalue);
		Thread.sleep(2000);
		
		WebElement tab1td2 = driver.findElement(By.xpath("//table//td[2]"));
		String secondvalue = tab1td2.getText();
		System.out.println("the second value is :"+secondvalue);
		Thread.sleep(2000);
		
		WebElement tab2td3 = driver.findElement(By.xpath("//table//tr[2]//td[1]"));
		String thirdvalue  = tab2td3.getText();
		System.out.println("the third value is :"+thirdvalue);
		Thread.sleep(2000);
		
		WebElement tab1td4 = driver.findElement(By.xpath("//table//tr[2]//td[2]"));
		String fourthvalue = tab1td4.getText();
		System.out.println("the fourth value is :"+fourthvalue);
		Thread.sleep(2000);
		
		
		
	//------------------------2.NESTED TABLE---------------------------------------------//
		
		
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().window().maximize();
		
		WebElement innertable1 = driver.findElement(By.xpath("//table//tr[2]//td[2]//table//td[2]"));
		String value1           = innertable1.getText();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("the first value is :"+value1);
		Thread.sleep(2000);
		
		WebElement innertable2 = driver.findElement(By.xpath("//table//tr[2]//td[2]//table//tr[2]//td[2]"));
		String value2           = innertable2.getText();
		System.out.println("the second value is :"+value2);
		Thread.sleep(2000);
		
		driver.quit();
				
	}

}
