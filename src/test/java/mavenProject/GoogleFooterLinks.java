package mavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Privacy")).click();
		
		if(driver.getPageSource().contains("Privacy"))
			System.out.println(" The footer link test 01 Passed");
		else
			System.out.println("The footer link test 01 failed");
		
		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		Assert.assertEquals(4, 2+2);
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Terms")).click();
		if(driver.getPageSource().contains("Terms"))
			System.out.println(" The footer link test 02 Passed");
		else
			System.out.println("The footer link test 02 failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		Thread.sleep(2000);
		driver.navigate().back();		

		driver.findElement(By.linkText("Settings")).click();
		if(driver.getPageSource().contains("Settings"))
			System.out.println(" The footer link test 03 Passed");
		else
			System.out.println("The footer link test 03 failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Settings"));

		Thread.sleep(2000);

		driver.close();


	}

}