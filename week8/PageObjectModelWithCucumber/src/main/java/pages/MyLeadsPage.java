package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.When;

public class MyLeadsPage extends BaseClass 
{
	
	@When("Click on the Create Lead link") 
	public CreateLeadPage clickCreateLeadLink() throws IOException, InterruptedException {
		getDriver().findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		reportStep("Pass", "Redirected to lead page successfully");
        return new CreateLeadPage(); 
	}

}
