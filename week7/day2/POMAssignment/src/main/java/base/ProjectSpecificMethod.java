package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	public String filename;
	@BeforeMethod
	public void preConditions()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postConditions()
	{

	}
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] data = ReadExcel.readExcelData(filename);
		return data;
	}

}
