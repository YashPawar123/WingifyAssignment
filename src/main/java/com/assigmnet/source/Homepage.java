package com.assigmnet.source;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
    @FindBy(id ="amount")
    WebElement amounttab;
    
    public void amounttab_() {
    	amounttab.click();
//    	assertTrue(false);
    }
    public Homepage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
}
