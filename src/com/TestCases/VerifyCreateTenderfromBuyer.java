/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Pages.BuyerSignInPage;
import com.Pages.CreateTenderfromBuyerPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;
import Helper.Utility;

/**
 * @author Yogesh
 *
 */
public class VerifyCreateTenderfromBuyer 
{
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	public void createTenderbyBuyer() throws Exception
	{
		
		report=ExtentFactory.getInstance();
		logger=report.startTest("Buyer SignIn");
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		logger.log(LogStatus.INFO, "Browser Started and opened URL.");
		
		/*====================================================login BrewBroker Buyer ===================================================================*/
		
		//Created Page Object using Page Factory for Login.
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		//signup.clickonProfileinfo();
		
		/*===========================Buyer Login====================================================*/
		signin.clickonLoginhomepage();	
		logger.log(LogStatus.INFO, "User is able to click on Login link on Homepage");
		signin.enterEmail("yogesh3@mailinator.com");
		signin.enterPassword("Yogesh@123");
		signin.clickLoginButton();		
		Thread.sleep(3000);
		
		logger.log(LogStatus.INFO, "Buyer is able to Login.");
		
		driver.get("http://brewbroker-react.herokuapp.com/create-tender");
		
		CreateTenderfromBuyerPage tender=PageFactory.initElements(driver, CreateTenderfromBuyerPage.class);
		
		/*===========================Step One ====================================================*/
		//tender.brewbroker_logo(); Thread.sleep(5000);
		//tender.dashboard_link(); Thread.sleep(5000);
		//tender.newTender(); Thread.sleep(5000);
		tender.ServiceYouNeedBoth();
		tender.nameOfTender();
		tender.descriptionTender();
		tender.submitQuoteBy();
		tender.deliverContractBy();
		tender.nextForm();  Thread.sleep(3000);
		
		logger.log(LogStatus.INFO, "Buyer is able to enter Basic information for step 1.");
		
		/*============================================ Step Two ==============================================*/
		tender.brewingServices(); Thread.sleep(1000);
		tender.style_Ales();
		tender.ales_ABP();
		tender.ales_icanprovide();
		tender.style_lager();
		tender.lager_ABP();
		tender.lager_icanprovide();
		tender.next_Form_two();  Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "Buyer is able to enter Brewing criteria details for step 2.");
		
		/*===============================================Step Three =====================================================*/
		tender.contract_type(); Thread.sleep(1000);
		tender.volume_ales(); Thread.sleep(1000);
		tender.container_type(); Thread.sleep(1000);
		tender.size_type(); Thread.sleep(1000); 
		tender.shape_type(); Thread.sleep(1000);
		tender.color_type(); Thread.sleep(1000);
		tender.shelflife_type(); Thread.sleep(1000);
		tender.labelling_type();
		tender.tickales();
		
		tender.volume_lager(); Thread.sleep(1000);
		tender.container_typelager(); Thread.sleep(1000);
		tender.size_typelager(); Thread.sleep(1000); 
		tender.shape_typelager(); Thread.sleep(1000);
		tender.color_typelager(); Thread.sleep(1000);
		tender.shelflife_typelager(); Thread.sleep(1000);
		tender.labelling_typelager();
		tender.ticklager();
		tender.continue_step_three(); Thread.sleep(3000);
		
		logger.log(LogStatus.INFO, "Buyer is able to enter Volume & packaging details for step 3.");
		
		
		/*=================================Step Four=========================================================================*/
		tender.duty(); Thread.sleep(2000);
		tender.duty_continue(); Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "Buyer is able to enter Duty details for step 4.");
		
		/*====================================Step Five========================================================================*/
		tender.arrange_collection();
		tender.storage_click();
		tender.ambient_click();
		tender.duration_click();
		tender.stepfive_sontinue(); Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "Buyer is able to enter Logistics details for step 5.");
		
		/*===============================================Step Six==================================================================*/
		tender.standards();
		tender.qualifications();
		tender.communication();
		tender.stepsix_continue();
		
		tender.stepsix_continue(); Thread.sleep(3000);
		
		logger.log(LogStatus.INFO, "Buyer is able to pass step Accreditations & Qualifications for step 6.");
		
		/*================================================Step Seven=====================================================*/		
		tender.continue_step_seven();Thread.sleep(5000);
		
		logger.log(LogStatus.INFO, "Buyer is able to pass step Review and submit for step 7.");
		
		/*================================================Step Eight=====================================================*/	
		tender.clicktext();Thread.sleep(5000);
		
		tender.selectMoorhouseBrewery();Thread.sleep(3000);
		tender.selectCreateBrwery();Thread.sleep(3000);
		tender.selectBhopstuff();Thread.sleep(1000);
		tender.submitTender();
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image=logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.INFO, "Buyer is not able to Login.");
			logger.log(LogStatus.FAIL, "Buyer SignIn Verification", image);
		}
		
		report.endTest(logger);
		report.flush();;
	}
	

	
}
