package brokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkClass {
	
	public static void method () {  //since we are coding entire program in method body rather than main method it can be 
		                           //-called in any class so it is called "REUSEABLE METHOD"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		try {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.xpath("//span[@role='button']"));
		
		
	
		if (button.isDisplayed()) {
	           button.click();
	           System.out.println("close button is clicked");
		}}
		catch (Exception e) {
			System.out.println("error is displayed");
			e.printStackTrace();
		}
		
		List <WebElement> a = driver.findElements(By.tagName("a"));
		Iterator <WebElement> It = a.iterator();  //Creating and initiating iterator by attaching it with list of webelements
		
		while (It.hasNext()) { //it initiates the loop, as long as any elements present next it returns true and keeps on running at last it returns false and stops.
			WebElement alinks = It.next(); // it grabs the next, next link and stores in temporary memory "alinks" 
			String hreflinks = alinks.getAttribute("href"); // we need href from a tags as a not only contains href but also others lie style, class etc..
	                                                        //return type of href is string
			
			if (hreflinks == null || hreflinks.isEmpty()) {
				System.out.println("the links is empty");
			}
		
			//The two most common ones for this scenario are GET and HEAD.

			//GET: This tells the server, "Send me this entire webpage." The server responds with the status code, plus the HTML, the text, the images, and everything else on the page.

			//HEAD: This tells the server, "I just want to know if this page exists. Send me the status code, but do not send me the actual page content."
			
			else {
			
				try {
				HttpURLConnection httplinks = (HttpURLConnection) (new URL(hreflinks).openConnection()); //this opens each and every href links
			//	HttpURLConnection httplinks = (HttpURLConnection) (new URI(hreflinks).toURL().openConnection());----->Latest SYNTAX
			    httplinks.setRequestMethod("HEAD"); //this method interacts with the server and request only the status code of the link
			    httplinks.connect(); // this method creates the connection btw the server in order to process the request in previous step
			    int RESPONSECODES = httplinks.getResponseCode(); // it fetches the response codes and its return type is int
			    
			    //For the codes to be valid it must be in the range "200 to 299"
			    
			    if (RESPONSECODES >=200 && RESPONSECODES <300 ) {
			    	System.out.println("The links are not broken "+ hreflinks);
			     }
			    
			    else if (RESPONSECODES >=300 && RESPONSECODES <400 ) {
			    	System.out.println("Redirected "+ hreflinks);
			     }
			    
			    else if (RESPONSECODES >=400 && RESPONSECODES <500 ) {
			    	System.out.println("Client side error "+ hreflinks);
			     }
			    
			    else if (RESPONSECODES >=500 && RESPONSECODES <600 ) {
			    	System.out.println("Server side error "+ hreflinks);
			     }
			    
			    
				}
				catch(Exception e) {
					System.out.println("error in opening URL links");
					e.printStackTrace();
				}
				
				
				
				
				
				
				
				
			}
		
		} 
		
		driver.close();
		driver.quit();
		System.out.println("the driver is closed");
		
	}
	
		
		public static void main (String [] args) {
			
		method();

		
		
	}

}
