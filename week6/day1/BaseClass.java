package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	
	public ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void PreConditions(String url,String username,String password)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--user-data-dir=C:\\Users\\Public\\SeleniumProfile");
		
		//Launch the browser
		driver = new ChromeDriver(option);
		
		//load the URL
		driver.get(url);
		
		//Maximize the window and wait for the page to be loading using implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login into to salesforce appln. with credentials and click login
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void PostConditions()
	{
		//quit the chrome driver
		if(driver != null)
		{
			driver.quit();
		}
	}

}
