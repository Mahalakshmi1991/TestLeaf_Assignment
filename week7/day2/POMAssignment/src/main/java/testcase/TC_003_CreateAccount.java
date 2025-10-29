package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethod
{
	@BeforeTest
	public void setValues()
	{
		filename = "CreateAccount";
	}
	
	@Test(dataProvider = "fetchData")
	public void createAccount(String username,String password,String accountName, String countryValue) throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountName(accountName)
		.selectCountry(countryValue)
		.clickCreateAccountButton()
		.verifyAccountName(accountName);
	}

}
