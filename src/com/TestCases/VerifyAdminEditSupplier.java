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
public class VerifyAdminEditSupplier {
	
	ExtentReports report;
	ExtentTest logger;
	
	
	WebDriver driver;
	
	@Test
	public void verifyEditSupplierfromAdmin() throws InterruptedException, IOException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Verify Edit Supplier from Admin");
		
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/admin");
		AdminSignInPage signin=PageFactory.initElements(driver, AdminSignInPage.class);
		AdminEditSupplierPage edit=PageFactory.initElements(driver, AdminEditSupplierPage.class);
		AdminAddSupplierPage add=PageFactory.initElements(driver, AdminAddSupplierPage.class);
		
		signin.enterEmail("ben@brewbroker.co.uk");
		signin.enterPassword("Admin@123");
		signin.clickOnLogin();
		
		Thread.sleep(5000);
		
		edit.cilckOnSupplier();
		Thread.sleep(5000);
		edit.selectSupplier();
		Thread.sleep(5000);
		edit.clickOnEdit();
		
		Thread.sleep(5000);
		
		add.enterEmail("yogeshadmineditsupplier007@gmail.com");
		add.enterFirstName("YogeshTest");
		add.enterLastName("YogeshTest");
		add.enterBreweryName("YogeshTestScript");
		add.enterAddress("275");
		Thread.sleep(2000);
		add.clickonAddressinfo();
		add.selectService();
		add.clickonCanning();
		add.clickon330ml();
		add.selectMinCapacity("100");
		add.selectMaxCapacity("10000");
		add.selectDelivery();
		add.selectStyleAles();
		add.selectStyleLager();
		add.enterBio("This is automation script generated profile");
		add.clickonUploadLogo();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\LogoUploadBrewBroker.exe");
		
		Thread.sleep(2000);
		add.clickOnDoneofLogoUpload();
		Thread.sleep(3000);
		
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUploadBrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload2BrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload3BrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload4BrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload5BrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload6BrewBroker.exe");
		Thread.sleep(2000);
		add.clickonUploadimage();
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload7BrewBroker.exe");
		Thread.sleep(2000);
		
		add.enterTemporaryPassword("Yogesh@123");
		Thread.sleep(2000);
		edit.clickOnSubmit();
		Thread.sleep(10000);
		edit.clickOnSuccess();
		
		logger.log(LogStatus.PASS, "Admin is Able to Edit Supplier Successfully");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Admin is not able to Edit Supplier.");
			logger.log(LogStatus.FAIL, "Edit Supplier from Admin Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}

}
