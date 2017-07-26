package com.info.Runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.info.Utility.Utility;
import com.info.Pages.Payment;
import com.info.Pages.Registration;
import com.relevantcodes.extentreports.LogStatus;

public class TestRunner extends Utility
{

	Registration registration ;
	Payment payment;
	//WebDriver driver;
	@BeforeSuite
	public void setup()
	{
	try
	{
	WebDriver driver=startBrowser("phantom", "file:///E:/StudyWorkpace/ExtentReport_Demo/HTML_Pages/Registration.html");
	//WebDriver driver=startBrowser("phantom", "https://www.eclipse.org/downloads/?");
	registration=PageFactory.initElements(driver, Registration.class);
	//payment=PageFactory.initElements(driver, Payment.class);
	String webtitle=driver.getTitle();
	System.out.println("Title is"+webtitle);
	takeScreenshot(driver);
	}
	catch(Exception es)
	{
	System.out.println("Exception is"+es.getMessage());	
	}
	}
	
	
	@Test(priority=1)
	public void Customer_Registration()
	{
		try
		{
		test=report.startTest("Download Eclipse");
		test.log(LogStatus.INFO, "Test Started"+test.getStartedTime());
		
		
		registration.to_Fil_Customer_Registration_Details("MR","Sachin", "Pawar", "Sachin@gmail.com", "9898787656", "Aundh,Pune", "Pune", "Maharastra", "414502", "Sachin", "");
		//registration.to_Fil_Customer_Registration_Details();
			
		}
		catch(Exception ex)
		{
			System.out.println("Msg"+ex.getMessage());
		}
	}
	
		
	//}

	
}
