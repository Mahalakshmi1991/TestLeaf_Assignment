package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLegalEntity extends BaseClass {
	
	@DataProvider(name = "FetchData")
	public String[][] sendData_LegalEntity()
	{
		String[][] data = new String [2][1];
		data[0][0] = "Salesforce Automation by Mahalakshmi";
		data[1][0]=  "Salesforce Automation by test";
		return data;
	}
	
	@Test(dataProvider = "FetchData")
	public void LegalEntity(String legalName) throws InterruptedException {
	//Implicit wait is added to the toggle click event
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
		
		//Click on the toggle menu
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']"))).click();
		
		// wait is added for the particular click event
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait time is needed for application loading 
		Thread.sleep(3000);
		
		//Click on the view all button
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']"))).click();
		
		//Create an action  
		Actions action = new Actions(driver);
		
		//find the element to perform the action
		
		WebElement legalEntityClick = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
				
		//Perform the scroll to element action
		action.scrollToElement(legalEntityClick).perform();
				
		//Click on the Legal Entities link
		legalEntityClick.click();
		
		driver.navigate().refresh();
		//Click on the new button to create new legal entities
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(legalName);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getText();
		System.out.println(text);

	}

}
