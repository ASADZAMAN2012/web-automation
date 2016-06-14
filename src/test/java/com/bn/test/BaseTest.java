package com.bn.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	public WebDriver driver;
	
	@Before
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/isratkhan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://52.35.94.10/register/");
		driver.manage().window().maximize();
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}

}
