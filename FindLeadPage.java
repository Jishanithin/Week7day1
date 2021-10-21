package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificImplement;

public class FindLeadPage extends ProjectSpecificImplement {

	public FindLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadPage findName(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;

	}
	
	public FindLeadPage submitFindButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;

	}
	
	
	public ViewLeadPage selectFirstId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
return new ViewLeadPage(driver);
	}
	

}
