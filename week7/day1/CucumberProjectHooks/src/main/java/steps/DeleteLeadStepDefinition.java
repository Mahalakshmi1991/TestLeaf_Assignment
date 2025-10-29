package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends BaseClass {
	
	@When("Click on the Delete button")
	public void click_on_the_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}

}
