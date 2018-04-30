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
public class AdminAddBuyerPage {
	
	WebDriver driver;
	
	public AdminAddBuyerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/ul/li[4]/a")
	WebElement clickaddbuyer;
	
	public void clickonAddbuyer()
	{
		clickaddbuyer.click();
	}
	
		
	@FindBy(how=How.NAME,using="email")
	WebElement enteremail;
	
	public void enterEmailid(String emailid)
	{
		enteremail.clear();
		enteremail.sendKeys(emailid);
	}
	
	@FindBy(how=How.ID,using="buyerFirstName")
	WebElement entrname;
	
	public void enterName(String name)
	{
		entrname.clear();
		entrname.sendKeys(name);
	}
	
	@FindBy(how=How.ID,using="buyerCompanyName")
	WebElement entrCname;
	
	public void enterCompanyName(String cname)
	{
		entrCname.clear();
		entrCname.sendKeys(cname);
	}
	
	@FindBy(how=How.ID,using="buyerPassword")
	WebElement entrpwd;
	
	public void enterTemperaryPassword(String pwd)
	{
		entrpwd.clear();
		entrpwd.sendKeys(pwd);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/form/div[2]/div[5]/label/span")
	WebElement clickbestdescribe;
	
	public void clickOnBestDescribe()
	{
		clickbestdescribe.click();
	}
	
	@FindBy(how=How.ID,using="signup-submit-btn")
	WebElement submit;
	
	public void clickonSubmit()
	{
		submit.click();
	}


}
