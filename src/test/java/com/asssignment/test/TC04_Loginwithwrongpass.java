package com.asssignment.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.assigmnet.source.baseclass;
import com.assigmnet.source.loginpage;
import com.assigmnet.source.loginpage2;

public class TC04_Loginwithwrongpass extends baseclass {
   
	@Test
	public void wrongpass() throws IOException {
		loginpage2 l2=new loginpage2(driver);
		l2.username_();
		l2.pass_();
		l2.signinbutton_();
		captureScreenShot(driver, "TC04_Loginwithwrongpass");
}
}
