/**
 * 
 */
package com.Pages;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button") 
	@CacheLookup
	WebElement login;
	public void login_link() {
		Assert.assertTrue(login.isDisplayed());
		login.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/a/span")
	@CacheLookup
	WebElement brewbroker;
	public void brewbroker_logo() {
		Assert.assertTrue(brewbroker.isDisplayed());
		brewbroker.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement dashboard;
	public void dashboard_link() {
		Assert.assertTrue(dashboard.isDisplayed());
		dashboard.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//a[text()='new tender']")
	@CacheLookup
	WebElement newtender;
	public void newTender() {
		Assert.assertTrue(newtender.isDisplayed());
		newtender.click();
	}
	
	/*===============================================Step One =====================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div[3]/label/span")
	@CacheLookup
	WebElement bothbrewingpackaging;
	
	public void ServiceYouNeedBoth() {
		Assert.assertTrue(bothbrewingpackaging.isDisplayed());
		bothbrewingpackaging.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//input[@id='title']")
	@CacheLookup
	WebElement nametender; 
	public void nameOfTender() {
		Assert.assertTrue(nametender.isDisplayed());
		String uuid = UUID.randomUUID().toString();	
		nametender.sendKeys(uuid);
	}	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//textarea[@id='desc']")
	@CacheLookup
	WebElement description;
	public void descriptionTender() {
		Assert.assertTrue(description.isDisplayed());
		description.sendKeys("Testing tender description. Testing tender description.");	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div/div/a")
	@CacheLookup
	WebElement dateto; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date1;
	
	public void submitQuoteBy() {
		Assert.assertTrue(dateto.isDisplayed());
		dateto.click();	
		Assert.assertTrue(date1.isDisplayed());
		date1.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div/div/div")
	@CacheLookup
	WebElement datefrom;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date2;
	
	public void deliverContractBy() {
		Assert.assertTrue(datefrom.isDisplayed());
		datefrom.click();
		Assert.assertTrue(date2.isDisplayed());
		date2.click();	 
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/form/div[5]/div/input[2]")
	@CacheLookup
	WebElement next;
	
	public void nextForm() {
		Assert.assertTrue(next.isDisplayed());
		next.click();
	}
	   
	/*===============================================Step Two =====================================================*/
	@FindBy(how=How.XPATH,using="//input[@id='Brewingservices3']")
	@CacheLookup
	WebElement contractBrewing;
	public void brewingServices() throws Exception {
		contractBrewing.click();
		Assert.assertTrue(contractBrewing.isEnabled()); Thread.sleep(4000);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/label/span")
	@CacheLookup
	WebElement ales;
	public void style_Ales() throws Exception {
		Assert.assertTrue(ales.isDisplayed()); Thread.sleep(4000);
		ales.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"1\"]")
	@CacheLookup
	WebElement alesABP; 
	public void ales_ABP() throws Exception {
		Assert.assertTrue(alesABP.isDisplayed()); Thread.sleep(4000);
		alesABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div/label/span")
	@CacheLookup
	WebElement alesicanprovide;
	public void ales_icanprovide() throws Exception {
		Assert.assertTrue(alesicanprovide.isDisplayed()); Thread.sleep(4000);
		alesicanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/label/span")
	@CacheLookup
	WebElement lager;
	public void style_lager() {
		Assert.assertTrue(lager.isDisplayed());
		lager.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"2\"]")
	@CacheLookup
	WebElement lagerABP; 
	public void lager_ABP() {
		Assert.assertTrue(lagerABP.isDisplayed());
		lagerABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div/label/span")
	@CacheLookup
	WebElement lagericanprovide; 
	public void lager_icanprovide() {
		Assert.assertTrue(lagericanprovide.isDisplayed());
		lagericanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement formtwocontinue; 
	public void next_Form_two() {
		Assert.assertTrue(formtwocontinue.isDisplayed());
		formtwocontinue.click();
	}
	
	/*===============================================Step Three =====================================================*/
	@FindBy(how=How.XPATH,using="//input[@id='contract1']")
	@CacheLookup
	WebElement oneoff;
	public void contract_type() {
		oneoff.click();
		Assert.assertTrue(oneoff.isEnabled());
	}
	
	//--------------------------------------Entering Ales--------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//input[@id='volume-ales-0']")
	@CacheLookup
	WebElement volume;
	public void volume_ales() {
		 Assert.assertTrue(volume.isDisplayed());
		 volume.sendKeys("40000");
	 }
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-3--value\"]")
	@CacheLookup
	WebElement container; 
	
	@FindBy(how=How.XPATH,using="//*[@id='react-select-3--option-1']")
	@CacheLookup
	WebElement containerbottle; 
	public void container_type() throws Exception {
		Assert.assertTrue(container.isDisplayed());
		container.click();
		containerbottle.click();	
	}
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-4--value\"]")
	@CacheLookup
	WebElement size; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-4--option-3\"]")
	@CacheLookup
	WebElement size355; 
	public void size_type() {
		Assert.assertTrue(size.isDisplayed());
		size.click();
		size355.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-5--value\"]")
	@CacheLookup
	WebElement shape; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-5--option-2\"]")
	@CacheLookup
	WebElement shapeslim;
	public void shape_type() {
		Assert.assertTrue(shape.isDisplayed());
		shape.click();
		shapeslim.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-6--value\"]")
	@CacheLookup
	WebElement color; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-6--option-1\"]")
	@CacheLookup
	WebElement colorblack; 
	public void color_type() throws Exception {
		Assert.assertTrue(color.isDisplayed());
		color.click();
		colorblack.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-7--value\"]")
	@CacheLookup
	WebElement shelflife;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-7--option-2\"]")
	@CacheLookup
	WebElement shelflifeX;
	public void shelflife_type() {
		Assert.assertTrue(shelflife.isDisplayed());
		shelflife.click();
		shelflifeX.click();
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-8--value\"]")
	@CacheLookup
	WebElement labelling;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-8--option-2\"]")
	@CacheLookup
	WebElement labellingX;
	public void labelling_type() {
		Assert.assertTrue(labelling.isDisplayed());
		labelling.click();
		labellingX.click();
	}
	
	//---------------------------------Enter Lager------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"volume-lager-0\"]")
	@CacheLookup
	WebElement volumelager;
	public void volume_lager() {
		 Assert.assertTrue(volume.isDisplayed());
		 volumelager.sendKeys("40000");
	 }
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-8--value\"]")
	@CacheLookup
	WebElement containerlager; 
	
	@FindBy(how=How.XPATH,using="//*[@id='react-select-8--option-1']")
	@CacheLookup
	WebElement containerbottlelager; 
	public void container_typelager() throws Exception {
		Assert.assertTrue(container.isDisplayed());
		containerlager.click();
		containerbottlelager.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-9--value\"]")
	@CacheLookup
	WebElement sizelager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-9--option-3\"]")
	@CacheLookup
	WebElement size355lager; 
	public void size_typelager() {
		Assert.assertTrue(size.isDisplayed());
		sizelager.click();
		size355lager.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-16--value\"]")
	@CacheLookup
	WebElement shapelager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-16--option-2\"]")
	@CacheLookup
	WebElement shapeslimlager;
	public void shape_typelager() {
		Assert.assertTrue(shape.isDisplayed());
		shapelager.click();
		shapeslimlager.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-17--value\"]")
	@CacheLookup
	WebElement colorlager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-17--option-1\"]")
	@CacheLookup
	WebElement colorblacklager; 
	public void color_typelager() throws Exception {
		Assert.assertTrue(color.isDisplayed());
		colorlager.click();
		colorblacklager.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-18--value\"]")
	@CacheLookup
	WebElement shelflifelager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-18--option-2\"]")
	@CacheLookup
	WebElement shelflifeXlager;
	public void shelflife_typelager() {
		Assert.assertTrue(shelflife.isDisplayed());
		shelflifelager.click();
		shelflifeXlager.click();
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-19--value\"]")
	@CacheLookup
	WebElement labellinglager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-19--option-2\"]")
	@CacheLookup
	WebElement labellingXlager;
	public void labelling_typelager() {
		Assert.assertTrue(labelling.isDisplayed());
		labellinglager.click();
		labellingXlager.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[2]/div/div[3]/label")
	@CacheLookup
	WebElement provideall; 
	public void tickales() {
		provideall.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[3]/div/div[3]/label/span")
	@CacheLookup
	WebElement providealllager; 
	public void ticklager() {
		providealllager.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[4]/input[2]")
	@CacheLookup
	WebElement continuethreestep; 
	public void continue_step_three() {
		continuethreestep.click();
		
	}
	
	/*=================================Step Four=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label")
	@CacheLookup
	WebElement duty; 
	public void duty() {
		duty.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefourstep; 
	public void duty_continue() {
		continuefourstep.click();
	}
	
	/*=================================Step Five=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement arrangecollection;
	public void arrange_collection() {
		arrangecollection.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"PlacesAutocomplete__root\"]/input")
	@CacheLookup
	WebElement town; 
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[1]/label/span")
	@CacheLookup
	WebElement storage;
	public void storage_click() {
		storage.click();		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement ambient;
	public void ambient_click() {	
		ambient.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration; 
	public void duration_click() {	
		duration.click();
		duration.sendKeys("10 days");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefivestep; 
	public void stepfive_sontinue() {
		continuefivestep.click();
	}
	
	/*=================================Step Six=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/label/span")
	@CacheLookup
	WebElement standardone; 
		
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/label/span")
	@CacheLookup
	WebElement standardtwo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/label/span")
	@CacheLookup
	WebElement standardthree; 
	public void standards() {
		standardone.click();
		standardtwo.click();
		standardthree.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="qualification1")
	@CacheLookup
	WebElement qualione; 
	
	@FindBy(how=How.ID,using="qualification2")
	@CacheLookup
	WebElement qualitwo; 
	
	@FindBy(how=How.ID,using="qualification3")
	@CacheLookup
	WebElement qualithree; 
	public void qualifications(){
		qualione.click();
		qualitwo.click();
		qualithree.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="communication1")
	@CacheLookup
	WebElement communication;
	public void communication() {
		communication.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/input[2]")
	@CacheLookup
	WebElement continuesixstep;
	public void stepsix_continue() {
		continuesixstep.click();
	}
	
	/*=================================Step Seven=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement continuesevenstep;
	public void continue_step_seven() {	
		continuesevenstep.click();
	}
	
	/*=================================Step Seven=========================================================================*/
	@FindBy(how=How.CLASS_NAME,using="suuplierstext")
	WebElement text;
	public void clicktext()
	{
		text.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"matched42\"]")
	WebElement MoorhouseBrewery;
	public void selectMoorhouseBrewery()
	{
		MoorhouseBrewery.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="46")
	WebElement Bhopstuff;
	public void selectBhopstuff()
	{
		Bhopstuff.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="47")
	WebElement createBrewery;
	public void selectCreateBrwery()
	{
		createBrewery.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/input")
	WebElement submit;
	public void submitTender()
	{
		submit.click();
	}

				
	
		
	
		
	
		
}
