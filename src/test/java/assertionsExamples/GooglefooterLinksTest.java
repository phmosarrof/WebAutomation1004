package assertionsExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglefooterLinksTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chorme", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#fsr > a:nth-child(1)")).click();
		if (driver.getPageSource().contains("Privacy"))
				{
			System.out.println("Footer Link - Privacy is Passed the Test");}
			else 
				System.out.println("Footer Link - Privacy Fail is Test ");
		driver.get("http://www.google.com");	
		driver.findElement(By.xpath("//*[@id=\'fsr\']/a[2]")).click();
		if(driver.getPageSource().contains("Using our Services"))
		{
			System.out.println("Footer Link - Terms is Passed the Test");
		}
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'fsettl\']"));
		if(driver.getPageSource().contains("Settings")) {
			System.out.println("Footer Link - Settings is Passed the Test");
		}
		
		driver.close();
		}
	}


