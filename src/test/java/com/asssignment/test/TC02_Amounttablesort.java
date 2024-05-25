package com.asssignment.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.assigmnet.source.Homepage;
import com.assigmnet.source.baseclass;
import com.assigmnet.source.loginpage;

public class TC02_Amounttablesort extends baseclass {
     @Test
	public void amountsort() throws IOException {
    	 loginpage l2=new loginpage(driver);
 		l2.username_();
 		l2.pass_();
 		l2.signinbutton_();
  		
 		Homepage h1=new Homepage(driver);
 		h1.amounttab_();
//		captureScreenShot(driver, "Amountsorting");

	}
}
