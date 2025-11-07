package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class LoginPage_TC_001  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="Salesforce Application";
		testDescription="Login page";
		authors="Mahalakshmi";
		category="Sanity";
	}
	
	
	//@Test(dataProvider = "fetchData")
	@Test
	public void login() {
		
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickOnLogin();
	}

}
