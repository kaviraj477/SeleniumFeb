package dummy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDummy {
	
	public static void main (String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		WebElement email  =  driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password =  driver.findElement(By.xpath("//input[@name='pass']"));
      //  WebElement LogIn    =  driver.findElement(By.xpath("//span[text()='Log in']"));
        
        Actions a =  new Actions (driver);
     try {   
       a.sendKeys(email,"aindfiuansfi@gmail.com").perform();
       Thread.sleep(3000);
       a.sendKeys(password,"nsfosdnfoksdnfo").perform();
       //Thread.sleep(1000);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waits untill line 37 completes its action to throw error if any
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      WebElement LogIn    =  driver.findElement(By.xpath("//span[text()='Log in']"));
       a.doubleClick(LogIn).build().perform();
     }
     catch (Exception e) {
    System.out.println("error is present");
    e.printStackTrace();
     }
		
		
	}

}
