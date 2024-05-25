package com.assigmnet.source;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.assignment.utilties.Configdataprovider;
import com.assignment.utilties.browserfactoeyclass;

 

public class baseclass {
	public WebDriver driver;
	public Configdataprovider config =new Configdataprovider();
 	
	@BeforeSuite
	public void setUpSuite()
	{
		config=new Configdataprovider();
 	}
	@BeforeClass
	public void setUp()
	{
		driver=browserfactoeyclass.startapplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
 @AfterClass
	public void tearDown()
	{
	 browserfactoeyclass.quitebrower(driver);
	}
 
 
 public void captureScreenShot(WebDriver driver,String testName) throws IOException
 {
	 // Convert webdriver object to TakesScreenshot interface
	 TakesScreenshot screenshot= ((TakesScreenshot)driver);
	 
	 // Step 2 :call getScreenshotAs method to capture image file
	 
	 File src= screenshot.getScreenshotAs(OutputType.FILE);
	 File dest=new File("."+"//Screenshots//"+ testName + ".png");
	 
	 // Step 3 : copy image file to destination 
	 FileUtils.copyFile(src, dest);
	 
 }
}
