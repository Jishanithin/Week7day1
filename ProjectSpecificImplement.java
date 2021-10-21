package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificImplement {
	public ChromeDriver driver;
	
	public String excelFileName;
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(excelFileName);
	}
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
			
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}


