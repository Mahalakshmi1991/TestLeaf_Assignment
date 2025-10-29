package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass {
	
	@When("Click on the Leads tab")
	public void click_on_the_leads_tab() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on the Find Leads")
	public void click_on_the_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on the Phone Menu")
	public void click_on_the_phone_menu() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the Phone number as {string}")
	public void enter_the_phone_number_as(String string) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}

	@When("click on the Find Leads button")
	public void click_on_the_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	}

	@When("Click on the first row of leaf table")
	public void click_on_the_first_row_of_leaf_table() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on the Edit button")
	public void click_on_the_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Enter the Company Name as {string}")
	public void enter_the_company_name_as(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}

	@When("Click on the Update button")
	public void click_on_the_update_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify the view lead page")
	public void verify_the_view_lead_page() {
	    System.out.println("Verified");
	}

}
