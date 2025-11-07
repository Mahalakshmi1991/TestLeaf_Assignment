package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewOpportunity extends ProjectSpecificMethods {
	
	public ViewOpportunity verifyName( String opportunityName)
	{
		String getName = getElementText(locateElement(Locators.XPATH, "//lightning-formatted-text[@slot = 'primaryField']"));
		String[] opportunity_Name = getName.split(" ");
		System.out.println(opportunity_Name[3]);
		if(opportunity_Name[3].equalsIgnoreCase(opportunityName))
		{
			reportStep("Opportunity name is verified","pass");
		}
		return this;
	}

}
