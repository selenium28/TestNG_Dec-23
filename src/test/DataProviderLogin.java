package test;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {

	@Test(dataProvider = "dataProvider")
	public void loginMethod(String username, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(username);

		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys(pass);

		WebElement SubmitButton = driver.findElement(By.id("submit"));
		SubmitButton.click();

	}

	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data = new Object[2][2];
		
		data[0][0] = "student";
		data[0][1] = "Password123";
		
		data[1][0] = "student";
		data[1][1] = "invalid";
		
		return data;
	}
}
