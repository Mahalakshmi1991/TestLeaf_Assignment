package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		//Launch Chrome
		ChromeDriver chromeDriver = new ChromeDriver();
		
		//Load URL
		chromeDriver.get("https://www.facebook.com");
		
		//maximize windows
		chromeDriver.manage().window().maximize();
		
		//Locate username and enter username
		chromeDriver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Locate password and enter password
		chromeDriver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Locate login button and click login
		chromeDriver.findElement(By.name("login")).click();
		
		//locate title and print the title text
		System.out.println("THe title of the page is"+ chromeDriver.getTitle());
		
		
		

	}

}
