package com.assignment.utilties;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listeners implements ITestListener {
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	public void configureReport()
	{
		htmlReporter= new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports= new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system information/environments info to reports
		reports.setSystemInfo("Machine", "yash");
		reports.setSystemInfo("OS","Windows11");
		
		
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	 

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
 	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test method successfully excuted "+result.getName());
		   test=reports.createTest(result.getName());
		   test.log(Status.PASS, MarkupHelper.createLabel("Name of the pass test case is: "+result.getName(),ExtentColor.GREEN)); 	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("Name of test method failed:"+result.getName());
		    test=reports.createTest(result.getName());
		    test.log(Status.FAIL, MarkupHelper.createLabel("Name of test method failed: "+result.getName(),ExtentColor.RED));
		    
		    String screenShotPath= System.getProperty("user.dir") +"\\ScreenShots\\" + result.getName() + ".png";
		    
		    File screenShotFile = new File(screenShotPath);
		    
		    if(screenShotFile.exists())
		    {
		    	test.fail("Captured Screenshot is below:" +test.addScreenCaptureFromPath(screenShotPath));
		    }
 	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of test method skipped "+result.getName());
	    test=reports.createTest(result.getName());
	    test.log(Status.SKIP, MarkupHelper.createLabel("Name of   test method skipped: "+result.getName(),ExtentColor.YELLOW));
 	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
 	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		 onTestFailure(result);
		 }

	@Override
	public void onStart(ITestContext context) {
		configureReport();
	    System.out.println("On start method invoked.....");
 	}

	@Override
	public void onFinish(ITestContext context) {
		  System.out.println("On Finished method invoked.....");
		    reports.flush();// it is mandatory to call flush method to ensure information is written ti the started reporter. 
 	}

	 

}
