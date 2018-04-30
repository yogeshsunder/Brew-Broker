/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yogesh
 *
 */
public class SupplierSignupPage {
	
	WebDriver driver;
	
	public SupplierSignupPage(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	//WebElement for profile Thumbnail link on HomePage
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/section[2]/div[2]/div/div/div/a[4]/div")
	WebElement profileinfo;
	
	public void clickonProfileinfo()
	{
		profileinfo.click();
	}
	
	
	//WebElement for Join link on Supplier Profile Page
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[1]/div/div[2]/div[2]/div/div[2]/button")
	WebElement clickJoin;
	
	public void clickonJoin()
	{
		clickJoin.click();
	}
	
	//WebElement for click on signup as Supplier
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div[3]/a")
	WebElement clickonSignupasSupplier;
	
	public void clickonSupplierSignup()
	{
		clickonSignupasSupplier.click();
	}
	
	//
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[2]")
	WebElement clickonWhatDescribesyou;
	
	public void clickonDescribes()
	{
		clickonWhatDescribesyou.click();
	}
	
	//
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/div[8]/input")
	WebElement clickonDescribeContinue;
	
	public void clickonContinueDescribe()
	{
		clickonDescribeContinue.click();
	}
	
	
	//WebElement for Email Id on Sign Up form
	@FindBy(how=How.ID,using="emailId")
	WebElement sendEmail;
	
	public void email(String email)
	{
		sendEmail.sendKeys(email);
	}
	
	//WebElement for First Name on Sign Up form
	@FindBy(how=How.ID,using="firstname")
	WebElement enterfistname;
	
	public void firstname(String enterfname)
	{
		enterfistname.sendKeys(enterfname);
	}
	
	//WebElement for Last Name on Sign Up form
	@FindBy(how=How.ID,using="lastname")
	WebElement enterlastname;
	
	public void lastname(String enterlname)
	{
		enterlastname.sendKeys(enterlname);
	}
	
	//WebElement for Brewery Name on Sign Up form
	@FindBy(how=How.ID,using="brewery")
	WebElement enterbreweryname;
	
	public void breweryname(String enterbname)
	{
		enterbreweryname.sendKeys(enterbname);
	}
	
	//WebElement for Password on Sign Up form
	@FindBy(how=How.ID,using="password")
	WebElement enterpassword;
	
	public void password(String pwd)
	{
		enterpassword.sendKeys(pwd);
	}	
	
	//WebElement for Confirm License check box on Sign Up form
	@FindBy(how=How.ID,using="confirm")
	WebElement confirmlicense;
	
	public void license()
	{
		confirmlicense.click();
	}	
	
	//WebElement for Sign Up Button on Sign Up form
	@FindBy(how=How.ID,using="signup-submit-btn")
	WebElement clickonSignup;
	
	public void clickSignup()
	{		
		clickonSignup.click();
	}
	
	//WebElement for Blank Email validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[1]/span")
	WebElement emailValidation;
	
	public String validateemail()
	{
		return emailValidation.getText();
	}
	
	//WebElement for Email Validation Error Message for Already Taken email id
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[1]/span")
	WebElement emailalreadyTaken;
	
	public String validatealreadytakenemail()
	{
		return emailalreadyTaken.getText();
	}
	
	//WebElement for First Name validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[2]/span")
	WebElement firstNameValidation;
		
	public String validatefirstname()
	{
		return firstNameValidation.getText();
	}
	
	//WebElement for Last Name validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[3]/span")
	WebElement lastNameValidation;
			
	public String validatelastname()
	{
		return lastNameValidation.getText();
	}
	
	//WebElement for Brewery Name validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[4]/span")
	WebElement breweryNameValidation;
				
	public String validatebreweryname()
	{
		return breweryNameValidation.getText();
	}
		
	//WebElement for Blank Password Name validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[5]/div[1]/span")
	WebElement blankpasswordValidation;
						
	public String validateblankpasswordyname()
	{
		return blankpasswordValidation.getText();
	}
	
	//WebElement for Valid Password Name validation Error Message
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/form/div[5]/div[1]/span")
	WebElement validpasswordValidation;
							
	public String validatevalidpasswordyname()
	{
		return validpasswordValidation.getText();
	}
	
	//WebElement for Create your Profile
	@FindBy(how=How.CLASS_NAME,using="SupplierRegisterPopup_button_1uE")
	WebElement createProfile;
	
	public void createprofile()
	{
		createProfile.click();
	}

}
