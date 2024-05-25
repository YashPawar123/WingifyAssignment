package com.assigmnet.source;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.utilties.Configdataprovider;

public class loginpage3 {
	WebDriver driver;
    @FindBy(id="username")
    WebElement username;
    
   
    
    @FindBy(id="password")
    WebElement pass;
    
    @FindBy(id="log-in")
    WebElement signin_button;
    
    public Configdataprovider config =new Configdataprovider();
    public void username_() {
    	username.sendKeys(config.getusername());
    	assertTrue(false);

    }
     
    public void pass_() {
    	pass.sendKeys(config.getpassword());
     }
    public void signinbutton_() {
    	signin_button.sendKeys(Keys.ENTER);;
    }
       
    public loginpage3(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
}
