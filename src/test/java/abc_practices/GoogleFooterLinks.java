package abc_practices;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class GoogleFooterLinks {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");

		//WebDriver driver = new ChromeDriver(c);

		GoogleFooterLinks footer = new GoogleFooterLinks();
		footer.privacy(driver);
		footer.terms(driver);
		footer.settings(driver);
		
		DesiredCapabilities ch = new DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = ChromeOptions();
		c.merge(ch);
		
		WebDriver driver = new ChromeDriver(c);
		
	}

	void privacy (WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Privacy")).click();

		if(driver.getPageSource().contains("Privacy"))
			System.out.println(" The footer link test 01 Passed");
		else
			System.out.println("The footer link test 01 failed");

		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		Assert.assertEquals(4, 2+2);

		Thread.sleep(2000);
		driver.navigate().back();
	}
	void terms(WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Terms")).click();
		if(driver.getPageSource().contains("Terms"))
			System.out.println(" The footer link test 02 Passed");
		else
			System.out.println("The footer link test 02 failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));

		Thread.sleep(2000);
		driver.navigate().back();		
	}
	void settings (WebDriver driver) throws Exception {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Mosarrof Hossain\\ScreenShot\\scr.png"));    
		
		
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
