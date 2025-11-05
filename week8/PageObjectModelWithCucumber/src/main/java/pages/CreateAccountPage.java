package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateAccountPage extends BaseClass {
	
	@Given("Enter the AccountName as {string}")
	public CreateAccountPage enterAccountName(String accountName) throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//input[@id='accountName']")).sendKeys(accountName);
		reportStep("Pass", "Account name entered successfully");
		return this; 
	}
	
	@When("Select the country")
	public CreateAccountPage selectCountry(String value) throws IOException
	{
		WebElement countryElement = getDriver().findElement(By.id("generalCountryGeoId"));
		Select select = new Select(countryElement);
		select.selectByValue(value);
		reportStep("Pass", "Country selected successfully");
		return this;
	}
	@When("Click on the Create Account button")
	public ViewAccountPage clickCreateAccountButton() throws InterruptedException, IOException
	{
		getDriver().findElement(By.xpath("//input[@value='Create Account']")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to account page successfully");
		return new ViewAccountPage();
	}
	

}
