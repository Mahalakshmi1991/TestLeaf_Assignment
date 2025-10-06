package week4.day1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class ListOfPhones 
{	
	public static void main(String[] args) 
	{
		//Launch chrome browser and load url
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		//Search phones in the search tab
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//find all the price value elements and assign it to list of Web elements
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int[] price = new int[elements.size()];
		
		// iterate each price values and assign it to array variable
		for(int i=0; i < elements.size(); i++)
		{
			price[i]= Integer.parseInt(elements.get(i).getText().replace(",", ""));
		}
		//do sorting and print least price value
		Arrays.sort(price);
		System.out.println(price[0]);

	}

}
