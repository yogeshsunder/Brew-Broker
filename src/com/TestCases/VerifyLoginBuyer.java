/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;

/**
 * @author ucreate
 *
 */
public class VerifyLoginBuyer {
	
	WebDriver driver;
	
	@Test
	public void main()
	{
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		
		driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button")).click();
	}

}
