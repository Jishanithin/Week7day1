package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificImplement;
import pages.LoginPage;

public class LoginLogout extends ProjectSpecificImplement{

	@Test
		public void runLogin() {
		LoginPage lp=	new LoginPage(driver);
		lp.enterUserName("Demosalesmanager").enterPassword("crmsfa").clickLoginButton();
		
		}


}
