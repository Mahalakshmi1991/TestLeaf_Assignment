package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.When;

public class MyAccountsPage extends BaseClass{
	
	@When("Clik on the Create Account link")
	public CreateAccountPage clickCreateAccountLink() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//a[text()='Create Account']")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to create account page successfully");
		return new CreateAccountPage();
	}

}
