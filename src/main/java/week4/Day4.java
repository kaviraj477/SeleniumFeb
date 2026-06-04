package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	
	public static void main (String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To get title:
		String title = driver.getTitle();
		System.out.println(title);
	//---------------------------------------------------------------------------------
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//Methods to locate email:
		WebElement ID    = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		//tagname[@id = 'attributevalue']==//input[@id='_R_1h6kqsqppb6amH1_']
		
		WebElement emailname  = driver.findElement(By.name("email")); 
		//tagname[attribute name = 'attributevalue']==//input[@name='email']
		
		WebElement xpath = driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]"));
		Thread.sleep(4000);
		//To enter the value in email:

		//To clear the boxes before entering the value:
		emailname.clear();
		
		//Entering the email :
		emailname.sendKeys("xyz@gmail.com");
		
		//---------------------------------------------------------------------------------------
		
		//Methods to loacate password:
		//WebElement contains = driver.findElement(By.xpath("//input[contains(@class,'xggy1nq']"));
	
		//WebElement xpathpass = driver.findElement(By.xpath("//input[@type='password']"));
				
		WebElement CssSelectors = driver.findElement(By.cssSelector("input[name='pass']")); //[exact value in elemnents]
		//WebElement CssSelectorsRole = driver.findElement(By.cssSelector("input[role='textbox']"));//[value form elements]
		//To enter the value in password:
		
		CssSelectors.sendKeys("1234jhvjh56789");
		
		//------------------------------------------------------------------------------------------------------------
		
		//Methods to click the button;
		
		//Step1: getText: (of needed button i.e, login)
		WebElement Loginbutton = driver.findElement(By.xpath("//span[text()='Log in']"));
		String LoginText = Loginbutton.getText();
		System.out.println(LoginText); 
		
		//Step2: getAttribute :(attributeName of Login button)
		String Attributevalue = Loginbutton.getAttribute("class");
		System.out.println("the attribute value is "+Attributevalue);
		
		//Step3: isDisplayed (to check the whether entered values are displayed)
		boolean B1 = Loginbutton.isDisplayed();
		System.out.println("is the value displayed "+ B1);
		
		//Step4: click()-(clicking the login button
		
		Loginbutton.click();
		
		try {
			WebElement errormessage = driver.findElement(By.xpath("//span[contains(text(),'information')]"));
			String errortext = errormessage.getText();
			System.out.println(errortext);

		}
		catch(Exception E) {
			E.printStackTrace();
			System.out.println("The entered credentials are invalid");
		}
		
				
		driver.close();
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


