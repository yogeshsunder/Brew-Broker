/**
 * 
 */
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.Select;

/**
 * @author Yogesh
 *
 */
public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Request Early Access
	@FindBy(how=How.ID,using="name")
	WebElement entername;
	
	public void enterName(String nme)
	{
		entername.sendKeys(nme);
	}
	
	@FindBy(how=How.ID,using="company")
	WebElement entercompany;
	
	public void enterCompany(String entercomp)
	{
		entercompany.sendKeys(entercomp);
	}
	
	@FindBy(how=How.ID,using="email")
	WebElement enteremail;
	
	public void enterEmail(String Email)
	{
		enteremail.sendKeys(Email);
	}
	
	@FindBy(how=How.ID,using="react-select-2--value")
	WebElement selectRelation;
	
	public void clickRelationdropdown()
	{
		selectRelation.click();
	}
	
	@FindBy(how=How.ID,using="react-select-2--option-3")
	WebElement selectdropdown;
	
	public void clickonDropDown()
	{
		selectdropdown.click();
	}
		
	//public  void selectRelationDropDown() {
	  //    Select drop = new Select(selectRelation);
	    //  drop.selectByValue("I help sell it");  
	//}
	
		
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div/form/div[5]/input")
	WebElement selectAccessButton;
	
	public void requestAcessButton()
	{
		selectAccessButton.click();
	}

}
