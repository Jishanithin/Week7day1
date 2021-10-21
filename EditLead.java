package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificImplement;
import pages.LoginPage;

public class EditLead extends ProjectSpecificImplement {
	@BeforeTest
	public void setFileName() {
		excelFileName = "EditLead";
	}

	@Test(dataProvider = "fetchData")
	public void runEditLead(String username, String password,String firstName,String compaName) throws InterruptedException {
		new LoginPage(driver).enterUserName(username).enterPassword(password).clickLoginButton().crmsfaLink()
				.clickLeads().clickFindButton().findName(firstName).submitFindButton().selectFirstId().clickEditButton()
				.editCompanyName(compaName).clickUpdatebutton();
	}

}
