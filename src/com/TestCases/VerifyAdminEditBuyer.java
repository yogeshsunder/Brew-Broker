/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.AdminAddBuyerPage;
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
public class VerifyAdminEditBuyer {
	
	WebDriver driver;
	
	ExtentReports report;
	ExtentTest logger;
	
	@Test
	public void verifyEditforBuyerfromAdmin() throws InterruptedException
	{
		report=ExtentFactory.getInstance();
		logger=report.startTest("Edit Buyer from Admin");
		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		
		AdminSignInPage login=PageFactory.initElements(driver, AdminSignInPage.class);
		AdminEditBuyerPage edit=PageFactory.initElements(driver, AdminEditBuyerPage.class);
		AdminAddBuyerPage add=PageFactory.initElements(driver, AdminAddBuyerPage.class);
		
		login.enterEmail("ben@brewbroker.co.uk");
		login.enterPassword("Admin@123");
		login.clickOnLogin();
		
		Thread.sleep(5000);
		
		edit.clickonBuyer();
		Thread.sleep(2000);
		edit.clickOnEdit();
		
		Thread.sleep(2000);
		
		add.enterEmailid("yogeshadminbuyeredit001@gmail.com");
		add.enterName("YogeshTestBuyer");
		add.enterCompanyName("YogeshTestCompanyNameEdit");
		add.clickOnBestDescribe();
		add.clickonSubmit();
		
		logger.log(LogStatus.PASS, "User is Able to Edit Buyer Successfully");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to Edit Buyer.");
			logger.log(LogStatus.FAIL, "Edit Buyer from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
