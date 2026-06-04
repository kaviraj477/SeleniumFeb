package week4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	public static void main (String [] args) throws InterruptedException {
		
		//GoogleChrome browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.edge.driver", "E:\\sele drives\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driveredge = new EdgeDriver();
		driveredge.get("https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String titleedge = driveredge.getTitle();
		System.out.println(titleedge);
		
		String chromeURL = driver.getCurrentUrl();
		String edgeURL   = driveredge.getCurrentUrl();
		System.out.println(chromeURL);
		System.out.println(edgeURL);
		
		
		Thread.sleep(2000);
		
		
		driver.close();
		driveredge.close();		
	}

}
