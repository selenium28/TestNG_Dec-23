package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestScenario {

	WebDriver driver;

	@Test (priority = 1)
	public void loginTestCase() {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("Password123");

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();

		System.out.println("Login Scenaio Passed");
	}

	@Test (priority = 2)
	public void logoutTestCase() {
		WebElement logOutButtonLink = driver.findElement(By.linkText("Log out"));
		logOutButtonLink.click();
		
		System.out.println("Logout Scenaio Passed");
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
