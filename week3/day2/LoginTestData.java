package week3.day2;

public class LoginTestData extends TestData{
	public void enterUsername()
	{
		System.out.println("Enter the Username : Test");
	}
	public void enterPassword()
	{
		System.out.println("Enter the password : data");
	}

	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();

	}

}
