package com.automation.web.pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.automation.locators.Locators;

public class LoginPage_MMT_Test {
	public WebDriver driver;
	
	@BeforeClass
	public void base()
	{
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	@Test
	public void Verify_LoginPageOptions() throws InterruptedException
	{	
			Locators.LoginPageElement.lnk_LognPageNavigate(driver).click();
			Thread.sleep(5000);
	}
}
