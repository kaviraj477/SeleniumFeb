package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {
	
 public static void main (String [] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.guru99.com/test/guru99home/");
	 //driver.manage().window().maximize();
	 
	 List <WebElement> IFRAMES = driver.findElements(By.tagName("iframe"));
	 int framecount = IFRAMES.size();
	 System.out.println("number of frames present in the parent URL are :"+ framecount);
	 
	 
	
	 
	 for (int i =0; i<framecount; i++){
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(i);
		 
		Thread.sleep(2000);
		 List <WebElement >TargetFrame = driver.findElements(By.xpath("//img[@src='Jmeter720.png']"));
		 
		 if (!TargetFrame.isEmpty() && TargetFrame.get(0).isDisplayed()) {
			 TargetFrame.get(0).click();
			 System.out.println("frame is clicked");
			
			 
		 }
	 }
 }
	

}
