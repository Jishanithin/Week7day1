package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.ProjectSpecificImplement;

public class HomePage extends ProjectSpecificImplement{

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
		
	}
	public MyHomepage crmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomepage(driver);

		}
	
	
}
