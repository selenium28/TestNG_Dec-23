package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;

	@Test (priority = 1)
	public void validUserNamePassword() {

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("Password123");

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();
		
		System.out.println("Valid Test scenaio Passed");

	}
	
	@Test (priority = -2)
	public void inValidUserName() {

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("studentInValid");

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("Password123");

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();
		
		System.out.println("inValid Username Test scenaio Passed");

	}
	
	@Test (priority = -3)
	public void inValidPassword() {

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("dfrtegdf");

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();
		
		System.out.println("inValid Passwod Test scenaio Passed");

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
