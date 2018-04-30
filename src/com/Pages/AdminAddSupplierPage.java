/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author ucreate
 *
 */
public class AdminAddSupplierPage {
	
	WebDriver driver;
	
	public AdminAddSupplierPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/ul/li[2]/a")
	WebElement clickAddsupplier;
	
	public void clickonAddSupplier()
	{
		clickAddsupplier.click();
	}
	
	@FindBy(how=How.NAME,using="email")
	WebElement name;
	
	public void enterEmail(String Email)
	{
		name.clear();
		name.sendKeys(Email);
	}
	
	@FindBy(how=How.NAME,using="firstName")
	WebElement enterfname;
	
	public void enterFirstName(String fname)
	{
		enterfname.clear();
	enterfname.sendKeys(fname);
	}
	
	@FindBy(how=How.NAME,using="lastName")
	WebElement lname;
	
	public void enterLastName(String lastname)
	{
		lname.clear();
	lname.sendKeys(lastname);
	}
	
	@FindBy(how=How.NAME,using="breweryName")
	WebElement breweryname;
	
	public void enterBreweryName(String bname)
	{
		breweryname.clear();
	breweryname.sendKeys(bname);
	}
	
	@FindBy(how=How.ID,using="address")
	WebElement enteraddrs;
	
	public void enterAddress(String addrs)
	{
		enteraddrs.clear();
		enteraddrs.sendKeys(addrs);
	}
	
	@FindBy(how=How.ID,using="PlacesAutocomplete__autocomplete-container")
	WebElement clickonaddressinf;
	
	public void clickonAddressinfo()
	{
		clickonaddressinf.click();
	} 
	
	@FindBy(how=How.NAME,using="postalCode")
	WebElement postcode;
	
	public void enterPostCode(String pcode)
	{
		postcode.sendKeys(pcode);
	}
	
	@FindBy(how=How.NAME,using="service_list")
	WebElement service;
	
	public void selectService()
	{
		service.click();
	}
	
	@FindBy(how=How.ID,using="packaging0")
	WebElement clickCanning;
	
	public void clickonCanning()
	{
		clickCanning.click();
	}
	
	@FindBy(how=How.ID,using="Canning0")
	WebElement click330;
	
	public void clickon330ml()
	{
		click330.click();
	}
	
	@FindBy(how=How.NAME,using="min")
	WebElement selectmin;
	
	public void selectMinCapacity(String mincap)
	{
		selectmin.clear();
		selectmin.sendKeys(mincap);
	}
	
	@FindBy(how=How.NAME,using="max")
	WebElement selectmax;
	
	public void selectMaxCapacity(String maxcap)
	{
		selectmax.clear();
		selectmax.sendKeys(maxcap);
	}
	
	@FindBy(how=How.ID,using="distance0")
	WebElement selectdel;
	
	public void selectDelivery()
	{
		selectdel.click();
	}
	
	@FindBy(how=How.ID,using="Ales")
	WebElement selectstyl;
	
	public void selectStyleAles()
	{
		selectstyl.click();
	}
	
	@FindBy(how=How.ID,using="Lager")
	WebElement selectslgr;
	
	public void selectStyleLager()
	{
		selectslgr.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/div/div[3]/div[1]/textarea")
	WebElement bio;
	
	public void enterBio(String entrbio)
	{
		bio.clear();
		bio.sendKeys(entrbio);
	}
	
	@FindBy(how=How.CLASS_NAME,using="AddSupplierForm_logoContainer_2d2")
	WebElement logoupload;
	
	public void clickonUploadLogo()
	{
		logoupload.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/button")
	WebElement clicldone;
	
	public void clickOnDoneofLogoUpload()
	{
		clicldone.click();
	}
	
	@FindBy(how=How.CLASS_NAME,using="AddSupplierForm_addPictureButton_2tw")
	WebElement imageupload;
	
	public void clickonUploadimage()
	{
		imageupload.click();
	}
	
	@FindBy(how=How.ID,using="welcomeEmail0")
	WebElement clickwelcomeemail;
	
	public void clickonIssueWelcomeEmail()
	{
		clickwelcomeemail.click();
	}
	
	@FindBy(how=How.NAME,using="password")
	WebElement entertemppassword;
	
	public void enterTemporaryPassword(String entertmppws)
	{
		entertemppassword.sendKeys(entertmppws);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/div/div[3]/div[5]/button")
	WebElement clicksubmit;
	
	public void clickOnSubmit()
	{
		clicksubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/button")
	WebElement clickOk;
	
	public void clickOnSuccess()
	{
		clickOk.click();
	}
	

}
