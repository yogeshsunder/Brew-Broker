/**
 * 
 */
package com.TestCases;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Yogesh
 *
 */
public class ExtentFactory {
	public static ExtentReports getInstance()
	{
		ExtentReports extent;
		String Path = "D://BrewBrokerAutomationTestingReport.html";
		extent = new ExtentReports(Path, false);
		
		return extent;
		
	}

}
