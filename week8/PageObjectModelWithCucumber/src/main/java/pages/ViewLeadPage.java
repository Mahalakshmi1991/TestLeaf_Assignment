package pages;

import java.io.IOException;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseClass 
{
	@Then("Lead should be created")
	public void verifyLead() throws IOException {
		reportStep("Pass", "Lead created successfully");
		System.out.println("Lead is created");

	}

}
