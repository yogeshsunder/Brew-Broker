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
public class BuyerSignupPage 
{
	WebDriver driver;
	
	
	public BuyerSignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div[2]/a")
	WebElement clickonSignupasaBuyerbutton;
	
	public void clickonSignupBuyer()
	{
		clickonSignupasaBuyerbutton.click();
	}
	
	@FindBy(how=How.NAME,using="buyer_describes")
	WebElement clickondescribesRadioButton;
	
	public void clickonRadioDescribesButton()
	{
		clickondescribesRadioButton.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div/div[8]/input")
	WebElement clickonContinue;
	
	public void clickContinueDescribes()
	{
		clickonContinue.click();
	}
	
	@FindBy(how=How.ID,using="firstname")
	WebElement entername;
	
	public void enterName(String name)
	{
		entername.sendKeys(name);
	}
	
	@FindBy(how=How.ID,using="brewery")
	WebElement enterBrewery;
	
	public void enterBreweryName(String BName)
	{
		enterBrewery.sendKeys(BName);
	}
	
	@FindBy(how=How.ID,using="emailId")
	WebElement enterEmailid;
	
	public void enterEmail(String email)
	{
		enterEmailid.sendKeys(email);
	}
	
	@FindBy(how=How.ID,using="password")
	WebElement enterPassword;
	
	public void enterpwd(String password)
	{
		enterPassword.sendKeys(password);
	}
	
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div/form/div[6]/input")
	WebElement clickOnSignup;
	
	public void signup()
	{
		clickOnSignup.click();
	}
	
	@FindBy(how=How.CLASS_NAME,using="SupplierRegisterPopup_button_grey_1Mw")
	WebElement clickonBrowseBreweries;
	
	public void browseBreweries()
	{
		clickonBrowseBreweries.click();
	}
	

}
