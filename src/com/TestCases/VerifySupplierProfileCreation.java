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
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/find-brewery-supplier");
				
		//Created Page Object using Page Factory.
		SupplierSignupPage signup=PageFactory.initElements(driver, SupplierSignupPage.class);
		
		SupplierProfileCreationPage profilecreation=PageFactory.initElements(driver, SupplierProfileCreationPage.class);
				
		//signup.clickonProfileinfo();
		
		Thread.sleep(2000);
				
		signup.clickonJoin();	
		
		Thread.sleep(2000);
				
		signup.clickonSupplierSignup();
		Thread.sleep(5000);
		signup.email("yogeshTestsupplier001@mailinator.com");
		
		signup.firstname("Yogesh");
		signup.lastname("Kumar");
		signup.breweryname("YogiScriptProfile");
		signup.password("Yogesh@123");
		signup.license();
		Thread.sleep(2000);
		signup.clickSignup();
		Thread.sleep(2000);
		signup.createprofile();
		
		Thread.sleep(3000);
		
		profilecreation.enterAddress("NW1 2PG");
		Thread.sleep(5000);
		profilecreation.clickonAddressinfo();
				Thread.sleep(5000);
				profilecreation.addressContinue();
				//profilecreation.addressContinue();
				Thread.sleep(3000);
				profilecreation.clickserviceContractbrewingfromarecipe();
				//profilecreation.clickservicesKegs20();
				profilecreation.continueServices();
				Thread.sleep(2000);
				profilecreation.stylePorter();
				profilecreation.styleSour();
				profilecreation.continueStyles();
				Thread.sleep(3000);
				profilecreation.minCapacity("1");
				profilecreation.maxCapacity("2");
				profilecreation.continueCapacity();
				Thread.sleep(2000);
				profilecreation.deliveryNo();
				profilecreation.deliveryContinue();
				Thread.sleep(2000);
				profilecreation.enterSummary("Test");
				profilecreation.continueSummary();
				Thread.sleep(3000);
				profilecreation.logoClick();
				Thread.sleep(2000);
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\LogoUploadBrewBroker.exe");
				
				Thread.sleep(2000);
				profilecreation.clicktoConfirmlogoUpload();
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Thread.sleep(2000);
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUploadBrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload2BrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload3BrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload4BrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload5BrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload6BrewBroker.exe");
				
				Thread.sleep(2000);
				
				profilecreation.imageClick();
				
				Thread.sleep(1000);
				
				Runtime.getRuntime().exec("D:\\Yogesh\\BrewBroker\\BrewBrokerUploadesforSelenium\\ImageUpload7BrewBroker.exe");
				
				Thread.sleep(2000);
								
				profilecreation.clickFinish();
		
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


