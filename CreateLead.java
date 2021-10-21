package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificImplement;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificImplement{
	@BeforeTest
	public void setFileName() {
		excelFileName="AssignCreateLead";
	}
@Test(dataProvider="fetchData")
	public void runCreateLead(String username,String password,String company,String firstName,String lastName) {
		new LoginPage(driver)
		.enterUserName(username).enterPassword(password).clickLoginButton().crmsfaLink().clickLeads().clickCreatebutton()
		.enterCompanyName(company).enterFirstName(firstName).enterLastName(lastName).clickCreateLead().verifyFirstName(firstName);
	}

}
