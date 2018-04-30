/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.AdminDeleteSupplierPage;
import com.Pages.AdminEditSupplierPage;
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
public class VerifyAdminDeleteSupplier {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void verifyDeleteSupplierfromAdmin() throws InterruptedException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Delete Supplier from Admin");
		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		AdminSignInPage signin=PageFactory.initElements(driver, AdminSignInPage.class);
		AdminEditSupplierPage edit=PageFactory.initElements(driver, AdminEditSupplierPage.class);
		AdminDeleteSupplierPage delete=PageFactory.initElements(driver, AdminDeleteSupplierPage.class);
		
		signin.enterEmail("ben@brewbroker.co.uk");
		signin.enterPassword("Admin@123");
		signin.clickOnLogin();
		
		Thread.sleep(5000);
		
		edit.cilckOnSupplier();
		Thread.sleep(5000);
		edit.selectSupplier();
		Thread.sleep(5000);
		
		delete.clickOnDelete();
		delete.clickonYestoDelete();
		logger.log(LogStatus.PASS, "Admin is Able to Delete Supplier Successfully");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to Delete Supplier.");
			logger.log(LogStatus.FAIL, "Delete Supplier from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
