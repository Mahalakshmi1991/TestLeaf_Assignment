package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLogin extends BaseClass {
	
	@BeforeTest
	public void setValues()
	{
		filename = "Login";
		testcaseName = "Login";
		testcaseDescription = "Login success";
		testcaseAuthor = "Mahalakshmi";
		testCategory = "Regression";
	}
	@Test(dataProvider = "fetchData")
	public void Login(String username,String password) throws InterruptedException, IOException {
		LoginPage lp=new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();

	}

}
