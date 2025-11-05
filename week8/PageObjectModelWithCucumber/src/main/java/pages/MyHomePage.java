package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.When;

public class MyHomePage extends BaseClass
{
	@When("Click on the Leads link")
	public MyLeadsPage clickLeadsLink() throws InterruptedException, IOException {
		getDriver().findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to account page successfully");
        return new MyLeadsPage();
	}
	
	@When("Click on the Account link")
	public MyAccountsPage clickAccountsLink() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		getDriver().findElement(By.linkText("Accounts")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to account page successfully");
		return new MyAccountsPage();
	}
}
