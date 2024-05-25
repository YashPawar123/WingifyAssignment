package com.assignment.utilties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider {
     Properties pro;
	public Configdataprovider()
	{
           File src = new File("./configuration/config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			
			pro= new Properties();
			
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("Not able to load config file "+e.getMessage());
		} 
	}

	
	public String getBrowser()
	{
 		return pro.getProperty("browser");
	}



	public String getStagingUrl()
	{
 		return pro.getProperty("testurl");
	}
	public String getusername() 
	{
		return pro.getProperty("username");
	}
	public String getpassword() {
		return pro.getProperty("password");
	}
	
}
 
