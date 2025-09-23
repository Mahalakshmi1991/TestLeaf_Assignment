package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateTestLeafAccount {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("guest");
		
		//Launch chrome browser
		ChromeDriver driver =new ChromeDriver(chromeOptions);
		
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String accountName ="MahaTesting";
		
		//login to the test leaf application using web driver
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();

		//Create the account using web driver
		
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter the values and selecting values
		
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		Select selectIndustry = new Select(driver.findElement(By.name("industryEnumId")));
		selectIndustry.selectByIndex(2);
		
		Select selectOwnership = new Select(driver.findElement(By.name("ownershipEnumId")));
		selectOwnership.selectByVisibleText("S-Corporation");
		
		Select selectSource = new Select(driver.findElement(By.id("dataSourceId")));
		selectSource.selectByValue("LEAD_EMPLOYEE");
		
		Select selectMarketingCampaign = new Select(driver.findElement(By.id("marketingCampaignId")));
		selectMarketingCampaign.selectByIndex(6);
		
		Select selectState = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		selectState.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify the created account name displayed is correct or not.
		
		WebElement accountNameSpan = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
		Boolean checkAccount = accountNameSpan.getText().contains(accountName);
		if(checkAccount)
		{
			System.out.println("Verified");
		}
		
		Thread.sleep(5000);
		
		//close the window using web driver
		driver.close();

	}

}
