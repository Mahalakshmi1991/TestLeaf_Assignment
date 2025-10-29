package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethod 
{
	@BeforeTest
	public void setValues()
	{
		filename = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String username, String password)
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();
		
	}
}
