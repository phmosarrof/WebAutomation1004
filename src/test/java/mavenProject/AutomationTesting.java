package mavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.junit.Assert;




public class AutomationTesting {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome","C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();
		if(driver.getPageSource().contains("Privacy"))
			System.out.println(" The footer link test Passed");
		else
			System.out.println("The footer link test failed");

		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		//Assert.assertEquals(4, 2+2);
		
		driver.quit();




	}


}
