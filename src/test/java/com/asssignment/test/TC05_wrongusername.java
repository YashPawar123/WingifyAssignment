package com.asssignment.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.assigmnet.source.baseclass;
import com.assigmnet.source.loginpage;
import com.assigmnet.source.loginpage3;

public class TC05_wrongusername  extends baseclass{
    @Test
	public void wrongusername() throws IOException {
    	loginpage3 l2=new loginpage3(driver);
		l2.username_();
		l2.pass_();
		l2.signinbutton_();
		captureScreenShot(driver, "TC05_wrongusername");
	}
}
