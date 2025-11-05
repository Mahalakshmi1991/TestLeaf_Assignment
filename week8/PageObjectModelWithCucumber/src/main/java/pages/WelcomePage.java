package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass
{
	@Then("It should navigate to next page")
	public void verifyLogin()
	{
		System.out.println("Login Successfull");
	}
	@When("Click on the Crmsfa link")
	public MyHomePage clickCrmsfaLink() throws IOException, InterruptedException {
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to home page successfully");
        return new MyHomePage();
	}

}
