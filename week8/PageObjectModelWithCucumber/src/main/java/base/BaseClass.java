package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests
{
	private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	
	public String filename;
	
	public static ExtentReports extent;
	public String testcaseName, testcaseDescription, testcaseAuthor, testCategory;
	public static ExtentTest test;
	
	public void setDriver()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver.set(new ChromeDriver(options));
	}
	
	public RemoteWebDriver getDriver()
	{
		RemoteWebDriver chromeDriver = driver.get();
		return chromeDriver;
	}
	
	@BeforeMethod
	public void preConditions() 
	{
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	@AfterMethod
	public void postConditions() 
	{
		getDriver().close();

	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] data = ReadExcel.readExcelData(filename);
		return data;
	}
	
	@BeforeSuite
	public void startReport()
	{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./Reports/LeaftapsReports.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	@BeforeClass
	public void testcaseDetails()
	{
		test = extent.createTest(testcaseName, testcaseDescription);
		test.assignAuthor(testcaseAuthor);
		test.assignCategory(testCategory);
	}
	
	public void reportStep(String status, String stepInfo) throws IOException
	{
		try {
			if(status.equalsIgnoreCase("Pass"))
			{
				test.pass(stepInfo,MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/image" + takeSnap() + ".png").build());
			
			}
		}
		catch(Exception e)
		{
			test.fail("Test case failed"+e);
		}
	}
	
	public int takeSnap() throws IOException
	{
		int random = (int)(Math.random()*99999999+99999999);
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps/image" + random +".png");
		
		FileUtils.copyFile(source, destination);
		return random;
		
	}
	
	@AfterSuite
	public void stopReport()
	{
		extent.flush();
	}
}
