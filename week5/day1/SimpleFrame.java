package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrame {

	public static void main(String[] args) {
		
		//Launch chrome browser and load url
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Switch to alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Verify the text
		String text = driver.findElement(By.id("demo")).getText();
		if(text.contains("OK"))
		{
			System.out.println("Working Fine");
		}

	}

}
