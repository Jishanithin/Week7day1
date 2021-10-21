package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificImplement;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificImplement{
	@BeforeTest
	public void setFileName() {
		excelFileName = "DeleteLead";
	}

	@Test(dataProvider = "fetchData")
	public void runDeleteLead(String username, String password,String firstName) throws InterruptedException {
		new LoginPage(driver).enterUserName(username).enterPassword(password).clickLoginButton().crmsfaLink()
		.clickLeads().clickFindButton().findName(firstName).submitFindButton().selectFirstId().clickDeleteButton();
	}

}
