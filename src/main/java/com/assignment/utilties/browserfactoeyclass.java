package com.assignment.utilties;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactoeyclass {
     public static WebDriver startapplication(WebDriver driver,String browsername,String appurl)
     { 
    	 if(browsername.equals("chrome"))
		{
	         driver = new ChromeDriver( );
		}
		else if(browsername.equals("Firefox"))
		{
 	         driver = new FirefoxDriver();
		}
		else if(browsername.equals("Edge"))
		{
 	         driver = new EdgeDriver();
		}
		else
		{
			System.out.println("We do not support this browser ");
		}

		
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		return driver;
    	 
     }
     public static void quitebrower(WebDriver driver)
     {
    	 driver.quit();
     }
     
}
