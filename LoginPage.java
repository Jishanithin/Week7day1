package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificImplement;

public class LoginPage extends ProjectSpecificImplement {

	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;

	}

	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
		
		
	 	

	}

}
