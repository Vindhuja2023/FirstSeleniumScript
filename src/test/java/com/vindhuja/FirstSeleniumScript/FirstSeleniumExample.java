package com.vindhuja.FirstSeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumExample {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	@Test
	public void sampleTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("Vindhuja");;
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Venugopal");;
		
	}
}
