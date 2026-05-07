package week4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2 {
	
	public static void main (String [] args) {
	
		System.setProperty("webdriver.edge.driver", "E:\\sele drives\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
	

	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();

}
}