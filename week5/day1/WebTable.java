package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
				
		//load the URL
		driver.get("https://erail.in/");
				
		//Maximize the window and wait for the page to be loading using implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Choose Station from option
		WebElement stationFrom = driver.findElement(By.id("txtStationFrom"));
		stationFrom.clear();
		stationFrom.sendKeys("MS");
		driver.findElement(By.xpath("//div[@title='Chennai Egmore']")).click();
		
		//Choose Station to option
		WebElement stationTo = driver.findElement(By.id("txtStationTo"));
		stationTo.clear();
		stationTo.sendKeys("MDU");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
		
		// clear the date check box
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//List all train names of the web table
		List<WebElement> trainNameElement = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr/td[2]"));
		for(WebElement name:trainNameElement)
		{
			System.out.println(name.getText());
		}
		
		//Loop for duplicate names in the web table
		Boolean isDuplicate = false;
		for(int i = 0;i<trainNameElement.size()-1;i++)
		{
			if(trainNameElement.get(i).getText()==trainNameElement.get(i+1).getText())
			{
				isDuplicate = true;
				
			}
		}
		
		//check the condition and print the statement
		if(isDuplicate)
		{
			System.out.println("Trains list contains duplicate values");
		}
		else
		{
			System.out.println("No duplicate train names");
		}
		
		//close the driver
		driver.quit();
	}

}
