package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTestLeafLead {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver(opt);
		
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String LeadTitle = "Software Developer";
		
		//login to the test leaf application using web driver
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		//Create Lead using web driver
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the values
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(LeadTitle);
		
		driver.findElement(By.name("submitButton")).click();
		
		//Verify the created lead title is same or not
		String titleText= driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		if(LeadTitle.contains(titleText))
		{
			System.out.println("Title is same");
		}
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
