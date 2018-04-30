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
public class AdminEditSupplierPage {
	
	WebDriver driver;
	
	public AdminEditSupplierPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[1]/ul/li[1]/a")
	WebElement clickSupplier;
	
	public void cilckOnSupplier()
	{
		clickSupplier.click();
	}
	
	@FindBy(how=How.NAME,using="select_uyer")
	WebElement selectsupplier;
	
	public void selectSupplier()
	{
		selectsupplier.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[8]/a")
	WebElement clickedit;
	
	public void clickOnEdit()
	{
		clickedit.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/div/div[3]/div[4]/button")
	WebElement clicksubmit;
	
	public void clickOnSubmit()
	{
		clicksubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/button")
	WebElement clicksuccess;
	
	public void clickOnSuccess()
	{
		clicksuccess.click();
	}

}
