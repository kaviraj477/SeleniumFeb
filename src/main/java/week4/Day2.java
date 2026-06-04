package week4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2 {
	
	public static void main (String [] args) throws Exception  {
	
		System.setProperty("webdriver.edge.driver", "E:\\sele drives\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	

	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	
	driver.close();

}
}