/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.AdminSignInPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class VerifyCreateTenderfromBuyer {

	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;

	@Test
	
	public void adminsingin() throws Exception
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("verifyCreateTender");
		
		//Start the Browser----------------		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");		
		
		logger.log(LogStatus.INFO, "Browser Started.");
		
		//Call the signin Page---------------		
		AdminSignInPage signinadmin=PageFactory.initElements(driver, AdminSignInPage.class);
		
		//Click on login button to get the error messages.
		signinadmin.clickOnLogin();		
		
		logger.log(LogStatus.INFO, "Admin clicks on login Button without entering Username and Password.");

}
}
