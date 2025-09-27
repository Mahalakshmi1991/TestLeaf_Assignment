package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteTestLeafLead {

	public static void main(String[] args) throws Exception {
		
		String msg = "No records to display";
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
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name= 'firstName']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[0]")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		//find the deleted record
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name= 'firstName']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name= 'companyName']")).sendKeys("Verizon");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(4000);
		
		String textMsg = driver.findElement(By.xpath("//div[contains(text(), 'No records to display')]")).getText();
		if(textMsg.toLowerCase() == msg.toLowerCase())
		{
			System.out.println("Deleted Successfully");
		}
		

	}

}
