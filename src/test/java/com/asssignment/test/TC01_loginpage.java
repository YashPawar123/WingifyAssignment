package com.asssignment.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.assigmnet.source.baseclass;
import com.assigmnet.source.loginpage;

public class TC01_loginpage  extends baseclass{
    @Test
	public void loginvalidation() throws IOException {
		loginpage l2=new loginpage(driver);
		l2.username_();
		l2.pass_();
		l2.signinbutton_();
		captureScreenShot(driver, "loginvalidation");
		
	}
}
