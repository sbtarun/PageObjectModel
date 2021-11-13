package testcases;

import org.testng.annotations.Test;

import base.BaseClassLead;
import pages.LoginPage;

public class VerifyLogin extends BaseClassLead {

	@Test
	public void runVerifyLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.verifyLogin();
	}
}
