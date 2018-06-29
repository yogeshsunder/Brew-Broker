/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.BuyerSignInPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;
import Helper.Utility;

/**
 * @author ucreate
 *
 */
public class VerifyLoginBuyer {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void buyerSignin()
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Buyer SignIn");
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		logger.log(LogStatus.INFO, "Browser Started and opened URL.");
		
		//Created Page Object using Page Factory.
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		//signup.clickonProfileinfo();
		
		signin.clickonLoginhomepage();	
		logger.log(LogStatus.INFO, "User is able to click on Login link on Homepage");
		
		//Enter email address
		signin.enterEmail("yogesh3@mailinator.com");
		
		//Enter Password
		signin.enterPassword("Yogesh@123");
		
		//click on login button
		signin.clickLoginButton();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Buyer is not able to Login.");
			logger.log(LogStatus.FAIL, "Buyer SignIn Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
