package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Yogesh
 *
 */
public class SupplierProfileCreationPage {
	
WebDriver driver;
	
	public SupplierProfileCreationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="address")
	WebElement addressfield;
	
	@FindBy(how=How.ID,using="PlacesAutocomplete__autocomplete-container")
	WebElement clickonaddressinf;

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/button")
	WebElement continueaddress;
	
	@FindBy(how=How.ID,using="service1")
	WebElement clickServicesContractbrewingfromarecipe;
	
	@FindBy(how=How.ID,using="20L-50")
	WebElement clickServicesKegs20;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[9]/input")
	WebElement continueservices;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/label/span")
	WebElement styleporter;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[4]/label/span")
	WebElement stylesour;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[8]/input")
	WebElement continuestyles;
	
	@FindBy(how=How.ID,using="minCapacity")
	WebElement mincapacity;
	
	@FindBy(how=How.ID,using="maxCapacity")
	WebElement maxcapacity;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/input")
	WebElement continuecapacity;
	
	@FindBy(how=How.ID,using="distance0")
	WebElement deliveryno;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/input")
	WebElement deliverycontinue;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/textarea")
	WebElement summary;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/input")
	WebElement continuesummary;
	
	@FindBy(how=How.ID,using="logo-image")
	WebElement clicklogo;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/button")
	WebElement clickonDonelogo;
	
	@FindBy(how=How.ID,using="imgupload_1")
	WebElement clickimage;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div/form/div[5]/input")
	WebElement finish;
		
	
	//Functions --------------------------------------------------------------------------------------------------------------
	
	public void enterAddress(String enteraddress)
	{
		addressfield.sendKeys(enteraddress);
	}
	
	public void clickonAddressinfo()
	{
		clickonaddressinf.click();
	}
	public void addressContinue()
	{
		continueaddress.click();
	}
	
	public void clickserviceContractbrewingfromarecipe()
	{
		clickServicesContractbrewingfromarecipe.click();
	}
	
	public void clickservicesKegs20()
	{
		clickServicesKegs20.click();
	}
	
	public void continueServices()
	{
		continueservices.click();
	}
	
	public void stylePorter()
	{
		styleporter.click();
	}
	
	public void styleSour()
	{
		stylesour.click();
	}
	
	public void continueStyles()
	{
		continuestyles.click();
	}
	
	public void minCapacity(String min)
	{
		mincapacity.sendKeys(min);
	}
	
	public void maxCapacity(String max)
	{
		maxcapacity.sendKeys(max);
	}

	public void continueCapacity()
	{
		continuecapacity.click();
	}
	
	public void deliveryNo()
	{
		deliveryno.click();
	}
	
	public void deliveryContinue()
	{
		deliverycontinue.click();
	}
	
	public void enterSummary(String summry)
	{
		summary.sendKeys(summry);
	}
	
	public void continueSummary()
	{
		continuesummary.click();
	}
	
	public void logoClick()
	{
		clicklogo.click();
	}
	
	public void clicktoConfirmlogoUpload()
	{
		clickonDonelogo.click();
	}
	
	public void imageClick()
	{
		clickimage.click();
	}
	
	public void clickFinish()
	{
		finish.click();
	}
			

}

