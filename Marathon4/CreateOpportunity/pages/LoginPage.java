package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername() {
		clearAndType(locateElement(Locators.ID, "username"),prop.getProperty("username"));
		reportStep(" entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword() {
		clearAndType(locateElement(Locators.ID, "password"),prop.getProperty("password"));
		reportStep(" entered successfully","pass");
		return this;
	}

	public HomePage clickOnLogin() {
		click(locateElement("Login"));
		reportStep("Login is Clicked", "pass");
		return new HomePage();
	}

}
