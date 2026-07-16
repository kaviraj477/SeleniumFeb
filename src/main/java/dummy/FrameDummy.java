package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDummy {
	
	
	public static void main (String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		List <WebElement> L1 = driver.findElements(By.tagName("iframe"));
		int a = L1.size();
		System.out.println("the number of iframes present is :"+a);
		
		for (int i = 0; i<a; i++) {
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			List <WebElement> L2 = driver.findElements(By.xpath("//img[@src='Jmeter720.png']"));
			
		
		if (!L2.isEmpty() && L2.get(0).isDisplayed()) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView({block:'center'});", L2.get(0));
			Thread.sleep(2000);
			
			L2.get(0).click();
			
			
		}
			
		}
		
		
	}

}
