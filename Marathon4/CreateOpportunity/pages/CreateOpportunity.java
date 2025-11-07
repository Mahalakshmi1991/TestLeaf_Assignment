package com.salesforce.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateOpportunity extends ProjectSpecificMethods {
	
	public CreateOpportunity clickOnNewButton() throws InterruptedException
	{
		Thread.sleep(1000);
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='New']"));
		reportStep("New button is clicked", "pass");
		return this;
	}
	
	public CreateOpportunity enterOpportunityName(String opportunityName) throws InterruptedException
	{
		Thread.sleep(1000);
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Name']"),opportunityName);
		return this;
	}
	
	public CreateOpportunity selectStageName() 
	{
		click(locateElement(Locators.XPATH,"//button[@aria-label='Stage']"));
		click(locateElement(Locators.XPATH,"//lightning-base-combobox-item[@data-value='Needs Analysis']/span[2]//span"));
		return this;
	}
	public CreateOpportunity selectCloseDate()
	{
		LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		clearAndType(locateElement(Locators.XPATH, "//input[@name='CloseDate']"),currentDate.format(formatter));
		return this;
	}
	public ViewOpportunity clickOnSave()
	{
		click(locateElement(Locators.XPATH,"//button[@name ='SaveEdit']"));
		return new ViewOpportunity();
	}

}
