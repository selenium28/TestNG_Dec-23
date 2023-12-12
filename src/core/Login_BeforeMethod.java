package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login_BeforeMethod {
	WebDriver driver;
	
 
  public void testCaseOne() {
	 String title =  driver.getTitle();
	 System.out.println("TestCaseOne" + title);
  }
  
  @Test
  public void testCaseTwo() {
	  System.out.println("testCaseTwo");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	    driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
