package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage clickOnToggleButton()
	{
		click(locateElement(Locators.XPATH,"//div[@class='slds-icon-waffle']"));
		reportStep("Toggle is Clicked", "pass");
		return this;
	}
	
	public HomeTab clickOnViewAllButton() throws InterruptedException
	{
		
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		Thread.sleep(1000);
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		return new HomeTab();
	}
}
