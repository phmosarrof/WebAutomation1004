package assertionsExamples;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestNGAsserts {
 @Test
 public void testNGAsserts() throws Exception{
 System.setProperty("webdriver.gecko.driver","C:/Users/Mosarrof Hossain/Utilities/geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
 
 //Test Condition 1: If Page title matches with actual Title then it finds email title and enters the value which we pass
 driver.get("https://www.gmail.com");
 //String actualTitle = "Gmail";
 
 if(driver.getTitle() == "Gmail")
 {
	 System.out.println("The test is Passed and the actual Title is Gmail");
 }
 else 
	 System.out.println("It's Fail");
 Assert.assertEquals(driver.getTitle().contains("Gmail"), true);
 System.out.println(driver.getTitle());
 Thread.sleep(2000); 
 driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("SoftwareTestingMaterial.com");
 //Test Condition 2: If page title didn't match with actualTitle then script throws an exception
 Thread.sleep(2000);
 driver.navigate().back();
 /*driver.get("https://www.gmail.com");
 actualTitle = "GoogleMail";
 Thread.sleep(2000);
 //Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
 Assert.assertEquals(driver.getTitle(), actualTitle);*/
 
 driver.close();
 }
}