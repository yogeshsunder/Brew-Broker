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
public class AdminEditBuyerPage {
	
	WebDriver driver;
	
	public AdminEditBuyerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME,using="select_uyer")
	WebElement selectbuyer;
	
	public void clickonBuyer()
	{
		selectbuyer.click();
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[8]/a")
	WebElement clickEdit;
	
	public void clickOnEdit()
	{
		clickEdit.click();
	}

}
