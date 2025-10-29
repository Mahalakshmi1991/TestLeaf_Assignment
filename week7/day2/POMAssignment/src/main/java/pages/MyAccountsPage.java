package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyAccountsPage extends ProjectSpecificMethod{
	public MyAccountsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	public CreateAccountPage clickCreateAccountLink() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		return new CreateAccountPage(driver);
	}

}
