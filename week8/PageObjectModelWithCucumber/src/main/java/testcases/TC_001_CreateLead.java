package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValues()
	{
		filename = "CreateLead";
		testcaseName = "Create Lead";
		testcaseDescription = "Create lead with multiple data";
		testcaseAuthor = "Mahalakshmi";
		testCategory = "Regression";
	}
	@Test(dataProvider = "fetchData")
	public void createLead(String username,String password,String companyName,String firstName,String lastName) throws InterruptedException, IOException {
		LoginPage lp=new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyLead();

	}

}
