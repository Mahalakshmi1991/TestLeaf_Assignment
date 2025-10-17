package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class SalesForce extends ProjectSpecificMethod {
	@Test
	public void LegalEntity() throws InterruptedException {
		
		Thread.sleep(50000);
		//Click on the toggle menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//wait for the application launcher to load all the applications
		Thread.sleep(5000);
		
		//Click view all link
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		//Create an action  
		Actions action = new Actions(driver);
		
		//find the element to perform the action
		WebElement legalEntityClick = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		//Perform the scroll to element action
		action.scrollToElement(legalEntityClick).perform();
		
		//Click on the Legal Entities link
		legalEntityClick.click();
		
		//wait for the page to load
		Thread.sleep(5000);
		
		//Click on the new button to create new legal entities
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Maha");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//label[text()='Description']/following::div//textarea")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//button[@aria-label = 'Status']")).click();
		driver.findElement(By.xpath("//span[@title='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String legalEntityName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println(legalEntityName);
	}

}
