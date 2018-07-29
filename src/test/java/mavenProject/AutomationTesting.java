package mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) throws Throwable {
		
	
		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[2]")).click();
		Thread.sleep(5000);
		driver.close();
	
		
		
		
	}
	

}
