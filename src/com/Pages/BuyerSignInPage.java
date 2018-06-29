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
public class BuyerSignInPage {
	
	WebDriver driver;
	
	public BuyerSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//
	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button")
	WebElement clicklogin;
	
	public void clickonLoginhomepage()
	{
		clicklogin.click();
	}
	
	//
	@FindBy(how=How.NAME,using="loginemail")
	WebElement email;
	
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	@FindBy(how=How.NAME,using="loginpassword")
	WebElement pwd;
	
	public void enterPassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div/div/div/div/div[4]/input")
	WebElement login;
	
	public void clickLoginButton()
	{
		login.click();
	}

}
