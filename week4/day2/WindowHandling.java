package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class WindowHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//Step1 create set and all windows
		Set<String> getAllAddress = driver.getWindowHandles();
		
		//Step2 convert Set to List
		List<String> getListOfAddress = new ArrayList<String>(getAllAddress);
		
		//Step3 switch driver focus to child window
		driver.switchTo().window(getListOfAddress.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(getListOfAddress.get(0));
		driver.close();
	}

}
