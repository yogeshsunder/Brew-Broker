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
public class AdminDeleteSupplierPage {
	
	WebDriver driver;
	
	public AdminDeleteSupplierPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[9]/div/a")
	WebElement clickdelete;
	
	public void clickOnDelete()
	{
		clickdelete.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/div/div/button")
	WebElement clickyes;
	
	public void clickonYestoDelete()
	{
		clickyes.click();
	}

}
