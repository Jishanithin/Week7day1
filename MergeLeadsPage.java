package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificImplement;

public class MergeLeadsPage extends ProjectSpecificImplement {
	Set<String> windowHandles;
	List<String> listwin;
	Set<String> allWindows2;
	List<String> allhandles2;
	
	public MergeLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MergeLeadsPage fromId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	 windowHandles = driver.getWindowHandles();
 listwin=new ArrayList<String>(windowHandles);
driver.switchTo().window(listwin.get(1));
return this;
	}
	
	public MergeLeadsPage selectfirstname(String name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys(name);

		return this;
	}
	
	public MergeLeadsPage clickmfindLead() {
		driver.findElement(By.xpath("//button[@type='button']")).click();
return this;
	}
	
	
	public MergeLeadsPage selectFirstM() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(listwin.get(0));
		return this;
	}
	public MergeLeadsPage toId() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
allWindows2 = driver.getWindowHandles();
		 allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;

	}
	
	public MergeLeadsPage clickOne() {
	driver.findElement(By.xpath("//a[@class='linktext']")).click();
	driver.switchTo().window(allhandles2.get(0));
	return this;

	}
	public MergeLeadsPage clickMerge() {
		driver.findElement(By.className("buttonDangerous")).click();
		return this;

	}
	public ViewLeadPage alert() {
driver.switchTo().alert().accept();
return new ViewLeadPage(driver);
	}
	
	
	
}
