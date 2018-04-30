/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;
import Helper.Utility;

/**
 * @author Yogesh
 *
 */
public class VerifyRequestEarlyAccess {
	
	ExtentReports report;
	ExtentTest logger;
	
WebDriver driver;
	
	@Test
	
	public void verifyEarlyAccess() throws InterruptedException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("REGISTER FOR FREE MEMBERSHIP");
	
	//Start the browser.
			driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
			logger.log(LogStatus.INFO, "Browser Started and opened URL.");
			
			//Created Page Object using Page Factory.
			HomePage earlyaccess=PageFactory.initElements(driver, HomePage.class);
			
			Thread.sleep(10000);
			earlyaccess.requestAcessButton();
			Thread.sleep(5000);
			earlyaccess.enterName("Yogesh");
			logger.log(LogStatus.INFO, "User is able to enter Name successfully.");
			
			earlyaccess.enterCompany("yogesh");
			logger.log(LogStatus.INFO, "User is able to enter Company Name successfully.");
			
			earlyaccess.enterEmail("yogeshtestRequestEarlyAccess019@mailinator.com");
			logger.log(LogStatus.INFO, "User is able to enter Email Address successfully.");
			
			earlyaccess.clickRelationdropdown();
			Thread.sleep(5000);
			earlyaccess.clickonDropDown();
			Thread.sleep(7000);
			logger.log(LogStatus.INFO, "User is able to Describe Relationship with Beer successfully.");
				
			earlyaccess.requestAcessButton();			
			logger.log(LogStatus.INFO, "User is able to Describe Relationship with Beer successfully.");
			
			Thread.sleep(5000);
			
			String all_done=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div/h3")).getText();
			Assert.assertTrue(all_done.contains("All done!"), "Title Matched");
			
			logger.log(LogStatus.PASS, "User is Able to click on Request Early Access button Successfully.");

}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "User is not able to Request Early Access to the Platform.");
			logger.log(LogStatus.FAIL, "Request Early Access Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
}
