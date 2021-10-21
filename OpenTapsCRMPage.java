package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificImplement;

public class OpenTapsCRMPage extends ProjectSpecificImplement {

	public OpenTapsCRMPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public OpenTapsCRMPage editCompanyName(String compaName) {
		WebElement newComName = driver.findElement(By.id("updateLeadForm_companyName"));
		newComName.clear();
		newComName.sendKeys(compaName);
		return this;
	}

	public ViewLeadPage clickUpdatebutton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage(driver);
	}

}
