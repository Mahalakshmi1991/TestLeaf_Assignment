package week2.day1;

public class Browser {
	
	public void launchBrowser(String browserName)
	{
		System.out.println("Browser is " +browserName);
	}
	public String loadUrl()
	{
		return "Url loaded successfully";
	}
	
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.launchBrowser("Chrome");
		String str = browser.loadUrl();
		System.out.println(str);
	}

}
