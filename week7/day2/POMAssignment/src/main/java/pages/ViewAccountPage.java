package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod{
	public ViewAccountPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	public void verifyAccountName(String accountName)
	{
		String text = driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
		String[] account_Name = text.split(" ");
		if(accountName.equals(account_Name[0]))
		{
			System.out.println("Account Name verified");
		}
	}
}
