package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_Logout extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setValues()
	{
		filename = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logout(String username,String password)
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickLogoutButton();
	}

}
