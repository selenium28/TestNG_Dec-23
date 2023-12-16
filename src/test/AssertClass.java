package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertClass {

	WebDriver driver;

	@Test 
	public void loginTestCase() {
//		String actualMsg = "Logged In Successfully | Practice Test Automation";
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("Password123");

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();
		
//		WebElement logOutButtonLink = driver.findElement(By.linkText("Log out"));
//		logOutButtonLink.isDisplayed();
//		
//		String expectedMsg = driver.getTitle();
//		System.out.println(expectedMsg);
//		if (actualMsg.equals(expectedMsg)) {
//			System.out.println("Title matched & Login Scenaio Passed");
//		} else {
//			System.out.println("Title not matched & Login Scenaio Failed");
//		}
		
		org.testng.Assert.assertEquals("Logged In Successfully | Practice Test Automation", driver.getTitle(), "Login failed");
		
	}

	@Test (dependsOnMethods = "loginTestCase")
	public void logoutTestCase() {
		WebElement logOutButtonLink = driver.findElement(By.linkText("Log out"));
		logOutButtonLink.click();
		
		System.out.println("Logout Scenaio Passed");
		
		
	}
	
	@Test (dependsOnMethods = "logoutTestCase")
	public void loginVerification() {
		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.isDisplayed();
		
		System.out.println("Login Button Displayed ");
	}

	@BeforeTest
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
	}


}
