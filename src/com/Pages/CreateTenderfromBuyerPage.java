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
public class CreateTenderfromBuyerPage {
	
WebDriver driver;
	
	public CreateTenderfromBuyerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//click on Tenders in Buyers Dashboard------------------------------------
	@FindBy(how=How.CLASS_NAME,using="active tender")
	WebElement tendersinDashboard;
	
	public void click_tenders_BuyersDashboard()
	{
		tendersinDashboard.click();
	}
	
	//click on New Tender link in Buyers Dashboard---------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div/div[2]/div[1]/div/a")
	WebElement newtender;
	
	public void click_on_NewTender()
	{
		newtender.click();
	}
	
	//--------------------------------Step1 of Tender Flow-----------------------------------------------------------
	
	//Click on Both brewing & packaging services in services------------------------------
	@FindBy(how=How.ID,using="service3")
	WebElement clickservices;
	
	public void click_on_Services_Both()
	{
		clickservices.click();
	}
	
	//Name/Title of the Tender-------------------------------------------------------------
	@FindBy(how=How.ID,using="title")
	WebElement name;
	
	public void enterName_of_tender(String nme)
	{
		name.sendKeys(nme);
	}
	
	//Brief description of your tender-----------------------------------------------------
	@FindBy(how=How.ID,using="desc")
	WebElement description;
	
	public void enter_Description_of_tender(String dsc)
	{
		description.sendKeys(dsc);
	}
	
	//Click Submit quote by-------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div/div/div/div/div/a")
	WebElement Submitquoteby;
	
	public void click_Submit_quote_by()
	{
		Submitquoteby.click();
	}
	
	//Select Submit quote by date------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div/div/div/div[2]/div/div[2]/div[2]/div[5]/div[4]")
	WebElement selectquoteby;
	
	public void select_quote_by_Date()
	{
		selectquoteby.click();
	}
	
	//Click Deliver contract by-----------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div/div/div/div/a")
	WebElement clicktdeliverby;
	
	public void click_deliver_by()
	{
		clicktdeliverby.click();
	}
	
	//Select Deliver contract by--------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
	WebElement selectdeliverby;
	
	public void select_deliver_by_date()
	{
		selectdeliverby.click();
	}
	
	//Click on Continue of Step 1 of Tender Flow-------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/form/div[5]/div/input[2]")
	WebElement continuestep1;
	
	public void click_continue_step1()
	{
		continuestep1.click();
	}
	
	//--------------------------------Step2 of Tender Flow-----------------------------------------------------------
	
	//Click on Contract brewing from a recipe in Services----------------------------------------------
	@FindBy(how=How.ID,using="Brewingservices1")
	WebElement Contractbrewingfromarecipe;
	
	public void select_Contract_brewing_from_a_recipe()
	{
		Contractbrewingfromarecipe.click();
	}
	
	//Click on Style Lager-----------------------------------------------------------------------------
	@FindBy(how=How.ID,using="style2")
	WebElement lager;
	
	public void click_on_Lager()
	{
		lager.click();
	}
	
	//Enter Desired Abv for Lager-----------------------------------------------------------------------
	@FindBy(how=How.ID,using="2")
	WebElement ABVlager;
	
	public void enter_ABV_for_Lager(String abvLager)
	{
		ABVlager.sendKeys(abvLager);
	}
	
	//Click on I can provide all or some of the ingredients----------------------------------------------
	@FindBy(how=How.ID,using="ingredients2")
	WebElement ingredientsLager;
	
	public void select_ingredients_Lager()
	{
		ingredientsLager.click();
	}
	
	//Click on Continue of Step 2 of Tender Flow-------------------------------------------------------------
		@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
		WebElement continuestep2;
		
		public void click_continue_step2()
		{
			continuestep2.click();
		}
		
		//--------------------------------Step3 of Tender Flow-----------------------------------------------------------
		
		//
		
	
	
	
	
	

}
