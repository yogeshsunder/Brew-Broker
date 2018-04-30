/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.AdminAddBuyerPage;
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
public class VerifyAdminAddBuyer 
{
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void verifyAddBuyerAdmin() throws Exception
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Add Buyer from Admin");
		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		logger.log(LogStatus.INFO, "Browser Started and opened URL.");
		
		//Admin Login
		AdminSignInPage signinadmin=PageFactory.initElements(driver, AdminSignInPage.class);
		
		signinadmin.enterEmail("ben@brewbroker.co.uk");
		logger.log(LogStatus.INFO, "Admin is able to enter Email Address for login.");
		
		signinadmin.enterPassword("Admin@123");
		logger.log(LogStatus.INFO, "Admin is able to enter Password for login.");
		
		signinadmin.clickOnLogin();
		logger.log(LogStatus.INFO, "Admin is able to click on Login button for login.");
		
		Thread.sleep(5000);
		
		//Add Buyer
		AdminAddBuyerPage addbuyer=PageFactory.initElements(driver, AdminAddBuyerPage.class);
		
		
		
		addbuyer.clickonAddbuyer();
		logger.log(LogStatus.INFO, "Admin is able to Login into admin account.");
		logger.log(LogStatus.INFO, "Admin is able to click on Add Buyer option from left panel.");
		
		Thread.sleep(2000);
		addbuyer.enterEmailid("yogeshadmintestbuyer001@mailinator.com");	
		logger.log(LogStatus.INFO, "Admin is able to enter Email Address of Buyer.");
		
		addbuyer.enterName("YogeshTestBuyer");
		logger.log(LogStatus.INFO, "Admin is able to enter Name of Buyer.");
		
		addbuyer.enterCompanyName("YogeshTestCompanyName");
		logger.log(LogStatus.INFO, "Admin is able to enter Company name of Buyer.");
		
		addbuyer.enterTemperaryPassword("Yogesh@123");
		logger.log(LogStatus.INFO, "Admin is able to enter Password of Buyer.");
		
		addbuyer.clickOnBestDescribe();
		logger.log(LogStatus.INFO, "Admin is able to select Best Describe for Buyer.");
		
		addbuyer.clickonSubmit();
		logger.log(LogStatus.INFO, "Admin is able to click on Submit button to create Buyer Profile.");
		
		Thread.sleep(5000);
		String success_message=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]")).getText();
		Assert.assertTrue(success_message.contains("yogeshadmintestbuyer001@mailinator.com"), "Title Matched");
		
		logger.log(LogStatus.PASS, "Admin is Able to Add Buyer Successfully.");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to add Buyer.");
			logger.log(LogStatus.FAIL, "Add Buyer from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
}
