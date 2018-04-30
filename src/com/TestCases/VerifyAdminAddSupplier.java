/**
 * 
 */
package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.AdminAddSupplierPage;
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
public class VerifyAdminAddSupplier {
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void verifyaddSupplierAdmin() throws InterruptedException, IOException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Add Supplier from Admin");
		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		logger.log(LogStatus.INFO, "Browser Started and opened URL.");
		
		AdminAddSupplierPage addsupplier=PageFactory.initElements(driver, AdminAddSupplierPage.class);
		
		//Admin Login
		AdminSignInPage signinadmin=PageFactory.initElements(driver, AdminSignInPage.class);
				
		signinadmin.enterEmail("ben@brewbroker.co.uk");
		signinadmin.enterPassword("Admin@123");
		signinadmin.clickOnLogin();
				
		Thread.sleep(5000);
		
		//Add Supplier
		
		addsupplier.clickonAddSupplier();
		
		Thread.sleep(5000);
		
		addsupplier.enterEmail("Yogeshtestadminsupplier001@mailinator.com");
		addsupplier.enterFirstName("YogeshTestScript");
		addsupplier.enterLastName("YogeshTestScript");
		addsupplier.enterBreweryName("YogeshTestScript");
		addsupplier.enterAddress("275");
		Thread.sleep(2000);
		addsupplier.clickonAddressinfo();
		addsupplier.selectService();
		addsupplier.clickonCanning();
		addsupplier.clickon330ml();
		addsupplier.selectMinCapacity("100");
		addsupplier.selectMaxCapacity("1000");
		addsupplier.selectDelivery();
		addsupplier.selectStyleAles();
		addsupplier.selectStyleLager();
		addsupplier.enterBio("This is a testing Profile generated by Automation Script");
		addsupplier.clickonUploadLogo();
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\LogoUploadBrewBroker.exe");
		
		Thread.sleep(2000);
		addsupplier.clickOnDoneofLogoUpload();
		Thread.sleep(3000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUploadBrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload2BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload3BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload4BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload5BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload6BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload7BrewBroker.exe");
		Thread.sleep(2000);
		
		addsupplier.clickonIssueWelcomeEmail();
		addsupplier.enterTemporaryPassword("Yogesh@123");
		Thread.sleep(2000);
		addsupplier.clickOnSubmit();
		Thread.sleep(20000);
		addsupplier.clickOnSuccess();
		
		logger.log(LogStatus.PASS, "Admin is Able to Add Supplier Successfully");	
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to add Supplier.");
			logger.log(LogStatus.FAIL, "Add Supplier from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}