package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	public MyHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	public MyAccountsPage clickAccountsLink() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountsPage(driver);
	}

}
