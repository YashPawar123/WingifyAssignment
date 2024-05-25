package com.asssignment.test;

import java.io.IOException;

import com.assigmnet.source.Homepage;
import com.assigmnet.source.baseclass;
import com.assigmnet.source.loginpage;

public class TC03_amounttabnotclicable extends baseclass {
    
	public void amounttabnotclicable() throws IOException {
		loginpage l2=new loginpage(driver);
 		l2.username_();
 		l2.pass_();
 		l2.signinbutton_();
  		
 		Homepage h1=new Homepage(driver);
 		h1.amounttab_();
		captureScreenShot(driver, "Amounttabnotclickable");

	}
}
