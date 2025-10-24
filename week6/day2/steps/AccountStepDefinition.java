package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountStepDefinition {
	
	public ChromeDriver driver;
	

@Given("Launch the browser")
public void launch_the_browser() {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	option.addArguments("--user-data-dir=C:\\Users\\Public\\SeleniumProfile");
	
	driver = new ChromeDriver(option);
}

@Given("Load the url")
public void load_the_url() {
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("Enter the Username as {string}")
public void enter_the_username_as(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
}

@Given("Enter the Password as {string}")
public void enter_the_password_as(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	
}

@When("Click on the log in button")
public void click_on_the_log_in_button() {
	driver.findElement(By.id("Login")).click();
}

@When("Click on the toggle icon from the left corner")
public void click_on_the_toggle_icon_from_the_left_corner() {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']"))).click();
}

@When("Click on the View All link")
public void click_on_the_view_all_link() throws InterruptedException {
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
	Thread.sleep(3000);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']"))).click();
}

@When("Click on the Sales app")
public void click_on_the_sales_app() {
	driver.findElement(By.xpath("//div[@data-name='Sales']")).click();
}

@When("Click on the account tab")
public void click_on_the_account_tab() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Account']")).click();
}

@When("Click on the New Account")
public void click_on_the_new_account() throws InterruptedException {
	driver.findElement(By.xpath("//a[@title='New']")).click();
}

@Given("Enter the Account Name as {string}")
public void enter_the_account_name_as(String accountName) {
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountName);
}

@Given("Select the Ownership as Public")
public void select_the_ownership_as_public() {
	driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
	driver.findElement(By.xpath("//span[@title='Public']")).click();
}

@When("Click on the Save button")
public void click_on_the_save_button() {
	driver.findElement(By.xpath("//li[@data-target-selection-name = 'sfdc:StandardButton.Account.SaveEdit']")).click();
}

@Then("Verify the Account name as {string}")
public void verify_the_account_name_as(String accountName) {
	String accName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
	if(accName.equals(accountName))
	{
		System.out.println("Account name is verified");
	}
	
}

}
