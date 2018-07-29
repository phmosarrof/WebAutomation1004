package mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}
	

}
