package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass
{
	@Given("Enter the companyname as {string}")
	public CreateLeadPage enterCompanyName(String companyName) throws InterruptedException, IOException {
		Thread.sleep(3000);
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		reportStep("Pass", "Company name entered successfully");
        return this;
	}
	@Given("Enter the firstname as {string}")
	public CreateLeadPage enterFirstName(String firstName) throws IOException {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		reportStep("Pass", "First name entered successfully");
        return this;
	}
	@Given("Enter the lastname as {string}")
	public CreateLeadPage enterLastName(String lastName) throws IOException {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		reportStep("Pass", "Last name entered successfully");
        return this;
	}
	@When("Click on the Create Lead button")
	public ViewLeadPage clickCreateLeadButton() throws IOException, InterruptedException {
		getDriver().findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to view lead page successfully");
        return new ViewLeadPage();
	}

}
