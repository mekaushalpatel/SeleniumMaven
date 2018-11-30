package com.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	public static class LoginPageElement { // Login page elements
		
		public static WebElement lnk_LognPageNavigate(WebDriver driver)
		{
			WebElement element =null;
			element = driver.findElement(By.id("ch_login_icon"));
			return element;
		}
		
		public static WebElement txt_Email(WebDriver driver)
		{
			WebElement element =null;
			element = driver.findElement(By.id("ch_login_email"));
			return element;
		}
	}
}
