package pages;

import java.io.IOException;


import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass 
{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String username) throws IOException {
		getDriver().findElement(By.id("username")).sendKeys(username);
		reportStep("Pass", "Username entered successfully");
		return this;

	}
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String password) throws IOException {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		reportStep("Pass", "Password entered successfully");
        return this;
	}
	@When("Click on the login button")
	public WelcomePage clickLoginButton() throws IOException, InterruptedException {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Login successfull");
		return new WelcomePage();
	}

}
