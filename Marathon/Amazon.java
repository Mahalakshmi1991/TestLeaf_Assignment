package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Launch chrome browser and load url
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		//Search bag for boys
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		String results = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']//span")).getText();
		System.out.println(results+ " bags for boys");
		
		//Apply filter for first 2 bag brands
		driver.findElement(By.xpath("//a[@aria-label = 'Apply the filter Skybags to narrow results']")).click();
		driver.findElement(By.xpath("//a[@aria-label = 'Apply the filter Safari to narrow results']")).click();
		
		//Sort for the new arrival
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//print the bag details and page title
		String bagName= driver.findElement(By.xpath("//a[contains(@class ,'a-link-normal')]/h2/span")).getText();
		System.out.println("The bag name is "+bagName);
		System.out.println("The page title is "+driver.getTitle());
		
		driver.close();

	}

}
