package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	public WelcomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	public MyHomePage clickCRMSFALink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public LoginPage clickLogoutButton()
	{
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
		return new LoginPage(driver);
	}

}
