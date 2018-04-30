/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yogesh
 *
 */
public class AdminSignInPage {
	
	WebDriver driver;
	
	public AdminSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="email")
	WebElement Email;
	
	public void enterEmail(String emailid)
	{
		Email.sendKeys("ben@brewbroker.co.uk");
	}
	
	@FindBy(how=How.NAME,using="password")
	WebElement Password;
	
	public void enterPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/form/div/div/div[3]/input")
	WebElement clickLogin;
	
	public void clickOnLogin()
	{
		clickLogin.click();
	}

}
