package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditTestLeafLead 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		//Launch chrome browser and load url
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//login to the test leaf application using web driver
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
				//Navigate to lead tab
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
				
				//Create Lead using web driver
		driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter the values createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Verizon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lax");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Developer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lakshmi is a lead developer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lax@gmail.com");
		Select selectState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		selectState.selectByValue("CA");
				
		driver.findElement(By.name("submitButton")).click();
		
		//Edit Lead using web driver
		driver.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Developer");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
        String title = driver.getTitle();
        System.out.println("The title of the page is " + title);
		

	}

}
