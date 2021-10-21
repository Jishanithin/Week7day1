package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificImplement;

public class MyLeadsPage extends ProjectSpecificImplement{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreatebutton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

		}
	
	public FindLeadPage clickFindButton() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
		

	}
	
}
