package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificImplement;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificImplement{
	@BeforeTest
	public void setFileName() {
		excelFileName="MergeLead";
	}
@Test(dataProvider="fetchData")
	public void runMergeLead(String username,String password,String name) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName(username).enterPassword(password).clickLoginButton()
		.crmsfaLink().clickLeads().clickMergeLeads().fromId().selectfirstname(name).clickmfindLead()
		.selectFirstM().toId().clickOne().clickMerge().alert();
}

}
