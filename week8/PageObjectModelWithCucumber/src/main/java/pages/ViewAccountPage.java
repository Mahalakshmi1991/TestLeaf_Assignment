package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewAccountPage extends BaseClass{
	
	public void verifyAccountName(String accountName) throws IOException
	{
		String text = getDriver().findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
		String[] account_Name = text.split(" ");
		if(accountName.equals(account_Name[0]))
		{
			System.out.println("Account Name verified");
			reportStep("Pass", "Account name verified");
		}
		
	}
}
