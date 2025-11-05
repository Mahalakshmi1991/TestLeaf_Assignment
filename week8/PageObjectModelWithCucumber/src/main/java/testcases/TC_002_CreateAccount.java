package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_CreateAccount extends BaseClass
{
	@BeforeTest
	public void setValues()
	{
		filename = "CreateAccount";
		testcaseName = "CreateAccount";
		testcaseDescription = "Create Account";
		testcaseAuthor = "Mahalakshmi";
		testCategory = "Regression";
	}
	
	@Test(dataProvider = "fetchData")
	public void createAccount(String username,String password,String accountName, String countryValue) throws InterruptedException, IOException
	{
		LoginPage login = new LoginPage();
		login.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountName(accountName)
		.selectCountry(countryValue)
		.clickCreateAccountButton()
		.verifyAccountName(accountName);
	}

}
