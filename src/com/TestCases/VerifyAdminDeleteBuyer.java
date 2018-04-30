/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.AdminDeleteBuyerPage;
import com.Pages.AdminEditBuyerPage;
import com.Pages.AdminSignInPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;
import Helper.Utility;

/**
 * @author Yogesh
 *
 */
public class VerifyAdminDeleteBuyer {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void verifyDeleteBuyerFromAdmin() throws InterruptedException
	{
		report=ExtentFactory.getInstance();
		logger=report.startTest("Delete Buyer from Admin");
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		
		AdminSignInPage signin=PageFactory.initElements(driver, AdminSignInPage.class);
		AdminEditBuyerPage edit=PageFactory.initElements(driver, AdminEditBuyerPage.class);
		AdminDeleteBuyerPage delete=PageFactory.initElements(driver, AdminDeleteBuyerPage.class);
		
		signin.enterEmail("ben@brewbroker.co.uk");
		signin.enterPassword("Admin@123");
		signin.clickOnLogin();
		
		Thread.sleep(5000);
		
		edit.clickonBuyer();
		
		Thread.sleep(2000);
		
		delete.clickOnDelete();
		Thread.sleep(3000);
		delete.clickOnYes();
		
		logger.log(LogStatus.PASS, "User is Able to Delete Buyer Successfully");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to Delete Buyer.");
			logger.log(LogStatus.FAIL, "Delete Buyer from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
