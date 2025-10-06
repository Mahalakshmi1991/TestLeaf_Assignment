package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingInTestLeaf 
{
	public static void main(String[] args) throws Exception
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
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		Set<String> openFirstWindowcontact= driver.getWindowHandles();
		List<String> firstWContacts = new ArrayList<String>(openFirstWindowcontact);
		
		driver.switchTo().window(firstWContacts.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(firstWContacts.get(0));//
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		Set<String> openSecondWindowcontact= driver.getWindowHandles();
		List<String> secondWContacts = new ArrayList<String>(openSecondWindowcontact);
		
		driver.switchTo().window(secondWContacts.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(secondWContacts.get(0));//
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	
	}

}
