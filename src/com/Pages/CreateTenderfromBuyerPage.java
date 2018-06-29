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
	
	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button") 
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.XPATH,using="//input[@name='loginemail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='loginpassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div[4]/input")
	@CacheLookup
	WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/a/span")
	@CacheLookup
	WebElement brewbroker;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement dashboard;
	
	@FindBy(how=How.XPATH,using="//a[text()='new tender']")
	@CacheLookup
	WebElement newtender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div[3]/label/span")
	@CacheLookup
	WebElement bothbrewingpackaging;
	
	@FindBy(how=How.XPATH,using="//input[@id='title']")
	@CacheLookup
	WebElement nametender; 
	
	@FindBy(how=How.XPATH,using="//textarea[@id='desc']")
	@CacheLookup
	WebElement description;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div/div/a")
	@CacheLookup
	WebElement dateto; 
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div/div/div")
	@CacheLookup
	WebElement datefrom;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[4]/div[5]")
	@CacheLookup
	WebElement date1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/form/div[5]/div/input[2]")
	@CacheLookup
	WebElement next;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date2;   
	
	@FindBy(how=How.XPATH,using="//input[@id='Brewingservices3']")
	@CacheLookup
	WebElement contractBrewing;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/label/span")
	@CacheLookup
	WebElement ales;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"1\"]")
	@CacheLookup
	WebElement alesABP; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div/label/span")
	@CacheLookup
	WebElement alesicanprovide;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/label/span")
	@CacheLookup
	WebElement lager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"2\"]")
	@CacheLookup
	WebElement lagerABP; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div/label/span")
	@CacheLookup
	WebElement lagericanprovide; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement formtwocontinue; 
	
	@FindBy(how=How.XPATH,using="//input[@id='contract1']")
	@CacheLookup
	WebElement oneoff;
	
	@FindBy(how=How.XPATH,using="//input[@id='volume-ales-0']")
	@CacheLookup
	WebElement volume;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-3--value-item\"]")
	@CacheLookup
	WebElement container; 
	
	@FindBy(how=How.XPATH,using="//*[@id='react-select-3--option-1']")
	@CacheLookup
	WebElement containerbottle; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-4--value\"]")
	@CacheLookup
	WebElement size; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-4--option-3\"]")
	@CacheLookup
	WebElement size355; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-5--value\"]")
	@CacheLookup
	WebElement shape; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-5--option-2\"]")
	@CacheLookup
	WebElement shapeslim;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-6--value\"]")
	@CacheLookup
	WebElement color; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-6--option-1\"]")
	@CacheLookup
	WebElement colorblack; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-7--value\"]")
	@CacheLookup
	WebElement shelflife;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-7--option-2\"]")
	@CacheLookup
	WebElement shelflifeX;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-8--value\"]")
	@CacheLookup
	WebElement labelling;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-8--option-2\"]")
	@CacheLookup
	WebElement labellingX;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"volume-lager-0\"]")
	@CacheLookup
	WebElement volumelager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-9--value-item\"]")
	@CacheLookup
	WebElement containerlager; 
	
	@FindBy(how=How.XPATH,using="//*[@id='react-select-9--option-1']")
	@CacheLookup
	WebElement containerbottlelager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-10--value\"]")
	@CacheLookup
	WebElement sizelager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-10--option-3\"]")
	@CacheLookup
	WebElement size355lager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-11--value\"]")
	@CacheLookup
	WebElement shapelager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-11--option-2\"]")
	@CacheLookup
	WebElement shapeslimlager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-12--value\"]")
	@CacheLookup
	WebElement colorlager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-12--option-1\"]")
	@CacheLookup
	WebElement colorblacklager; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-13--value\"]")
	@CacheLookup
	WebElement shelflifelager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-13--option-2\"]")
	@CacheLookup
	WebElement shelflifeXlager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-14--value\"]")
	@CacheLookup
	WebElement labellinglager;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-14--option-2\"]")
	@CacheLookup
	WebElement labellingXlager;

	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[2]/div/div[3]/label")
	@CacheLookup
	WebElement provideall; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[3]/div/div[3]/label/span")
	@CacheLookup
	WebElement providealllager; 
		
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[4]/input[2]")
	@CacheLookup
	WebElement continuethreestep; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label")
	@CacheLookup
	WebElement duty; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefourstep; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement arrangecollection;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"PlacesAutocomplete__root\"]/input")
	@CacheLookup
	WebElement town; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[1]/label/span")
	@CacheLookup
	WebElement storage; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement ambient;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefivestep; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/label/span")
	@CacheLookup
	WebElement standardone; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/label/span")
	@CacheLookup
	WebElement standardtwo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/label/span")
	@CacheLookup
	WebElement standardthree; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div[1]/label/span")
	@CacheLookup
	WebElement qualione; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div[2]/label/span")
	@CacheLookup
	WebElement qualitwo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div[3]/label/span")
	@CacheLookup
	WebElement qualithree; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/div/label/span")
	@CacheLookup
	WebElement communication;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/input[2]")
	@CacheLookup
	WebElement continuesixstep;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement continuesevenstep; 

		public  void login_brew(String emailid, String pass) {
			Assert.assertTrue(email.isDisplayed());
			email.sendKeys(emailid);
			Assert.assertTrue(password.isDisplayed());
			password.sendKeys(pass);
			loginbutton.click();			
		}

		public void close_browser() {
			driver.quit();
		}
		
		public void newTender() {
			Assert.assertTrue(newtender.isDisplayed());
			newtender.click();
		}
		
		public void ServiceYouNeedBoth() {
			Assert.assertTrue(bothbrewingpackaging.isDisplayed());
			bothbrewingpackaging.click();
		}
	
		public void brewbroker_logo() {
			Assert.assertTrue(brewbroker.isDisplayed());
			brewbroker.click();
		}
	
		public void dashboard_link() {
			Assert.assertTrue(dashboard.isDisplayed());
			dashboard.click();
		}
	
		public void login_link() {
			Assert.assertTrue(login.isDisplayed());
			login.click();
		}

		public void nameOfTender() {
			Assert.assertTrue(nametender.isDisplayed());
			String uuid = UUID.randomUUID().toString();	
			nametender.sendKeys(uuid);
		}				
		
		public void descriptionTender() {
			Assert.assertTrue(description.isDisplayed());
			description.sendKeys("Testing tender description. Testing tender description.");	
		}
		
		public void submitQuoteBy() {
			Assert.assertTrue(dateto.isDisplayed());
			dateto.click();	
			Assert.assertTrue(date1.isDisplayed());
			date1.click();
		}
		
		public void deliverContractBy() {
			Assert.assertTrue(datefrom.isDisplayed());
			datefrom.click();
			Assert.assertTrue(date2.isDisplayed());
			date2.click();
		 
		}
		
		public void nextForm() {
			Assert.assertTrue(next.isDisplayed());
			next.click();
		}
		
		public void brewingServices() throws Exception {
			contractBrewing.click();
			Assert.assertTrue(contractBrewing.isEnabled()); Thread.sleep(4000);
		}
		
		public void style_Ales() throws Exception {
			Assert.assertTrue(ales.isDisplayed()); Thread.sleep(4000);
			ales.click();	
		}
		
		public void ales_ABP() throws Exception {
			Assert.assertTrue(alesABP.isDisplayed()); Thread.sleep(4000);
			alesABP.sendKeys("40");
		}
		
		public void ales_icanprovide() throws Exception {
			Assert.assertTrue(alesicanprovide.isDisplayed()); Thread.sleep(4000);
			alesicanprovide.click();
		}
		
		public void style_lager() {
			Assert.assertTrue(lager.isDisplayed());
			lager.click();	
		}
		
		public void lager_ABP() {
			Assert.assertTrue(lagerABP.isDisplayed());
			lagerABP.sendKeys("40");
		}
		
		public void lager_icanprovide() {
			Assert.assertTrue(lagericanprovide.isDisplayed());
			lagericanprovide.click();
		}
		
		public void next_Form_two() {
			Assert.assertTrue(formtwocontinue.isDisplayed());
			formtwocontinue.click();
		}
		
		public void contract_type() {
			oneoff.click();
			Assert.assertTrue(oneoff.isEnabled());
		}
		 public void volume_ales() {
			 Assert.assertTrue(volume.isDisplayed());
			 volume.sendKeys("40000");
		 }
		 
		public void container_type() throws Exception {
			Assert.assertTrue(container.isDisplayed());
			container.click();
			containerbottle.click();	
		}
		
		public void size_type() {
			Assert.assertTrue(size.isDisplayed());
			size.click();
			size355.click();
		}
		
		public void shape_type() {
			Assert.assertTrue(shape.isDisplayed());
			shape.click();
			shapeslim.click();
		}
		
		public void shelflife_type() {
			Assert.assertTrue(shelflife.isDisplayed());
			shelflife.click();
			shelflifeX.click();
			
		}
		public void color_type() throws Exception {
			Assert.assertTrue(color.isDisplayed());
			color.click();
			colorblack.click();
		}
		
		public void labelling_type() {
			Assert.assertTrue(labelling.isDisplayed());
			labelling.click();
			labellingX.click();
		}
		
		public void volume_lager() {
			 Assert.assertTrue(volume.isDisplayed());
			 volumelager.sendKeys("40000");
		 }
		 
		public void container_typelager() throws Exception {
			Assert.assertTrue(container.isDisplayed());
			containerlager.click();
			containerbottlelager.click();	
		}
		
		public void size_typelager() {
			Assert.assertTrue(size.isDisplayed());
			sizelager.click();
			size355lager.click();
		}
		
		public void shape_typelager() {
			Assert.assertTrue(shape.isDisplayed());
			shapelager.click();
			shapeslimlager.click();
		}
		
		public void shelflife_typelager() {
			Assert.assertTrue(shelflife.isDisplayed());
			shelflifelager.click();
			shelflifeXlager.click();
			
		}
		public void color_typelager() throws Exception {
			Assert.assertTrue(color.isDisplayed());
			colorlager.click();
			colorblacklager.click();
		}
		
		public void labelling_typelager() {
			Assert.assertTrue(labelling.isDisplayed());
			labellinglager.click();
			labellingXlager.click();
		}
		
		public void duty() {
			duty.click();
		}
		
		public void duty_continue() {
			continuefourstep.click();
		}
		
		public void arrange_collection() {
			arrangecollection.click();
		}
		
		public void storage_click() {
			storage.click();		
		}
		
		public void ambient_click() {	
			ambient.click();
		}
		
		public void duration_click() {	
			duration.click();
			duration.sendKeys("10 days");
		}
		
		public void stepfive_sontinue() {
			continuefivestep.click();
		}
		
		public void standards() {
			standardone.click();
			standardtwo.click();
			standardthree.click();
		}
		
		public void qualifications(){
			qualione.click();
			qualitwo.click();
			qualithree.click();
		}
		
		public void communication() {
			communication.click();
		}
		
		public void continue_step_seven() {	
			continuesevenstep.click();
		}


		public void stepsix_continue() {
			continuesixstep.click();
		}


		public void continue_step_three() {
			continuethreestep.click();
			
		}

		public void tickales() {
			provideall.click();	
		}

		public void ticklager() {
			providealllager.click();
		}

}
