/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Pages.SupplierSignupPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.BrowserFactory;

/**
 * @author Yogesh
 *
 */
public class verifySignup {
	
	
	ExtentReports report;
	ExtentTest logger;
	
	WebDriver driver;
	
	@Test
	
	public void verifysignup() throws InterruptedException
	{
		report=new ExtentReports("D:\\BrewBrokerReport.html");
		logger=report.startTest("verifysignup");
		
		//Started the browser.
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		logger.log(LogStatus.INFO, "User is able to open Browser and open URL of BrewBroker");
		
		//Created Page Object using Page Factory.
		SupplierSignupPage signup=PageFactory.initElements(driver, SupplierSignupPage.class);
		
		//Thread.sleep(10000);
		
		//driver.findElement(By.className("profile_info")).click();
		
		//Call the Method from created page i.e. from SupplierSignupPage and click on profile info
		signup.clickonProfileinfo();	
		
		Thread.sleep(2000);
		
		//Call the Method from created page i.e. from SupplierSignupPage
		signup.clickonJoin();
			
		//Call the Method from created page i.e. from SupplierSignupPage		
		//signup.clickSignup();
		//logger.log(LogStatus.INFO, "User is able to click on Signup Button to get and check the validation error messages of the signup form.");
		
		signup.clickonSupplierSignup();
		
		
		//Verify Validation Error Message for Blank Email Field
		String actual_email_error=signup.validateemail();
		
		Assert.assertTrue(actual_email_error.contains("Please enter email"));
		logger.log(LogStatus.INFO, "Validation error message for Email field is correct");
		
		signup.email("yogesh@ucreate.co.in");
		logger.log(LogStatus.INFO, "User is able to enter valid email address");
		
		//Verify Validation Error Message for Blank First Name
		String actual_firstname_error=signup.validatefirstname();
		
		Assert.assertTrue(actual_firstname_error.contains("Please enter firstname"));
		logger.log(LogStatus.INFO, "Validation error message for First Name is correct");
		
		signup.firstname("Test");
		logger.log(LogStatus.INFO, "User is able to enter valid First Name");
		
		//Verify Validation Error Message for Blank Last Name
		String actual_lastname_error=signup.validatelastname();
		
		Assert.assertTrue(actual_lastname_error.contains("Please enter lastname"));
		logger.log(LogStatus.INFO, "Validation error message for Last Name is correct");
		
		signup.lastname("Test");
		logger.log(LogStatus.INFO, "User is able to enter valid Last Name");
		
		//Verify Validation Error Message for Blank Brewery Name
		String actual_brewryname_error=signup.validatebreweryname();
		
		Assert.assertTrue(actual_brewryname_error.contains("Please enter brewery name"));
		logger.log(LogStatus.INFO, "Validation error message for Brewery Name is correct");
		
		signup.breweryname("Test");
		logger.log(LogStatus.INFO, "User is able to enter valid Brewery Name");
		
		//Verify Validation Error Message for Blank Password Field
		String actual_password_error=signup.validateblankpasswordyname();
		
		Assert.assertTrue(actual_password_error.contains("Please enter password"));
		logger.log(LogStatus.INFO, "Validation error message for Password for entering Blank password is correct");
		
		signup.password("Test");
		logger.log(LogStatus.INFO, "User is able to enter Password which is not satisfy the required criteria for min 8 characters, lower case letter, upper case letter and special character");
		signup.clickSignup();
		
		//Verify Validation Error Message for Correct Password Field
		String actual_correctpassword_error=signup.validatevalidpasswordyname();
		
		Assert.assertTrue(actual_correctpassword_error.contains("Please enter correct password"));
		logger.log(LogStatus.INFO, "Validation error message for Correct Password is correct");
		
		signup.password("Test@123");
		logger.log(LogStatus.INFO, "User is able to enter Password which satisfy the required criteria for min 8 characters, lower case letter, upper case letter and special character");
		
		signup.license();
		logger.log(LogStatus.INFO, "User is able to confirm a valid brewing license");
		
		signup.clickSignup();
		logger.log(LogStatus.INFO, "User is able to click on SignUp button");
		
		
		
		//check for already taken email id
				String actual_correct_alreadytakenemail_error=signup.validatealreadytakenemail();
				String expected_correct_alreadytakenemail_error="The email has already been taken.";
				
				if(actual_correct_alreadytakenemail_error.equals(expected_correct_alreadytakenemail_error))
				{
					logger.log(LogStatus.FAIL, "User is Not Able to Signup Successfully");
					
				}
				else
				{
					logger.log(LogStatus.PASS, "User is Able to Signup Successfully");
				}
				
				//Assert.assertTrue(actual_correct_alreadytakenemail_error.contains("The email has already been taken."));
				//logger.log(LogStatus.INFO, "Validation error message for Email address for already taken email id is correct");
				
				//signup.email("Test11@tester.com");
				//logger.log(LogStatus.INFO, "User is able to enter different email address");
				
				//signup.clickSignup();
				//logger.log(LogStatus.INFO, "User is able to click on SignUp button");
		
				//logger.log(LogStatus.PASS, "User is Able to Signup Successfully");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
	}
	

	

}

