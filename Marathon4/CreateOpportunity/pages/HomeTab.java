package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomeTab extends ProjectSpecificMethods {
	
	public CreateOpportunity clickOnOpportunities() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Opportunities']"));
		reportStep("Opportunities tab is clicked", "pass");
		return new CreateOpportunity();
	}
	
	

}
