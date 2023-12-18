package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {
	WebDriver driver;
//	Parameterization
//	1. Parameter 2. DataProvider
//	Parameter = @Parameter pass the parameter just once per execution.
	
//	Hard Code
//	String browser = "firefox";

	@Parameters("browser")
	@Test
	public void browserLaunch(String browser) {
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
