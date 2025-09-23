package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guests");
		
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver(opt);
		
		// load the url
		driver.get("https://en-gb.facebook.com/");
		// maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Create new account 
		driver.findElement(By.linkText("Create new account")).click();
		
		//Using find element locate the below elements
		driver.findElement(By.name("firstname")).sendKeys("Maha");
		driver.findElement(By.name("lastname")).sendKeys("P");
		
		Select selectDay = new Select(driver.findElement(By.name("birthday_day")));
		selectDay.selectByValue("7");
		
		Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByValue("6");
		
		Select selectYear = new Select(driver.findElement(By.name("birthday_year")));
		selectYear.selectByValue("1991");
		
		driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("mahalakshmikaveri@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Maha@2019");
		
		Thread.sleep(5000);
		driver.close();
		
	

	}

}
