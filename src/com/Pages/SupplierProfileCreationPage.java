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
	
	public void enterAddress(String enteraddress)
	{
		addressfield.sendKeys(enteraddress);
	}
	
	@FindBy(how=How.ID,using="PlacesAutocomplete__autocomplete-container")
	WebElement clickonaddressinf;
	
	public void clickonAddressinfo()
	{
		clickonaddressinf.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div[1]/div[4]/button[2]")
	WebElement continueaddress;
	
	public void addressContinue()
	{
		continueaddress.click();
	}
	
	//Step 3 i.e. Brewing services----------------------------------------------
	
	@FindBy(how=How.ID,using="service1")
	WebElement clickServicesContractbrewingfromarecipe;
	
	public void clickserviceContractbrewingfromarecipe()
	{
		clickServicesContractbrewingfromarecipe.click();
	}
	
	@FindBy(how=How.ID,using="20L-50")
	WebElement clickServicesKegs20;
	
	public void clickservicesKegs20()
	{
		clickServicesKegs20.click();
	}
	
	@FindBy(how=How.ID,using="brew1")
	WebElement clickonAles;
	
	public void clickonStyleAles()
	{
		clickonAles.click();
	}
	
	@FindBy(how=How.ID,using="brew3")
	WebElement styleporter;
	
	public void clickonstylePorter()
	{
		styleporter.click();
	}
	
	@FindBy(how=How.ID,using="brew4")
	WebElement stylesour;
	
	public void styleSour()
	{
		stylesour.click();
	}
	
	@FindBy(how=How.ID,using="visit0")
	WebElement clickBreweryvisit;
	
	public void clickonYesBreweryVisit()
	{
		clickBreweryvisit.click();
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[14]/input")
	WebElement continueservices;
	
	public void continueServices()
	{
		continueservices.click();
	}	
	
	//Step 4 i.e. Brewing capacity-----------------------------------------
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/input")
	WebElement annualcapacity;
	
	public void enterAnnualCapacity(String annualcap)
	{
		annualcapacity.sendKeys(annualcap);
	}
	
	@FindBy(how=How.ID,using="minCapacity")
	WebElement mincapacity;
	
	public void minCapacity(String min)
	{
		mincapacity.sendKeys(min);
	}
	
	@FindBy(how=How.ID,using="maxCapacity")
	WebElement maxcapacity;
	
	public void maxCapacity(String max)
	{
		maxcapacity.sendKeys(max);
	}
	
	@FindBy(how=How.ID,using="ongoingBrew0")
	WebElement ongoingcontract;
	
	public void clickonfacilitateongoingcontractbrewsYes()
	{
		ongoingcontract.click();
	}
	
	
	@FindBy(how=How.ID,using="oneoffBrew0")
	WebElement oneoffBrew;
	
	public void clickononeoffBrew()
	{
		oneoffBrew.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[7]/input")
	WebElement continuecapacity;
	
	public void continueCapacity()
	{
		continuecapacity.click();
	}
	
	//Step 5 i.e. Packaging------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
	WebElement PackagingContinue;
	
	public void clickonPackagingContinue()
	{
		PackagingContinue.click();
	}
	
	
	//Step 6 i.e. Logistics------------------------------------------------------
	
	@FindBy(how=How.ID,using="delivery1")
	WebElement deliveryYes;
	
	public void clickonDeliveryYes()
	{
		deliveryYes.click();
	}
	
	@FindBy(how=How.ID,using="service2")
	WebElement warehousing;
	
	public void clickonWarehousingNo()
	{
		warehousing.click();
	}
	
	@FindBy(how=How.ID,using="bonded1")
	WebElement bondedstorage;
	
	public void clickonBondedStorageYes()
	{
		bondedstorage.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div[7]/div/input")
	WebElement deliverycontinue;
	
	public void deliveryContinue()
	{
		deliverycontinue.click();
	}
	
	//Step 7 i.e. Duty---------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/input")
	WebElement HMRCregistration;
	
	public void enterHMRCregistration(String registration)
	{
		HMRCregistration.sendKeys(registration);
	}
	
	@FindBy(how=How.ID,using="hrmcClasses1")
	WebElement classA;
	
	public void clickonClassAHMRCregistration()
	{
		classA.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[6]/input")
	WebElement duty;
	
	public void clickonContinueDuty()
	{
		duty.click();
	}
	
	//Step 8 i.e. Accrediations and qualification--------------------------------------
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div[8]/div/input")
	WebElement Accrediations;
	
	public void clickonAccrediationsContinue()
	{
		Accrediations.click();
	}
	
	
	//Step 9 i.e. Summary---------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/textarea")
	WebElement summary;
	
	public void enterSummary(String summry)
	{
		summary.sendKeys(summry);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/form/div[2]/input")
	WebElement continuesummary;
	
	public void continueSummary()
	{
		continuesummary.click();
	}
	
	//Step 10 i.e. Logo, photos & videos---------------------------------------------------------------
	
	@FindBy(how=How.ID,using="logo-image")
	WebElement clicklogo;
	
	public void logoClick()
	{
		clicklogo.click();
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/button")
	WebElement clickonDonelogo;
	
	public void clicktoConfirmlogoUpload()
	{
		clickonDonelogo.click();
	}
	
	@FindBy(how=How.ID,using="imgupload_1")
	WebElement clickimage;
	
	public void imageClick()
	{
		clickimage.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/form/div[4]/input")
	WebElement finish;
	
	public void clickFinish()
	{
		finish.click();
	}
			

}

