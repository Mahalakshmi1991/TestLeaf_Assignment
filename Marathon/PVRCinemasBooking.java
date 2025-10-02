package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRCinemasBooking 
{	
	public static void main(String[] args) throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Launch chrome browser and load url
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		//Click on Cinema and select the required fields for booking
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='PVR Sathyam Royapettah Chennai']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("//span[text()='LOKAH CHAPTER 1 CHANDRA']")).click();
		driver.findElement(By.xpath("//span[text()='10:50 PM']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Click on accept term and conditions
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(1000);
		
		//select the seat  and click submit
		driver.findElement(By.xpath("//span[@class ='seat-current-pvr']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//get the seat and amount details and print on the console
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("The page title is "+ driver.getTitle());
		System.out.println("The seat summary as follows "+ seatInfo);
		System.out.println("The grand total is "+ grandTotal);
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		
		Thread.sleep(1000);
		//close the popup icon
		driver.findElement(By.xpath(("(//i[@class='pi pi-times'])[2]"))).click();  
		driver.close();
		
	}

}
