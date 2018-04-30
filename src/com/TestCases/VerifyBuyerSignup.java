/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.BuyerSignupPage;
import com.Pages.SupplierSignupPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;
import Helper.Utility;

/**
 * @author Yogesh
 *
 */
public class VerifyBuyerSignup {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	
	public void verifybuyerSignup() throws InterruptedException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Buyer Signup");
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/find-brewery-supplier");
		
		//
		SupplierSignupPage signup=PageFactory.initElements(driver, SupplierSignupPage.class);
		BuyerSignupPage signupBuyer=PageFactory.initElements(driver, BuyerSignupPage.class);
		
		//signup.clickonProfileinfo();
		signup.clickonJoin();
		
		Thread.sleep(5000);
		
		signupBuyer.clickonSignupBuyer();
		
		Thread.sleep(5000);
		
		signupBuyer.clickonRadioDescribesButton();
		
		Thread.sleep(3000);
		
		signupBuyer.clickContinueDescribes();
		signupBuyer.enterName("yogesh");
		signupBuyer.enterBreweryName("Test");
		signupBuyer.enterEmail("yogeshtestbuyerSignup014@mailinator.com");
		signupBuyer.enterpwd("Yogesh@123");
		Thread.sleep(2000);
		signupBuyer.signup();
		Thread.sleep(2000);
		signupBuyer.browseBreweries();
		
		logger.log(LogStatus.PASS, "User is Able to Signup as a Buyer Successfully");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "User is not able to Signup as Buyer.");
			logger.log(LogStatus.FAIL, "Buyer Signup", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
	

}
