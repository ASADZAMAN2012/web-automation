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
		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.barnesandnoble.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}

}
