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
public class VerifyAdminLoginValidating {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;

	@Test
	
	public void adminsingin() throws Exception
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("verifyloginScreenshot");
		
		//Start the Browser----------------		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");		
		
		logger.log(LogStatus.INFO, "Browser Started.");
		
		//Call the signin Page---------------		
		AdminSignInPage signinadmin=PageFactory.initElements(driver, AdminSignInPage.class);
		
		//Click on login button to get the error messages.
		signinadmin.clickOnLogin();		
		
		logger.log(LogStatus.INFO, "Admin clicks on login Button without entering Username and Password.");
		
		//---------------checking validation error message for Email Address when left blank-------------------
		
		String errr_email=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/span")).getText();
		
		if (errr_email.equals("Please enter email address")) 
			{
				logger.log(LogStatus.PASS, "Admin is getting error message 'Please enter email address' when click on login button without entering email address.");
			}

		else 
			{
				logger.log(LogStatus.FAIL, "Admin is not getting error message 'Please enter email address'when click on login button without entering email address.");
			}
		
		//Enter the email address--------------------
		signinadmin.enterEmail("ben@brewbroker.co.uk");		
		logger.log(LogStatus.INFO, "Admin is able to enter Email address successfully.");
		
		//--------------checking validation error message for Password when left blank---------------
		
		String errr_password=driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[2]/span")).getText();
		
		if(errr_password.equals("Please enter Password"))
			{
				logger.log(LogStatus.PASS, "Admin is getting error message 'Please enter Password' when click on login button without entering password.");
			}
		else
			{
				logger.log(LogStatus.FAIL, "Admin is not getting error message 'Please enter Password' when click on login button without entering password.");
	
			}

		
		//Enter the Password--------------------------
		signinadmin.enterPassword("Admin@123");
		logger.log(LogStatus.INFO, "Admin is able to enter Password successfully.");
		
		//Click on login button-------------------------------
		signinadmin.clickOnLogin();
		logger.log(LogStatus.INFO, "Admin clicks on Login button after entering Valid Email address and Password.");
		
		//Wait for 5 seconds so that user can login and page loads properly
		Thread.sleep(5000);
		
		//Get the text of Buyer option to compare it with buyer
		String buyer_section=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/ul/li[3]/a")).getText();	
		
		//Check if got text is equal to Buyer--------------------
		Assert.assertTrue(buyer_section.contains("Buyerss"), "Title Matched");
		
		//Get the status pass and print in the report if got text is same as give------
		logger.log(LogStatus.PASS, "Admin is able to login.");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to login.");
			logger.log(LogStatus.FAIL, "Login Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
