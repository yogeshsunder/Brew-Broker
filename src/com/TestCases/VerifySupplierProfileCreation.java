/**
 * 
 */
package com.TestCases;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.SupplierProfileCreationPage;
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
public class VerifySupplierProfileCreation 
{
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void verifySupplierProfileCreation() throws InterruptedException, IOException
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Supplier Profile Creation");
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/supplier");
				
		//Created Page Object using Page Factory.
		SupplierSignupPage signup=PageFactory.initElements(driver, SupplierSignupPage.class);
		
		SupplierProfileCreationPage profilecreation=PageFactory.initElements(driver, SupplierProfileCreationPage.class);
				
		//Supplier Signup...
		
		Thread.sleep(2000);
				
		//signup.clickonJoin();	
		
		Thread.sleep(2000);
				
		//signup.clickonSupplierSignup();
		Thread.sleep(5000);
		signup.firstname("Yogesh");
		signup.lastname("Kumar");
		signup.breweryname("Beer for All");
		signup.email("yogeshTestsupplier001@mailinator.com");
		signup.password("Yogesh@123");
		signup.ContractBrewingServices();
		signup.license();
		signup.clickSignup();
		logger.log(LogStatus.INFO, "User is able to signup as Supplier");
		Thread.sleep(5000);

		//Step 2 i.e. Address--------------------------------------------------------
		
		profilecreation.enterAddress("NW1 2PG");
		Thread.sleep(5000);
		profilecreation.clickonAddressinfo();
		Thread.sleep(5000);
		profilecreation.addressContinue();
		//profilecreation.addressContinue();

		logger.log(LogStatus.INFO, "User is able to enter Address successfully.");
		
		//Step 3 i.e. Brewing services----------------------------------------------
		Thread.sleep(5000);
		
		profilecreation.clickserviceContractbrewingfromarecipe();
		profilecreation.clickonStyleAles();
		//profilecreation.clickonstylePorter();
		//profilecreation.styleSour();
		profilecreation.clickonYesBreweryVisit();
		profilecreation.continueServices();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to enter Brewing services successfully.");
		
		//Step 4 i.e. Brewing capacity-----------------------------------------
		
		
		profilecreation.enterAnnualCapacity("10000");
		profilecreation.minCapacity("100");
		profilecreation.maxCapacity("1000");
		profilecreation.clickonfacilitateongoingcontractbrewsYes();
		profilecreation.clickononeoffBrew();
		profilecreation.continueCapacity();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to enter Brewing capacity successfully.");
		
		//Step 5 i.e. Packaging------------------------------------------------------
		
		profilecreation.clickonPackagingContinue();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to continue with packaging successfully.");
		
		//Step 6 i.e. Logistics------------------------------------------------------
				
		profilecreation.clickonDeliveryYes();
		profilecreation.clickonWarehousingNo();
		profilecreation.clickonBondedStorageYes();		
		profilecreation.deliveryContinue();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to continue with Logistics successfully.");
		
		//Step 7 i.e. Duty---------------------------------------------------------------
		
		profilecreation.enterHMRCregistration("HMRC1234");
		//profilecreation.clickonClassAHMRCregistration();
		profilecreation.clickonContinueDuty();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to continue with Duty successfully.");
		
		//Step 8 i.e. Accrediations and qualification--------------------------------------
		
		profilecreation.clickonAccrediationsContinue();
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "User is able to continue with Accrediations successfully.");
		
		//Step 9 i.e. Summary---------------------------------------------------------------
		profilecreation.enterSummary("Test");
		profilecreation.continueSummary();
		Thread.sleep(3000);
		
		logger.log(LogStatus.INFO, "User is able to continue with Summary successfully.");
		
		//Step 10 i.e. Logo, photos & videos---------------------------------------------------------------
		
		
		profilecreation.logoClick();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\LogoUploadBrewBroker.exe");
		
		Thread.sleep(2000);
		profilecreation.clicktoConfirmlogoUpload();
		
		Thread.sleep(2000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUploadBrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload2BrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload3BrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload4BrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload5BrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload6BrewBroker.exe");
		
		Thread.sleep(3000);
		
		profilecreation.imageClick();
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload7BrewBroker.exe");
		
		Thread.sleep(3000);
						
		profilecreation.clickFinish();
		
		logger.log(LogStatus.PASS, "User is Able to Upload logo and photos Successfully");

		logger.log(LogStatus.PASS, "User is Able to Creation Profile as a Supplier Successfully");		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "User is not able to Create Profile as Supplier.");
			logger.log(LogStatus.FAIL, "Supplier Profile Creation", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
}


