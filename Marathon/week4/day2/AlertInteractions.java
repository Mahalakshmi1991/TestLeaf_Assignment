package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {

		//Launch chrome browser and load url
		String text ="Hello";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//Find the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch to alert popup using Alert Interface and send message 
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(text);
		promptAlert.accept();
		
		//Retrieve text from the parent window
		String value =driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		String values[]=value.split(":");
		if(text.equalsIgnoreCase(values[1].trim()))
		{
			System.out.println("Text are same");
		}
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch to alert popup using Alert Interface and click cancel button
		Alert promptAlert2 = driver.switchTo().alert();
		promptAlert2.dismiss();
	}

}
