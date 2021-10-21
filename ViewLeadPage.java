package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificImplement;

public class ViewLeadPage extends ProjectSpecificImplement{

	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadPage verifyFirstName(String firstname) {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstname,text);
		return this;

		}
	
	public OpenTapsCRMPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
return new OpenTapsCRMPage(driver);
	}
	public MyLeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
return new MyLeadsPage(driver);
	}
}
