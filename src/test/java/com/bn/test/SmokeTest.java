package com.bn.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest
{
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(6000);
	}
	@Test
	 public void myAccount() throws InterruptedException
	 {
		 driver.findElement(By.id("myAccountLink")).click();
		 Thread.sleep(5000);
		 
	 }

}
