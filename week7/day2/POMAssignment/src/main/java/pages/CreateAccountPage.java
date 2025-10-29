package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {
	public CreateAccountPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateAccountPage enterAccountName(String accountName) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accountName);
		return this; 
	}
	
	public CreateAccountPage selectCountry(String value)
	{
		WebElement countryElement = driver.findElement(By.id("generalCountryGeoId"));
		Select select = new Select(countryElement);
		select.selectByValue(value);
		return this;
	}
	
	public ViewAccountPage clickCreateAccountButton()
	{
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		return new ViewAccountPage(driver);
	}
	

}
