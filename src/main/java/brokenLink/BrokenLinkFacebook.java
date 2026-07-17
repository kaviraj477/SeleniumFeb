package brokenLink;


import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkFacebook {
	
	
	public static void main (String [] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List <WebElement> LINKS = driver.findElements(By.tagName("link"));
		Iterator <WebElement> iT = LINKS.iterator();
		int count = 1; // in order to number the links
		
		while(iT.hasNext()) {
			WebElement FBlinks = iT.next();
			String hreftags = FBlinks.getAttribute("href");
			
		if (hreftags == null || hreftags.isEmpty()) {
			System.out.println("error or nullity in the links");
		}
		
		else if (!hreftags.startsWith("http")) {  // else if also requires condition like if , it is like second if condition
			System.out.println("skipping the non http links:"+ hreftags);
		}
		
			else { // unlike if and else if , else doesn't require condition
				try {
					//HttpURLConnection httplinks = (HttpURLConnection) (new URL(hreftags).openConnection());
					HttpURLConnection httpvar = (HttpURLConnection) (new URI (hreftags).toURL().openConnection());
					httpvar.setRequestMethod("HEAD");
					httpvar.connect();
					int response = httpvar.getResponseCode();
					//System.out.println("the total number of links are :"+response);
				
				if (response >=200 && response <300) {
					System.out.println(count+" .these links are not broken links" + hreftags);
				}
				
			
				
				else {
					System.out.println("these links are broken links " + hreftags);
				}
					
					
				}
				catch (Exception e) {
					e.printStackTrace();
					
				}		
			
			
			
			
			
		}
		count ++; //placing inside loop but outside try catch
		
		}
		driver.close();
		
		
	}

}
