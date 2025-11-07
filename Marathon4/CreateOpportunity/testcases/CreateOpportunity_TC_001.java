package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class CreateOpportunity_TC_001 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		excelFileName="CreateOpportunity";
		testcaseName="Salesforce Application";
		testDescription="Opportunity";
		authors="Mahalakshmi";
		category="Sanity";
	}
	
	@Test(dataProvider = "fetchData")
	public void createOpportunity(String opportunityName) throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickOnLogin()
		.clickOnToggleButton()
		.clickOnViewAllButton()
		.clickOnOpportunities()
		.clickOnNewButton()
		.enterOpportunityName(opportunityName)
		.selectStageName()
		.selectCloseDate()
		.clickOnSave()
		.verifyName(opportunityName);
		
		
	}

}
