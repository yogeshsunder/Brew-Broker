/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

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
public class VerifySupplierSignup 
{
	ExtentReports report;
	ExtentTest logger;
	
WebDriver driver;
	
	@Test
	
	public void verifySuppliersignup() throws InterruptedException
	{
		report=ExtentFactory.getInstance();
		logger=report.startTest("Supplier Signup");
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/find-brewery-supplier");
		logger.log(LogStatus.INFO, "Browser Started and opened URL.");
		
		//Created Page Object using Page Factory.
		SupplierSignupPage signup=PageFactory.initElements(driver, SupplierSignupPage.class);
		
		//signup.clickonProfileinfo();
		
		signup.clickonJoin();	
		logger.log(LogStatus.INFO, "User is able to click on link Join");
		
		Thread.sleep(2000);
		
		signup.clickonSupplierSignup();
		logger.log(LogStatus.INFO, "User is able to click on Supplier SignUp button.");
		
		Thread.sleep(2000);
		signup.email("yogeshTestSupplierSignup016@mailinator.com");
		logger.log(LogStatus.INFO, "User is able to enter Email address successfully.");
		
		signup.firstname("Yogesh");
		logger.log(LogStatus.INFO, "User is able to enter First Name successfully.");
		
		signup.lastname("Kumar");
		logger.log(LogStatus.INFO, "User is able to enter Last Name successfully.");
		
		signup.breweryname("Yogesh");
		logger.log(LogStatus.INFO, "User is able to enter Brewery Name successfully.");
		
		signup.password("Yogesh@123");
		logger.log(LogStatus.INFO, "User is able to enter Password successfully.");
		
		signup.license();
		logger.log(LogStatus.INFO, "User is able to select License successfully.");
		
		signup.clickSignup();
		logger.log(LogStatus.INFO, "User is able to click on Signup button successfully.");
		
		logger.log(LogStatus.PASS, "User is Able to Signup as a Supplier Successfully.");

	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "User is not able to SignUp as Supplier.");
			logger.log(LogStatus.FAIL, "Supplier SignUp Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
}

